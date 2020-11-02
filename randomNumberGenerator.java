public class randomNumberGenerator {
    public static void main(String[] args) {
        int i,k;
        int[] count = new int[10];
        for (i=0; i<100; i++) {
            k = (int) (Math.random() * 10);
            System.out.print(k);
            count[k] += 1; // count数组中统计出现次数
        }
        System.out.println();
// 打印count
        for (i=0; i<10; i++){
            System.out.println("第" + (i+1) + "个数的出现次数：" + count[i]);
        }
    }
}
