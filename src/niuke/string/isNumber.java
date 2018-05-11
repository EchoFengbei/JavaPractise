package niuke.string;

public class isNumber {
    public boolean isNumeric(char[] str) {
        String string = new String(str);
        boolean flag = false;
        if(string.matches("")) flag = true;
        return flag;
    }
}
