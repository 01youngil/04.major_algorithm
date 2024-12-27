package A5DP;


import java.util.ArrayList;
import java.util.List;

public class A502멀리뛰기 {
    public static void main(String[] args) {
        int n = 2000;

        long answer = 0;
        List<Long> myList = new ArrayList<>();
        myList.add(0L);
        myList.add(1L);
        myList.add(2L);
        if(n==1||n==2){
//            return n;
            System.out.println(n);
        }else {
            for (int i = 3; i < n; i++) {
                myList.add(myList.get(i - 2) % 1234567 + myList.get(i - 1) % 1234567);
            }
            answer = (myList.get(n - 2) + myList.get(n - 1)) % 1234567;

//            return answer;
            System.out.println(answer);
        }

    }
}
