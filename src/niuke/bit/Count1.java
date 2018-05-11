package niuke.bit;

public class Count1 {
    public static int NumberOf1(int n) {
//        String str = Integer.toBinaryString(n);
//        int count = 0;
//        char[] chars = str.toCharArray();
//        for (int i = 0; i < chars.length; i ++){
//            if (chars[i] == '1'){
//                count ++;
//            }
//        }
//        return count;

        //the 2nd way
        int count = 0;
        while (n != 0){
            count ++;
            n = n & (n-1);
        }
        return count;

        //the 3rd  way
//        return Integer.toBinaryString(n).replaceAll("0","").length();
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(1));
    }
}
