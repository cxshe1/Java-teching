/**
 * @Author 白泽
 * @ClassName: SixArrayTest
 * @Date: 2023/9/23
 * 数组的缩容
 * 现有数组 int[] arr = {1,2,3,4,5,6,7};现需删除数组中索引为4的元素
 */
public class SixArrayTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int deleteIndex = 4;

//        //方法一：不新建数组
//        for (int i = deleteIndex; i < arr.length - 1; i++) {
//            arr[i] = arr[i + 1];
//        }
//        //修改最后元素,设置为默认值
//        arr[arr.length - 1] = 0;

        //方式二：新建数组,新的数组的长度比原有数组的长度少1个
        int[] newArr = new int[arr.length - 1];
        //索引4之前
        for (int i = 0; i < deleteIndex; i++) {
            newArr[i] = arr[i];
        }
        //索引4之后
        for (int i = deleteIndex; i < arr.length - 1; i++) {
            newArr[i] = arr[i + 1];
        }
        arr = newArr;
        
        //遍历newArr数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");

        }



    }
}
