package niuke.shikongpingheng;


public class InversePairsTest {
    public static int InversePairs(int [] array) {
        //算法复杂度过大。md
//        int count = 0;
//        if (array.length <= 1) return count;
//        for (int i = 0; i < array.length; i ++){
//            for (int j= i; j < array.length; j ++){
//                if (array[i] > array[j]) count++;
//            }
//        }
//        return count;
        //a new way

        if (array == null || array.length == 0) return 0;

        int[] copy = new int[array.length];
        for(int i=0;i<array.length;i++) {
            copy[i] = array[i];
        }
        return myInversePairs(array,copy,0,array.length-1);
    }

    public static int myInversePairs(int[] array,int[] copy, int start, int end){
        if (start == end) {
            return 0;
        }

        int mid = (end + start)/2;
        //前后半段内部细分
        int left = myInversePairs(array,copy,start,mid)%1000000007;
        int right = myInversePairs(array,copy,mid + 1, end)%1000000007;

        //前半段的最后一个点的index
        int i = mid;
        int j = end;
        int index = end;
        int count = 0;
        while (i >= start && j > mid ){
            if (array[i] > array[j]){
                copy[index] = array[i];
                index--;
                i--;
                count += j - mid;
                if (count > 1000000007){
                    count %= 1000000007;
                }
            }else {
                copy[index] = array[j];
                index --;
                j --;
            }
        }
        for (;i >= start;){
            copy[index] = array[i];
            index--;
            i --;
        }
        for (;j > mid ; ){
            copy[index] = array[j];
            index--;
            j --;
        }
        for(int s=start;s<=end;s++) {
            array[s] = copy[s];
        }
        return (left + right + count)%1000000007;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,0};
        System.out.println(InversePairs(array));
    }
}
