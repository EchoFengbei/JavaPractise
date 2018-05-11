package LeetCode.niuke.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
}
public class insertInterval {
    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> res = new ArrayList<>();
        if (intervals == null ||newInterval == null){
            return intervals;
        }
        int index = 0;
        for (Interval interval:intervals){
            if (newInterval.end < interval.start){
                res.add(interval);
            }else if (newInterval.start > interval.end){
                res.add(interval);
                index ++;
            }else {
                newInterval.start = Math.min(newInterval.start,interval.start);
                newInterval.end = Math.max(newInterval.end,interval.end);
            }
        }
        res.add(index,newInterval);
        return res;
    }

    public static void main(String[] args) {
        Interval interval = new Interval();
        interval.start = 1;
        interval.end = 5;

        Interval newInterval = new Interval();
        newInterval.start = 0;
        newInterval.end = 0;

        ArrayList<Interval> list = new ArrayList<>();
        list.add(interval);

        insert(list,newInterval);

        for (int i = 0; i < list.size(); i ++){
            System.out.println("[" + list.get(i).start + "," + list.get(i).end + "]");
        }
    }
}
