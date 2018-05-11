package niuke.string;


public class isMatch {
    public boolean match(char[] str, char[] pattern)
    {
        if (str == null || pattern == null) return  false;
        int strIndex = 0;
        int patternIndex = 0;
        return isMatchString(str,pattern,strIndex,patternIndex);
    }
    public boolean isMatchString(char[] str,char[] pattern,int strIndex,int patternIndex){
        //递归结束条件
        if (strIndex == str.length && patternIndex == pattern.length) return true;
        //
        if (strIndex != str.length && patternIndex == pattern.length) return false;


        //当pattern的第二位为*时
        if (patternIndex + 1 < pattern.length && pattern[patternIndex+1] == '*'){
            if ((strIndex != str.length && str[strIndex] == pattern[patternIndex]) ||
                    (strIndex != str.length && pattern[patternIndex] == '.')){
                return  isMatchString(str,pattern,strIndex,patternIndex+2) ||
                        isMatchString(str,pattern,strIndex+1,patternIndex+2) ||
                        isMatchString(str,pattern,strIndex+1,patternIndex);
            }else {
                return isMatchString(str,pattern,strIndex,patternIndex+2);
            }
        }
        //当pattern第二位不为*时
        if ((strIndex != str.length && str[strIndex] == pattern[patternIndex]) ||
                (strIndex != str.length && pattern[patternIndex] == '.'))
            return isMatchString(str,pattern,strIndex+1,patternIndex+1);
        return false;
    }
}
