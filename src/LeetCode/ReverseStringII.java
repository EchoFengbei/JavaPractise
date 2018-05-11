package LeetCode;

import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import static java.lang.Math.pow;

public class ReverseStringII {
    public static String reverseStr(String s, int k) {

//        char[] chars = s.toCharArray();
//        if (chars.length < k){
//            for (int i =0; i<= chars.length/2; i ++){
//               for (int j = chars.length-1; j >=chars.length/2; j --){
//                   char temp = chars[i];
//                   chars[i] = chars[j];
//                   chars[j] = temp;
//                   return String.valueOf(chars);
//               }
//            }
//        }else if (chars.length <= 2*k){
//            for (int i = 0;i <= k/2; i ++){
//                for (int j = k-1; j >= k/2; j --){
//                    char temp = chars[i];
//                    chars[i] = chars[j];
//                    chars[j] = temp;
//                    return String.valueOf(chars);
//                }
//            }
//        }else {
//            for (int m = 0; m < chars.length; m = m + 2*k){
//                for (int i = m; i <= m + k/2; i ++){
//                    for (int j = m + k-1; j >= m + k/2; j --){
//                        char temp = chars[i];
//                        chars[i] = chars[j];
//                        chars[j] = temp;
//                    }
//                }
//            }
//        }
//        System.out.println(String.valueOf(chars));
//        return String.valueOf(chars);

        //上面这种写法，比较low，当k=3的时候，报错
        //下面用reverse函数进行翻转
        String output = "";
        if (s.length() <= k){
            output = new StringBuffer(s).reverse().toString();
            return  output;
        }else if (s.length()<= 2*k){
            output = new StringBuffer(s.substring(0,k)).reverse().toString() + s.substring(k);
            return output;
        }
        StringBuffer result = null;
        while (s.length() > 2*k){
            String temp  = "";
            result = new StringBuffer(s.substring(0,k)).reverse();//处理前k个字符串，翻转，保存在result中
            String pre = s.substring(k,2*k);  //第[k,2*k)个不用翻转，保存在pre中
            output = output + result.toString() + pre; //将处理好的前2*k个字符拼接起来，保存在output中，
            result.setLength(0);//
            s = s.substring(2*k);
            temp = reverseStr(s,k) ;
            output = output + temp;
        }
        System.out.println(output);
        return  output;
    }

    public static void main(String[] args) {
        String test = "abcdefg";
        reverseStr(test,1);
    }
}
