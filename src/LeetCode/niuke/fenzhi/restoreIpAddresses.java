package LeetCode.niuke.fenzhi;

import java.util.ArrayList;
import java.util.List;

public class restoreIpAddresses {
    //分成三个分割点，控制好分割点的位置
    //注意约束条件有两个，一个是一段字符串不超过3个字母，
    // 另一个是控制好每段字符串最远结束的位置，比如第一个字符串最多延伸到倒数第4个字母。
    public ArrayList<String> restoreIpAddresses(String s) {
        ArrayList<String> list = new ArrayList<>();
        int len = s.length();
        //第一个分割点
        for (int i = 1; i < 4 && i < len-2; i ++){
            //第二个分割点
            for (int j = i+1; j < i +4 && j < len-1; j ++){
                //第三个分割点
                for (int k = j +1; k < j+4 && k < len; k ++){
                    String s1 = s.substring(0,i);
                    String s2 = s.substring(i,j);
                    String s3 = s.substring(j,k);
                    String s4 = s.substring(k);
                    if (isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4))
                        list.add(s1 + "." + s2 + "." + s3 + "." + s4);
                }
            }
        }
        return list;
    }
    public boolean isValid(String sub){
        return sub.length()<=3 && ((sub.charAt(0) != '0' && Integer.valueOf(sub) <=255) || sub.equals("0"));
    }
}
