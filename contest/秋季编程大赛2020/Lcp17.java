package 秋季编程大赛2020;

/**
 * @ClassName Lcp17
 * @Description Lcp17
 * @Author MatthewHan
 * @Date 2020/9/12 14:52
 * @Version 1.0
 **/
public class Lcp17 {


    public int calculate(String s) {
        int x = 1;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                x = 2 * x + y;
            } else {
                y = 2 * y + x;
            }
        }
        return x + y;
    }

    public static void main(String[] args) {

    }
}
