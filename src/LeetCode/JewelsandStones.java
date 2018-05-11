package LeetCode;

public class JewelsandStones {
    public static int numJewelsInStones(String J, String S) {
        int count = 0;
            for (int i=0; i< S.length(); i ++){
                if (J.contains(S.substring(i,i+1))){
                    count ++;
                }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        numJewelsInStones("aA","aAAbbbb");
    }
}
