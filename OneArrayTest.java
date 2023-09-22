//定义一个int类型的一维数组，包含10个随机整数，然后求出所有元素的最大值，最小值，总和，并输出
//要求整数范围为[10,99]
public class OneArrayTest {
    public static void main(String[] args) {
        //创建动态一维数组
        int[] arr = new int[10];
        //通过循环给数组赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int) (Math.random() * (99 - 10 + 1) + 10);
        }
        //求出最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("最大值为:" + max);
        //求出最小值
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }

        }
        System.out.println("最小值为:" + min);
        //总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println("总和为：" + sum);
        //平均数
        int average = 0;
        average = sum/10;
        System.out.println("平均数为：" + average);
    }
}
