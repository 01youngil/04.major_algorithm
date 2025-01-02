package A7이분탐색;

import java.util.Arrays;

public class A701BinaryBasic2 {
    public static void main(String[] args) {
//        target이 arr에 있다면 index값 return
//        target이 arr에 없다면 있어야할 자리의 index값 return
        int[] arr = {1,3,5,7,9,11,13,15,17,19};
        int target = 2;
        int answer = -1;

        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int middle = (low+high)/2;
            if(arr[middle]==target){
                answer = middle;
                break;
            }else if(arr[middle]<target){
                low = middle+1;
            }else{
                high = middle-1;
                answer = middle;
            }
        }
        System.out.println(answer);
//        값이 없을때 있어야할 index // -(idex+1)
        System.out.println(Arrays.binarySearch(arr,0));
        int answer2 = Arrays.binarySearch(arr,2);

        if(answer<0){
            System.out.println(Math.abs(answer2)-1);
        }else{
            System.out.println(answer2);
        }

    }
}
