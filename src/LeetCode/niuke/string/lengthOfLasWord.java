package LeetCode.niuke.string;

public class lengthOfLasWord {
    public static int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0 || s == " ") return 0;
        String[] strings = s.split(" ");
        if (strings.length < 1) return 0;
        else return strings[strings.length-1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(" "));
    }
}
