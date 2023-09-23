/**
 * @Author 白泽
 * @ClassName: FourArrayTest
 * @Date: 2023/9/23
 * 定义数组：int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
 * 如何实现数组元素的反转存储？你有几种方法
 */
public class FourArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        //反转之前
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        //方法一:将arr[i]与arr[arr.length - 1 - i]交换，只交换长度的一半次数
//        for (int i = 0; i < arr.length/2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
        //方法二:倒着遍历数组
//        int[] newArr = new int[arr.length];
//        for (int i = arr.length - 1; i >= 0 ; i--) {
//            newArr[arr.length - 1 - i] = arr[i];
//        }
//        arr = newArr;
        //方法三:运用多个变量,双指针算法
        for (int i = 0,j = arr.length - 1 ; i < j ; i++, j--) {
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
        }


        //反转之后
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
