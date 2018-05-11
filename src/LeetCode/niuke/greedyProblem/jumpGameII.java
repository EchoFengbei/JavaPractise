package LeetCode.niuke.greedyProblem;

public class jumpGameII {
    public static int jump(int[] A) {
        int last=0;
        int cur=0;
        int steps=0;
        for(int i=0;i<A.length;++i){
            if(i>last){
                last=cur;
                steps++;
            }
            cur=Math.max(cur, i+A[i]);
        }
        return steps;
    }

    public static void main(String[] args) {
        int[] num = {2,3,1,1,4};
        System.out.println(jump(num));
    }
}
