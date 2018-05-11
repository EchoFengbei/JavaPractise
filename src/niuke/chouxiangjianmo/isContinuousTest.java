package niuke.chouxiangjianmo;

import java.util.ArrayList;
import java.util.Arrays;

public class isContinuousTest {
    public boolean isContinuous(int [] numbers) {
        int zeroNum = 0;
        if (numbers.length != 5) return false;

        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i ++){
            if (numbers[i] == 0){
                zeroNum ++;
                continue;
            }
            if (zeroNum != 4 && numbers[numbers.length-1] - numbers[i] > 4 ||
                    numbers[i] == numbers[i +1])
                return false;
            else return true;
        }
        return true;
    }
}
