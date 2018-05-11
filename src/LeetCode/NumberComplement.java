package LeetCode;

public class NumberComplement {
    public static int findComplement(int num) {
        String result = Integer.toBinaryString(num);
        return num^((2<<2)-1);
    }

    public static void main(String[] args) {
        System.out.println(((2<<2)-1));
        System.out.println(findComplement(5));
    }
}
