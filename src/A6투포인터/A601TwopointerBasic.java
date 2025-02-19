package A6투포인터;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A601TwopointerBasic {
    public static void main(String[] args) {
//         아래배열에서 target이 될 수 있는 두 수의 조합을 모두 찾아내어라
//        배열에는 중복된 수는 없다고 가정.
        int[] nums = {7,8,9,2,4,5,1,3,6};
        int target = 10;
        List<int[]>myList = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]+nums[j]==target){
                    myList.add(new int[]{nums[i],nums[j]});
                }
            }
        }
        System.out.println(Arrays.deepToString(myList.toArray()));

//    투포인터를 활용한 조합찾기
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        List<int[]>myList2 = new ArrayList<>();

        int start = 0;
        int end = nums.length-1;
        while(start<end){
            if(nums[start]+nums[end]<target){
                start++;
            }else if(nums[start]+nums[end]>target){
                end--;
            }else{
                myList2.add(new int[] {nums[start],nums[end]});
                start++;
            }
        }
        System.out.println(Arrays.deepToString(myList2.toArray()));


    }
}
