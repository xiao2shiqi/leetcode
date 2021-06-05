import java.util.HashMap;
import java.util.Stack;

/**
 * #20: Valid Parentheses 有效的括号
 * https://leetcode-cn.com/problems/valid-parentheses/
 * 时间复杂度：O(n)
 * 解题思路：用栈数据结构解决
 * 1 使用散列表加载括号
 * 2 判断左括号push进栈
 * 3 判断右扩展就pop栈顶匹配
 * 4 栈内无元素代表完全匹配
 */
public class S20 {

    public static boolean isValid(String s) {
        HashMap<Character, Character> mappings = new HashMap<Character, Character>(){{
            put(')','('); put('}','{'); put(']','[');
        }};
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(mappings.containsKey(c)) {
                //判断元素是右扩展，则从栈顶弹出元素来匹配
                char topElement = stack.empty() ? '#' : stack.pop();
                if(topElement != mappings.get(c)) {
                    return false;
                }
            } else {
                //左括号则将元素压栈
                stack.push(c);
            }
        }
        //空栈代表括号完全匹配
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String braces = "()[]{}";
        System.out.println("result=" + S20.isValid(braces));
        System.out.println(System.currentTimeMillis() - startTime + "ms");
    }
}