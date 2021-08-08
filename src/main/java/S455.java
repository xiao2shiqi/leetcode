import java.util.Arrays;

/**
 * LC#455：Assign Cookies 分发饼干
 * Link：https://leetcode-cn.com/problems/assign-cookies/
 * Solution1：排序数组后，进行对比即可得到想要的孩子的数量
 * @author Phoenix on 2021/7/11.
 */
public class S455 {

    public int findContentChildren(int[] g, int[] s) {
        // sort for compare array
        Arrays.sort(g);
        Arrays.sort(s);
        int cookies = 0, children = 0;
        while (children < g.length && cookies < s.length) {
            // if cookies are greater than expected, children are incr
            if (g[children] <= s[cookies]) {
                children++;
            }
            //Cookies can only be used once
            cookies++;
        }
        return children;
    }

    public static void main(String[] args) {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};

        int result = new S455().findContentChildren(g, s);
        System.out.println("result: " + result);
    }

}
