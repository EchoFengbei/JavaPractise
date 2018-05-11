package niuke.zhishiqianyi;

import jdk.nashorn.internal.ir.IfNode;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class FindContinuousSequenceTest {

    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        //定义两个指针，small和big分别指向1和2
        //当small到big的序列和小于sum，big++
        //当small 到big的序列和大于sum，small++
        int small = 1;
        int big = 2;
        if(sum <= 1) return res;
        while (small != (1+ sum)/2) {
            int currSum = sumOfList(small,big);
            if (currSum == sum){
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = small; i <= big; i ++){
                    list.add(i);
                }
                res.add(list);
                small ++;
                big ++;
            }else if (currSum < sum){
                big ++;
            }else small ++;
        }
        return res;
    }

    public int sumOfList(int head,int leap){//计算当前序列的和
        int sum=head;
        for(int i=head+1;i<=leap;i++){
            sum+=i;
        }
        return sum;
    }


    public static void main(String[] args) {

    }
}
