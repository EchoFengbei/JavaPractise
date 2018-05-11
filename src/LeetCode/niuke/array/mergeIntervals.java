package LeetCode.niuke.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
 }
public class mergeIntervals {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        /*
        * 先排序，然后检查相邻两个区间，看前一个区间的结尾是否大于后一个区间的开始，
        * 注意前一个区间包含后一个区间的情况。*/
        if(intervals.size()<=0)
            return intervals;
        //根据interval的start排序
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if(o1.start<o2.start)
                    return -1;
                else if(o1.start>o2.start)
                    return 1;
                else
                    return 0;
            }
        });

        for(int i = 0;i+1<intervals.size();i++){
            Interval current = intervals.get(i);
            Interval next = intervals.get(i+1);
            if(current.end>=next.start){
                current.end = Math.max(current.end,next.end);
                intervals.remove(i+1);
                i--;
            }
        }

        return intervals;
    }
}
