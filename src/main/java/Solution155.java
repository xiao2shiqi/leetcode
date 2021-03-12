import java.util.Deque;
import java.util.LinkedList;



/**
 * LC#155 Min Stack
 * Link：https://leetcode-cn.com/problems/min-stack/
 * 思路1：刚开始最简单是用使用数组实现栈（时间复杂度是在太高）
 * 思路2：使用双端队列模拟栈实现，1个队列维护数据进出，1个队列进队时维护最小元素（最优解）
 */
public class Solution155 {

    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public Solution155() {
        xStack = new LinkedList<>();
        minStack = new LinkedList<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(), x));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }


    public int getMin() {
        // 观察最小元素
        return minStack.peek();
    }


    public static void main(String[] args) {
        Solution155 solution155 = new Solution155();
        solution155.push(-2);
        solution155.push(0);
        solution155.push(-3);
        System.out.println(solution155.getMin());       // -3
        solution155.pop();
        System.out.println(solution155.top());      // 0
        System.out.println(solution155.getMin());       // -2
    }
}
