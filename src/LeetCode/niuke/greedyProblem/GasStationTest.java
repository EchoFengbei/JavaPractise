package LeetCode.niuke.greedyProblem;

public class GasStationTest{
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas == null || cost == null || gas.length <0 || cost.length < 0)
            return -1;
        int temp = 0;
        int total = 0;
        int index = -1;
        for (int i = 0; i < gas.length; i++){
            temp = temp + gas[i] - cost[i];
            total = total + gas[i] - cost[i];
            if (temp < 0){
                temp = 0;
                index = i;
            }
        }
        if (total < 0) return -1;
        else return index+1;
    }
}
