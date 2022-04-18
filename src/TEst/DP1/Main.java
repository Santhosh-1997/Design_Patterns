package TEst.DP1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int solve(int index, int[] height, int[] dp){

        if(index==0)    return 0;

        if(dp[index] != -1)     return dp[index];
        //one jump

        int oneJump = Math.abs(height[index]-height[index-1]) + solve(index-1,height,dp);


        int twoJump = Integer.MAX_VALUE;
        //twoJump
        if(index>1)
             twoJump = Math.abs(height[index]-height[index-2]) + solve(index-2,height,dp);

        dp[index] = Math.min(oneJump,twoJump);

        return dp[index];
    }


    public static int tabulation(int[] height,int n){

        int[] dp = new int[n];

        for(int el: dp)
            System.out.print(el + " ");

        dp[0] = 0;  //we know that for sure

        for(int i=1; i<n; i++){

            int oneStep = dp[i-1] + Math.abs(height[i]-height[i-1]);

            int twoStep = Integer.MAX_VALUE;
            if(i>1)
                twoStep = dp[i-2] + Math.abs(height[i]-height[i-2]);


            dp[i] = Math.min(oneStep,twoStep);
        }

        return dp[n-1];

    }

    public static void main(String[] args) {


        int height[]={30,10,60 , 10 , 60 , 50};
        int n=height.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        //using recursion-->memoisation
        System.out.println(solve(n-1,height,dp));



        //using tabulation to reduce space complexity of recursive stack
        System.out.println(tabulation(height,n));




    }
}
