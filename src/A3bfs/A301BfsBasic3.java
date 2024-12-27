package A3bfs;

import java.util.*;

public class A301BfsBasic3 {
    public static void main(String[] args) {
        int[][] edge = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 4}};
//        0~4번노드까지의 최단거리 구하기
        int targetNode = 4;

        List<List<Integer>> adjList = new ArrayList<>();

        for(int i=0;i<5;i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] a:edge){
            adjList.get(a[0]).add(a[1]);
            adjList.get(a[1]).add(a[0]);
        }
        for(List<Integer> a : adjList){
            a.sort(Comparator.naturalOrder());
        }

        boolean[] visited = new boolean[5];

        int[] distance = new int[5];

        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(0);
        visited[0] = true;
        while(!myQueue.isEmpty()){
            int temp = myQueue.poll();
//            System.out.println(temp);
            for(int target : adjList.get(temp)){
                if(!visited[target]) {
                    myQueue.add(target);
                    visited[target] = true;
                    distance[target] = distance[temp] + 1;
                    if(target==targetNode){
//                        targeNode를 발견시 더이상의 distance를 구하기 위한 작업 불필요
                        break; // 또는 return
                    }
                }
            }
        }
        System.out.println(distance[targetNode]);
    }
}
