package niuke.zongheAndhuisu;

public class StrToIntTest {
    public static int StrToInt(String str) {
        //输入一个字符串,包括数字字母符号,可以为空
        int res = 0;
        int sum = 0;
        if (str.matches("[a-zA-Z]") || str =="0" || str == "" || str == null){
            res = 0;
            return  res;
        }
        if (str.matches("-\\d+")){
            //有正负号的
           for (int i = 1; i < str.length(); i ++){
                sum = sum *10 + str.charAt(i) - 48;
           }
           res  = -sum;
        }
        if (str.matches("\\+\\d+")){
            for (int i = 1; i < str.length(); i ++){
                sum = sum *10 + str.charAt(i) - 48;
            }
            res = sum;
        }
        if (str.matches("\\d+")){
           for (int i = 0; i < str.length(); i ++){
               sum = sum *10 + str.charAt(i) - 48;
           }
           res = sum;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(StrToInt("-123"));
    }
}
