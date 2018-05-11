package LeetCode;


import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {
    public static String[] findWords(String[] words) {
        String firstRow = "QWERTYUIOPqwertyuiop";
        String secondRow = "ASDFGHJKLasdfghjkl";
        String thirdRow = "ZXCVBNMzxcvbnm";
        List<String> list=new ArrayList<String>();
//        for (int i=0; i< words.length; i++){
//            for (int j =0; j<words[i].length(); ){
//                if (firstRow.contains(words[i].substring(0,1))){
//                    j ++;
//                    if (firstRow.contains(words[i].substring(j,j+1))){
//                        result[k] = words[i];
//                        k ++;
//                        j ++;
//                    }else break;
//                }else if (secondRow.contains(words[i].substring(0,1))){
//                    j ++;
//                    if (secondRow.contains(words[i].substring(j,j+1))){
//                        result[k] = words[i];
//                        k ++;
//                        j++;
//                    }else break;
//                } else if (thirdRow.contains(words[i].substring(0,1))){
//                    j ++;
//                    if (thirdRow.contains(words[i].substring(j,j+1))){
//                        result[k] = words[i];
//                        k ++;
//                        j ++;
//                    }else break;
//                }else ;
//            }
//        }
        boolean flag = false;
        for (int i=0; i<words.length; i++){
            if (words[i].length() ==1){
                flag = true;
            }else {
               if (firstRow.contains(words[i].substring(0,1))){
                   //如果第一个字母在第一行
                   for (int j =1; j< words[i].length();j ++){
                       if (firstRow.contains(words[i].substring(j,j+1))){
                           flag = true;
                       }else {
                           flag = false;
                           break;
                       }
                   }
               }
               if (secondRow.contains(words[i].substring(0,1))){
                   for (int j = 1;j<words[i].length();j ++){
                       if (secondRow.contains(words[i].substring(j,j+1))){
                           flag = true;
                       }else  {
                           flag = false;
                           break;
                       }
                   }
               }
               if (thirdRow.contains(words[i].substring(0,1))){
                   for (int j = 1;j<words[i].length(); j++){
                       if (thirdRow.contains(words[i].substring(j,j+1))){
                           flag = true;
                       }else {
                           flag = false;
                           break;
                       }
                   }
               }
            }
            if (flag == true){
                list.add(words[i]);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String[] input = {"g", "Alaska", "Dad", "Peace"};
        String[] output = findWords(input);
        for (int m = 0;m < output.length; m ++){
            System.out.println(output[m]);
        }

    }

}
