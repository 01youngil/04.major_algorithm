package A7이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A0702수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] input1 = br.readLine().split(" ");
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(input1[i]);
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        String[] input2 = br.readLine().split(" ");
        int[] arr2 = new int[M];
        for(int i=0;i<M;i++){
            arr2[i] = Integer.parseInt(input2[i]);
        }

        for(int i=0;i<M;i++){
//            if((Arrays.binarySearch(arr,arr2[i]))<0){
//                System.out.println(0);
//            }else {
//                System.out.println(1);
//            }
            int low = 0;
            int high = N-1;
            int answer = 0;
            while(low<=high){
                int mid = (low+high)/2;
                if(arr[mid]==arr2[i]){
                    answer = 1;
                    break;
                }else if(arr[mid]<arr2[i]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
            System.out.println(answer);

        }
    }
}
