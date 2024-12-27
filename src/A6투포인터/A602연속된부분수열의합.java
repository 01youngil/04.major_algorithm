package A6투포인터;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A602연속된부분수열의합 {
    public static void main(String[] args) {
        int[] sequence = {1,2,3,4,5};
        int k = 7;
//        int[] sequence = {1,1,1,2,3,4,5};
//        int k = 5;

        int[] answer = new int[2];
        List<int[]>myList = new ArrayList<>();

        int start = 0;
        int end = 0;
        int total = sequence[0];

        while(start<=end && end<sequence.length){
            if(sequence[start]==k){
                myList.add(new int[]{start,start,0});
                break;
            }else if(total==k){
                myList.add(new int[]{start,end,end-start});

                end++;
                if(end<sequence.length) {
                    total += sequence[end];
                }

            }else if(total<k){
                end++;
                if(end<sequence.length) {
                    total += sequence[end];
                }
            }else if(total>k){
                total-=sequence[start];
                start++;
            }
        }

        int a = myList.get(0)[2];
        for(int i =0;i<myList.size();i++){
            a = Math.min(a,myList.get(i)[2]);
        }

        for(int i =0;i<myList.size();i++){
            if(myList.get(i)[2]==a){
                answer = new int[]{myList.get(i)[0], myList.get(i)[1]};
                break;
            }
        }
        System.out.println(Arrays.toString(answer));


    }
}
