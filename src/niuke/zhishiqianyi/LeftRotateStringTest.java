package niuke.zhishiqianyi;

public class LeftRotateStringTest {
    public String LeftRotateString(String str,int n) {
        if (str == "") return "";
        if (n > str.length() || n < 0) return  "";
        StringBuffer sb = new StringBuffer();
        String str1 = str.substring(0,n);//前半部分
        String str2 = str.substring(n);//后半部分
        sb.append(str2);
        sb.append(str1);
        return sb.toString();
    }

    public static void main(String[] args) {
        //for test
//        String string = "abcXYZdef";
//        String str1 = string.substring(0,3);
//        String str2 = string.substring(3);
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(string);
    }
}
