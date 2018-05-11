package LeetCode.niuke.array;

public class nextPermutationTest {
    public void nextPermutation(int[] num) {
        //从后往前找到第一个不是递增数列的数，标记位置，如果都是递增，说明是这个序列中最大的数，下一个排列就是最小的数，反转就行
        int i = num.length-2;
        while (i >= 0 && num[i] >= num[i+1]) i--;
        if (i >= 0){
            int j = i+1;
            while (j < num.length && num[j] > num[i]) j ++;
            j--;
            //找到位置p以后，找到p之后的元素中大于它的最小的数，交换，并将p之后的元素反转
            swap(num,i,j);
        }
        reverse(num, i+1,num.length-1);
    }
    public void swap(int[] num, int i,int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
    public void reverse(int[] num, int i, int j){
        while (i < j){
            swap(num,i ++,j --);
        }
    }

    public static void main(String[] args) {
        int[] num = {1,2,3};
        System.out.println();
    }
}
