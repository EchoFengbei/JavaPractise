package ch5;

public class BinarySearchTest {
    int binarySearch(int [] arr,int key){
        //折半查找对应已排好序的数组
        int low = 0;
        int high = arr.length-1;
        int mid = (low+high)/2;
        int location = -1;
        while (low<high){
            if (key == arr[mid]){
                location = mid;
                return location;
            }else if (key<arr[mid]){
                high = mid -1;
            }else if (key > arr[mid]){
                low = mid + 1;
            }
            mid = (low+high)/2;
        }
        return  location;//没有查找到
    }
}
