package A5DP;

public class A504땅따먹기 {
    public static void main(String[] args) {
        int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};

        int answer = 0;

        for(int i=1;i<land.length;i++){
            for(int j=0;j<4;j++){
                int temp = land[i][j];
                for(int k=0;k<4;k++){
                    if(j==k)continue;
                    land[i][j] = Math.max(temp+land[i-1][k],land[i][j]);
                }
            }
        }
        for(int a : land[land.length-1]){
            answer = Math.max(answer,a);
        }
        System.out.println(answer);
    }
}
