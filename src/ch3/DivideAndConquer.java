package ch3;

import com.sun.xml.internal.ws.api.ha.HaInfo;

import javax.security.auth.login.LoginException;

public class DivideAndConquer {

    int findFalseCoin(int coin[],int low,int high){
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int location = 0;
        //处理两个相邻的节点
        if (low+1 ==high){
            if (coin[low]< coin[high]){
                location = low +1;
                 return location;  //索引变成位置序号
            }else {
                location = high+1;
            }return location;
        }

        //处理数组的两部分，分治为两部分
        if ((high-low+1)%2 == 0){
            //数组个数为偶数的时候
            for (int i = low; i<=(high-low)/2; i++){
                sum1 = sum1 + coin[i];
            }
            for (int i = (high-low)/2;i<= high; i++){
                sum2 = sum2 + coin[i];
            }
            if (sum1 < sum2){
                location = findFalseCoin(coin,low,(high-low)/2);
                return location;
            }else if (sum2 < sum1){
                location = findFalseCoin(coin,(high-low)/2,high);
                return location;
            }else {}
        }
        else {
            //数组个数为奇数的时候
            for (int i = low; i <= (high-low)/2-1; i ++){
                sum1 = sum1 + coin[i];
            }
            for (int i = (high-low)/2+1; i<= high; i++){
                sum2 = sum2 + coin[i];
            }
            sum3 = coin[low+(high-low)/2];
            if (sum1 < sum2){
                location = findFalseCoin(coin,low,(high-low)/2-1);
                return location;
            }else if (sum2 < sum1){
                location = findFalseCoin(coin,(high-low)/2,high);
                return location;
            }else {}
            if (sum1+sum3 == sum2+sum3){
                location = low+(high-low)/2 +1;
                return location;
            }
        }
        return location;
    }


    public static void main(String[] args) {
        ///
    }



}
