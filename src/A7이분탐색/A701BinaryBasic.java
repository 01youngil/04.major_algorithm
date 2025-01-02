package A7이분탐색;

public class A701BinaryBasic {
    public static void main(String[] args) {
//        이분탐색은 사전에 데이터가 오름차순 정렬이 되어 있어야 가능한 알고리즘.
        int[] arr = {1,3,5,7,9,11,13,15,17,19};
        int target = 17;
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
            }
        }
        System.out.println(answer);

    }
}
