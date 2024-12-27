package A5DP;

import java.util.Arrays;

public class A501DpBasic {
    public static void main(String[] args) {
//        1,4,5로 13을 만들 수 있는 조합 중에 가장 작은 조합의 개수

        int target = 13;
        int[] numbers = {1,4,5};
        int[] arr = new int[target+1];
        arr[1] = 1;
        for(int i=2;i<arr.length;i++){
            int min = Integer.MAX_VALUE;
            for(int n : numbers){
                if(i-n>=0&&min>arr[i-n]){
                    min = arr[i-n];
                }
            }
            arr[i] = min+1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
