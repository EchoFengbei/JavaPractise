package LeetCode.niuke.string;

public class addBinary {
    public static String addBinary(String a, String b) {
//        int sum = Integer.valueOf(a,2) + Integer.valueOf(b,2);
//        return Integer.toBinaryString(sum);
        if (a == null || a.length() == 0) return b;
        if (b == null || b.length() == 0) return a;
        while (a.length() < b.length()) a = "0" + a;
        while (a.length() > b.length()) b = "0" + b;
        //cong最低位开始
        //设置进位
        boolean carry = false;
        String res = "";
        for (int i = a.length()-1; i >= 0; i --){
            if (a.charAt(i)-'0' + b.charAt(i)-'0' == 1){
//                res = carry ? '0'+ res : '1' + res;
//                carry = false;
                if (carry){
                    res = '0'+ res;
                    carry = true;
                }else{
                    res = '1' + res;
                    carry = false;
                }
            }else if (a.charAt(i)-'0' + b.charAt(i)-'0' == 2){
                //有进位
                res = carry ? '1' + res : '0' + res;
                carry = true;
            }else{
                res = carry ? '1' + res : '0' + res;
                carry = false;
            }
        }
        if (carry)
            res = "1" + res;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));
    }
}
