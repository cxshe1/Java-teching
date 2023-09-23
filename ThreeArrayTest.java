/**
 * @Author 白泽
 * @ClassName: ThreeArrayTest
 * @Date: 2023/9/22
 * 使用二维数组打印一个10行的杨辉三角
 * 提示：第一行有 1 个元素，第n行有 n个元素
 * 每一行的第一个元素和最后一个元素都是 1
 * 从第三行开始，对于非第一个元素和最后一个元素的元素，即
 * yanghui[i][j] = yanghui[i - 1][j - 1] + yangjui[i-1][j]
 */
public class ThreeArrayTest {
    public static void main(String[] args) {
        //创建二维数组
        int[][] yangHui = new int[10][];

        //使用循环结构，初始化外层数组元素
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];
        //给数组每行的首末元素赋值为 1
            yangHui[i][0] = 1;
            yangHui[i][i] = 1;
        //给数组每行的非首末元素赋值
            //从每行的第二个元素开始，到倒数第二个元素结束
            if(i >= 2){
            for (int j = 1 ; j < yangHui[i].length - 1 ; j++) {
                yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
            }
            }
        }

        //遍历二维数组
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
