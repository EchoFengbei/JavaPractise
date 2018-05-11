package LeetCode.niuke.string;

import java.util.ArrayList;

public class palindromePartitioning {
    public ArrayList<ArrayList<String>> partition(String s) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        dfs(s,0,list,res);
        return res;
    }
    public void dfs(String s, int start, ArrayList<String> list,
                    ArrayList<ArrayList<String>> res){
        if (start == s.length()){
            res.add(new ArrayList<>(list));
        }
        for (int i = start; i < s.length(); i ++){
            String str = s.substring(start,i+1);
            if (isPalindrome(str)){
                list.add(str);
                dfs(s,i+1,list,res);
                list.remove(list.size()-1);
            }
        }
    }
    public boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i ++;
            j --;
        }
        return true;
    }
}
