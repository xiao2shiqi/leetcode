import java.util.HashMap;
import java.util.Map;

/**
 * LC#13 : Roman to Integer
 * https://leetcode-cn.com/problems/roman-to-integer/
 *
 * 解题思路：
 *  1 创建一个Map建立罗马符号和数字映射表
 *  2 创建一个Map建立特殊情况字符要处理的罗马符号
 *  3 for循环根据输入从映射表中获取数字求和就可以了
 *  4 遇到特殊字符就从映射表中找出要特殊处理对应的罗马符号表，进行逻辑运算就行
 */
public class Solution13 {

    public static int romanToInt(String s) {
        //罗马符号数字映射表
        Map<Character, Integer> romeNum = new HashMap<Character, Integer>(){{
            put('I', 1);put('V', 5);put('X', 10);put('L', 50);put('C', 100);put('D', 500);put('M', 1000);
        }};
        //特殊情况映射字符，便于扩展
        Map<Character, Character> special = new HashMap<Character, Character>(){{
            put('V', 'I');put('X', 'I');put('L', 'X');put('C', 'X');put('D', 'C');put('M', 'C');
        }};
        int sum = 0;
        //通过映射表求和
        for (int i = 0; i <= (s.length() - 1); i++) {
            char c = s.charAt(i);
            if(!romeNum.containsKey(c)) continue;
            sum = sum + romeNum.get(c);
            if(i == 0) continue;
            //处理特殊情况
            if(special.containsKey(c)){
                if(s.charAt(i - 1) == special.get(c)) sum = sum - romeNum.get(special.get(c)) * 2;
            }
        }
        //处理上限和下限
        if(sum < 1) return 1;
        if(sum > 3999) return 3999;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Solution13.romanToInt("MCMXCIV"));
    }
}
