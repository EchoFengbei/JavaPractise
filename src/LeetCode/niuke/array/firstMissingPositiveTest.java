package LeetCode.niuke.array;

import java.util.Arrays;

public class firstMissingPositiveTest {
    public static int firstMissingPositive(int[] A) {
        /*利用数组的index来作为数字本身的索引，把正数按照递增顺序依次放到数组中。
        即让A[0]=1, A[1]=2, A[2]=3, ... , 这样一来，
        最后如果哪个数组元素违反了A[i]=i+1即说明i+1就是我们要求的第一个缺失的正数。
        对于那些不在范围内的数字，我们可以直接跳过，比如说负数，0，或者超过数组长度的正数，这些都不会是我们的答案。*/
        if (A == null || A.length == 0) return 1;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]<=A.length && A[i]>0 && A[A[i]-1]!=A[i])
            {
                int temp = A[A[i]-1];
                A[A[i]-1] = A[i];
                A[i] = temp;
                i--;
            }
        }
        for(int i=0;i<A.length;i++)
        {
            if(A[i]!=i+1)
                return i+1;
        }
        return A.length+1;
    }

    public static void main(String[] args) {
        int[] A = {3,4,-1,2};
        System.out.println(firstMissingPositive(A));
    }
}
