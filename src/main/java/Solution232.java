import java.util.Stack;

/**
 * LC#232 Implement Queue using Stacks
 * Link：https://leetcode-cn.com/problems/implement-queue-using-stacks/
 * 思路：使用负负得正的思路，使用两个 Stack（inputStack，outputStack）实现队列的 FIFO 特性
 */
public class Solution232 {

    private Stack<Integer> inputStack = null;
    private Stack<Integer> outputStack = null;

    public Solution232() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public void push(int x) {
        inputStack.push(x);
    }
    
    public int pop() {
        if (outputStack.isEmpty()) {
            while(!inputStack.empty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.pop();
    }
    
    public int peek() {
        if(outputStack.isEmpty()) {
            while(!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.peek();
    }
    
    public boolean empty() {
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