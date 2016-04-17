import java.util.ArrayList;
import java.util.List;

/**
 * Created by ysun on 3/26/16.
 */
public class FlipGame {

    public static void main(String[] args) {
        FlipGame fg = new FlipGame();
        String s = "+---++--+++-+-+--+";
        List<String> result = fg.getFlipResult(s);
        System.out.println(result);
    }

    public List<String> getFlipResult(String s) {
        List<String> res = new ArrayList<String>();
        if (s.length() < 2) return res;
        search(s, res, 0);
        return res;
    }

    public void search(String s, List<String> res, int len) {
        for (int i = len; i < s.length() - 1; i++) {
            if (s.charAt(i) == '+' && s.charAt(i) == s.charAt(i + 1)) {
                String t = s.substring(0, i) + "--" + s.substring(i + 2);
                res.add(t);
            }
        }
    }
}