package com.naveen.DSA.leetcode.easydifficulty.binarysearch;

//the most headache problem so far. 09/06/2022
/*

Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated,
and only the integer part of the result is returned.

*/


public class PreciseSquareRoot {

    public static int sqrt(int x){  //this algorithm is not working for number 1-5.

        if(x==1||x==0)  //we can remove this condition if we use high variable as x. but we assigned x/2. so 1/2 is 0.
            return x;

        int sqrt = -1;
        int low = 0;
        int high = x/2;

        while (low<=high){

            int mid = low+(high-low)/2;

            long square = (long)mid*mid;

            if(square>x){
                high=mid-1;
            } else if(square<=x){
                sqrt = mid;
                low=mid+1;
            }
        }

        return sqrt;
    }



    public static int sqrtSlow(int x){
        int answer = 0;
        while (answer*answer<=x)
            answer++;
        return answer-1;
    }

    public static int sqrtDeadSlow(int number){

        /*
        * This function will ofcource find the Precise square root of the given number.but..
        * since it is calculating all the possible float values. it could take days, or weeks, or even years to find the right answer depending on the given number.
        * But int question they aren't asking for the precise square root, they are asking for round up answer.
        * So we dont need to calculate precise and then round up. We can just return the estimation of it.
        * */

        float answer = 0;
        float low = 0;
        float high = number/2;

        while (low<=high){
            float mid = low+(high-low)/2;
            float square = mid*mid;

            if(square==number){
                answer=mid;
                break;
            } else if(square>number) {
                high = mid;
            } else {
                low = mid;
            }
        }

        return (int)answer;
    }

}
