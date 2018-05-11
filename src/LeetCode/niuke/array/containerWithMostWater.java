package LeetCode.niuke.array;

public class containerWithMostWater {
    public int maxArea(int[] height) {
//        int max = -1;
//        for (int i = 0; i < height.length; i ++){
//            for (int j = i+1; j < height.length; j ++){
//                int high = Math.min(height[i],height[j]);
//                int width = j - i;
//                int area = high * width;
//                max = Math.max(area,max);
//            }
//        }
//        return max;
        /*
        *
这题最关键的是两点，一是两边往中间找，二是每次放弃最短的版。
这么做的原因在于：从起点和终点开始找，宽度最大，这时每移动一次其中一个点，必然宽度变小。
如此一来，想求最大，只有高度增长才有可能做到，去掉限制----短板，即放弃高度较小的点。*/
        int i = 0;
        int j = height.length-1;
        int max = 0;
        while (i < j){
            int area = (j-i) * Math.min(height[i],height[j]);
            max = Math.max(area,max);
            if (height[i] < height[j]) i++;
            else j--;
        }
        return max;
    }
}
