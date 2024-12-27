package A6투포인터;

public class A603숫자의표현 {
    public static void main(String[] args) {
        int n = 15;

        int answer = 0;
        int start = 1;
        int end = 2;
        int total = 3;
        int count = 0;


        while(start<=end&&end<=n){
            if(total<n){
                end++;
                total+=end;
            }else if(total>n){
                total-=start;
                start++;
            }else{
                count++;
                end++;
                total+=end;
            }
        }
        answer = count;
        System.out.println(answer);
    }
}
