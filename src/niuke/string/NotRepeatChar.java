package niuke.string;

public class NotRepeatChar {
    String str = ""; //用来保存已经从字符流中读取到的数据；
    StringBuilder sb = new StringBuilder(str);

    //Insert one char from stringstream
    public void Insert(char ch)
    {
        sb.insert(str.length(),ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        String s1 = sb.toString();
        for (int i = 0; i < s1.length(); i++){
            String s2 = s1.replace(String.valueOf(s1.charAt(i)),"");//用空代替第i位出现的所有字符
            //如果某个字符出现一次，则s1和s2的长度只差1，如果有多个字符，那么不差1
            if (s1.length()-s2.length() == 1) return s1.charAt(i);
        }
        return '#';
    }
}
