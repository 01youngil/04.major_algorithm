package A4greedy;


import java.util.*;

public class A403구명보트 {
    public static void main(String[] args) {
        int[] people = {40,40,50,80,140,160,200,220,240};
        int count = 0;

        Deque<Integer> dq = new ArrayDeque<>();
        Arrays.sort(people);
        for(int a : people){
            dq.addFirst(a);
        }
        System.out.println(dq);
        while(!dq.isEmpty()) {
            int a = dq.pollFirst();
//            count++;
            System.out.println(a);
            for(int i=0;i<dq.size()-1;i++) {
                int b = dq.pollFirst();
                System.out.println(b);
                if (a + b > 240) {
                    dq.addLast(b);
                }else{
                    dq.addLast(b);
                    for(int j=0;j<dq.size()-1-i;j++){
                        int c = dq.pollFirst();
                        dq.addLast(c);
                    }
                }
            }
        }
        System.out.println(count);


    }
}
