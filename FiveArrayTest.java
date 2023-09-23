/**
 * @Author 白泽
 * @ClassName: FiveArrayTest
 * @Date: 2023/9/23
 * 数组的扩容
 * 现有数组int[] arr = new int[]{1,2,3,4,5};
 * 先将数组长度扩容一倍，并将10,20,30三个数据添加到arr数组中去,如何操作?
 */
public class FiveArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        //扩充一倍容量
//        int[] newArr = new int[arr.length * 2];
        //或(运用位移运算符)
        int[] newArr = new int[arr.length << 1];

        //将原有数组中的元素复制到新的数组之中
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        //将10,20,30这三个数据添加到新数组之中
        newArr[arr.length] = 10;
        newArr[arr.length + 1] = 20;
        newArr[arr.length + 2] = 30;

        //将新的数组的地址赋值给原有的数组变量
        arr = newArr;

        //遍历arr
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
