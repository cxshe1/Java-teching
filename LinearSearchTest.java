/**
 * @Author 白泽
 * @ClassName: LinearSearchTest
 * @Date: 2023/9/24
 * 线性查找
 *定义数组:int[] arr1 = new int[]{34,54,3,2,65,7,34,5,76,34,76};
 * 查找元素5是否出现在上述数组? 如果出现,输出对应的索引值
 */
public class LinearSearchTest {
    public static void main(String[] args) {

        int[] arr1 = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 76};

        int target = 5;

        //线性查找
//        //方法一:使用boolean判断
//        boolean isFlag = true;
//        for (int i = 0; i < arr1.length; i++) {
//            if(arr1[i] == target){
//                System.out.println("已经找到元素" + target +"对应的索引值为" + i);
//                isFlag = false;
//                break;
//            }
//        }
//        if(isFlag){
//            System.out.println("未找到该元素");
//        }
        //方法二:运用遍历原理判断
        int i = 0;
        for (; i < arr1.length; i++) {
            if (arr1[i] == target) {
                System.out.println("已经找到元素" + target + "对应的索引值为" + i);
                break;
            }
            if (i == arr1.length) {
                System.out.println("未找到该元素");
            }


        }
    }
}
