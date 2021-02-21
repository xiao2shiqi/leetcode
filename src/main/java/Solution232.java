import java.util.Stack;

/**
 * LC#232 Implement Queue using Stacks
 * Link：https://leetcode-cn.com/problems/implement-queue-using-stacks/
 * 思路：使用负负得正的思路，使用两个 Stack（inputStack，outputStack）实现队列的 FIFO 特性
 */
public class Solution232 {

    // 初始化空栈
    private Stack<Integer> inputStack = null;
    private Stack<Integer> outputStack = null;

    public Solution232() {
        // 实例化再加载
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public void push(int x) {
        inputStack.push(x);
    }
    
    public int pop() {
        // 输出栈为 null， 从输入栈获取数据
        if (outputStack.isEmpty()) {
            while(!inputStack.empty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.pop();
    }
    
    public int peek() {
        // 输出栈为 null， 从输入栈获取数据
        if(outputStack.isEmpty()) {
            while(!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.peek();
    }
    
    public boolean empty() {
        // 当两个栈为 null，当前队列 empty == true
        return inputStack.isEmpty() && outputStack.isEmpty();
    }


    public static void main(String[] args) {
        Solution232 solution232 = new Solution232();
        solution232.push(1);
        solution232.push(2);
        solution232.push(3);

        System.out.println(solution232.peek());  // accert == 1
        System.out.println(solution232.pop());   // accert == 1
        System.out.println(solution232.empty()); // accert == false

    }
}