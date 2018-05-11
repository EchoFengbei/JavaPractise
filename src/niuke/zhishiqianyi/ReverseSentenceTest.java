package niuke.zhishiqianyi;

public class ReverseSentenceTest {
    public static String ReverseSentence(String str) {
        String res = null;
        if(str.trim().equals("")){
            return str;
        }
        StringBuffer sb = new StringBuffer();//用来连接字符串
        String[] strArray = str.split(" ");
//        for (int i = strArray.length/2 +1; i < strArray.length; i ++){
//            sb.append(strArray[i] + " ");
//        }
//        for (int i = strArray.length/2; i >= 0 ; i --){
//            sb.append(strArray[i] + " ");
//        }
        //上面是将字符串分成两部分，分别处理，发现自己搞错了，其实就是单词顺序倒序
        for (int i = strArray.length-1; i >= 0; i --){
            sb.append(strArray[i] + " ");
        }
        sb.deleteCharAt(sb.length()-1);
        res = sb.toString();
        return res;
    }

    public static void main(String[] args) {
        String string = "I am a student.";
        System.out.println("输出结果是：" + ReverseSentence(string));
    }
}
