package LeetCode.niuke.string;

public class reverseInteger {
    public static int reverse(int x) {
        int res = -1;
        StringBuffer sb = new StringBuffer();
        sb.append(x);
        if (x < 0){
            sb.reverse();
            sb.deleteCharAt(sb.length()-1);
            int i = 1;
            while (sb.substring(i,i +1) == "0"){
                i ++;
            }
            sb.substring(i);
            res = Integer.valueOf("-" + sb.toString());
        }else {
            sb.reverse();
            int i = 0;
            while (sb.substring(i,i +1) == "0"){
                i ++;
            }
            sb.substring(i);
            res = Integer.valueOf(sb.toString());
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-1230));
    }
}
