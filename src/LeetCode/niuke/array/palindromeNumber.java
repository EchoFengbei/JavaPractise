package LeetCode.niuke.array;

public class palindromeNumber {
    public static boolean isPalindrome(int x) {
//        if (x < 0) return false;
//        String s = String.valueOf(x);
//        int i = 0;
//        int j = s.length()-1;
//        while (i <= j && s.charAt(i) == s.charAt(j)){
//            i ++;
//            j --;
//            return true;
//        }
//        return false;
        //将x的从个位开始取出乘以10+上后面的数，并判断最后是否等于X就行
        if (x < 0 || (x > 0 && x % 10==0)) return false;
        int num = 0;
        while ( x > num){
            num = num*10 + x%10; //掐头
            x = x/10;//去尾
        }
        //当数字个数是奇数时，最中间的数会在最后一次循环中给了num，所以num/10去掉最后一个数
        //保证是回文数
        return x == num || num/10 == x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }
}
