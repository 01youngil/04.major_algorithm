package A7이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A703과자나눠먹기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");

        int n = Integer.parseInt(input1[0]);
        int m = Integer.parseInt(input1[1]);


        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(input2[i]);
        }

        Arrays.sort(arr);

        int start=1;
        int end=arr[arr.length-1];
        int answer = 0;
        while (start <= end){
            int mid = (start+end)/2;
            int total = 0;
            for(int i=0; i<arr.length; i++){
                total += arr[i]/mid;
            }
            if(total < n){
                end = mid-1;
            } else if (total >= n) {
                start = mid+1;
                answer=mid;
            }
        }
        System.out.println(answer);
    }
}
