/**
 * @Author 白泽
 * @ClassName: TweArrayTest
 * @Date: 2023/9/22
 * 有十位评委为选手打分，分数分别为：5、4、6、8、9、0、1、2、7、3
 * 求选手的最后得分（去掉一个最高分和一个最低分后其余8位评委打分的平均值
 */
public class TweArrayTest {
    public static void main(String[] args) {

        int[] scores = {5,4,6,8,9,0,1,2,7,3};

        int sum = 0;
        int max = scores[0];
        int min = scores[0];

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            if(max < scores[i]){
                max = scores[i];
            }
            if(min > scores[i]){
                min = scores[i];
            }

        }
        int avg = (sum - max - min) / (scores.length - 2 );
        System.out.println("去掉最高分和最低分之后，平均分为：" + avg);
    }
}
