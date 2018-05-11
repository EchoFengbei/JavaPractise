package LeetCode.niuke.array;

public class plusOne {
    public static int[] plusOne(int[] digits) {
       for (int i = digits.length-1; i >=0; i --){
           digits[i] = digits[i] +1;
           if (digits[i] == 10){
               digits[i] = 0;
           }else return digits;
       }
       int[] res = new int[digits.length+1];
        res[0] = 1;
        for (int i = 1; i < res.length; i ++){
            res[i] = digits[i-1];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num = {1,1};
        int[] temp = plusOne(num);
        for (int i = 0; i < temp.length; i ++){
            System.out.println(temp[i]);
        }
    }
}
