package LeetCode;

public class HammingDistance {
    public static void main(String[] args) {

//        bitCount方法——获取二进制补码中1位的数量,正数的补码是它本身。
//        int i=10;
//        int count = Integer.bitCount(i);
//        System.out.print(i+" 的二进制补码表示形式的1位的数量为 ");
//        System.out.println(count);
        for (int i = 1; i <= 5; i++) {

            int count = Integer.bitCount(i);

            String str = Integer.toBinaryString(i);

            System.out.print(i + " 转换为二进制为 " + str + " 表示     形式的1位的数量为 ");

            System.out.println(count);
        }
    }
}
