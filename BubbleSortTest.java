/**
 * @Author 白泽
 * @ClassName: BubbleSortTest
 * @Date: 2023/9/26
 * 冒泡排序
 * int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
 *
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        //遍历原来的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        //冒泡排序,实现数组元素从小到大排列
        for (int j = 0; j < arr.length - 1; j++) {
            boolean isFlag = true;//假设数组已经排列好了
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if(arr[i] > arr[i + 1] ){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    isFlag = false;//如果元素发生了交换,那么说明数组还没有排好序
                }
            }
            if(isFlag){
                break;
            }
        }
        //遍历冒泡完成的数组
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
