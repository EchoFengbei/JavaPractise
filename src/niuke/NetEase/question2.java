package niuke.NetEase;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("请输入两个整数：");
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = k;i<=n;i++){
            for (int j = k;j<=n;j++){
                if (i%j>=k)
                    count++;
            }
        }
        System.out.println(count);
    }
}
