package com.jilingy.external.offer;

/**
 * @author: YangJiling
 * @Description: 70. 爬楼梯
 * @date: 2022-07-15
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) return 1;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }



    public int climbStairs2(int n) {
        int result = 0;
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        if (((n - 1) >= 0)) {
            result += climbStairs2(n - 1);
        }
        if ((n - 2) >= 0) {
            result += climbStairs2(n - 2);
        }
        return result;
    }

    public int climbStairsDp(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] array = new int[n+1];
        array[0]=0;
        array[1]=1;
        array[2]=2;
        for (int i = 3; i < n+1; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }

    public static void main(String[] args) {
        ClimbStairs climbStairs = new ClimbStairs();
        int i = climbStairs.climbStairs(3);

        int dp = climbStairs.climbStairsDp(10);
        System.out.println(dp);

    }
}
