package LeetCode.niuke.string;

public class CountAndSayTestII {
    public String countAndSay(int n) {
        String s = "1" ;
        for(int i = 1;i < n;i++){
            StringBuilder sb = new StringBuilder("") ;
            int sum = 0 ;
            for(int j = 0;j < s.length();j++){
                if(j != 0 && s.charAt(j) != s.charAt(j-1)){
                    sb.append(sum) ;
                    sb.append(s.charAt(j-1)) ;
                    sum = 0 ;
                }
            sum++ ;
            }
        sb.append(sum) ;
        sb.append(s.charAt(s.length()-1)) ;
        s = sb.toString() ;
        }
        return s ;
    }
}
