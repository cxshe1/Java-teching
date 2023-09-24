/**
 * @Author 白泽
 * @ClassName: BinarySearchTest
 * @Date: 2023/9/24
 * 二分法查找(注意必须要是有序的)
 * 定义数组: int[] arr = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
 * 查找元素5是否在上述数组中出现过?,如果出现,输出对应的索引值
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 5, 8, 12, 15, 19, 26, 37, 49, 51, 66, 89, 100};
        int target = 5;

        //默认的首索引
        int head = 0;
        //默认的尾索引
        int end = arr.length - 1;

        boolean isFlag = false;
        while (head <= end) {
            int middle = (head + end) / 2;

            if (target == arr[middle]) {
                System.out.println("找到啦" + target + "对应的索引值为" + middle);
                isFlag = true;
                break;
            } else if (target > arr[middle]) {
                head = middle + 1;
            } else {//target < arr[middle]
                end = middle - 1;
            }

        }
        if (!isFlag){
            System.out.println("未找到该元素");
        }

    }
}
