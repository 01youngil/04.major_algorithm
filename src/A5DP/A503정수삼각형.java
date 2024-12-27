package A5DP;

import java.util.Arrays;

public class A503정수삼각형 {
    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};

        int answer = 0;

        for(int i=1;i<triangle.length;i++){
            for(int j=0;j<=i;j++){
                if(j==0){
                    triangle[i][j] = triangle[i-1][j] + triangle[i][j];
                }else if(j==i){
                    triangle[i][j] = triangle[i-1][j-1] + triangle[i][j];
                }else{
                    triangle[i][j] =
                            Math.max(triangle[i-1][j-1]+triangle[i][j],triangle[i-1][j]+triangle[i][j]);
                }
                answer = Math.max(answer,triangle[triangle.length-1][j]);
            }
        }
        System.out.println(answer);
    }
}
