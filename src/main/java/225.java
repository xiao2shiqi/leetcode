import java.util.LinkedList;
import java.util.Queue;

/**
 * LC#225. Implement Stack using Queues
 * Link：https://leetcode-cn.com/problems/implement-stack-using-queues/
 * 思路1：使用双队列实现，类似 LC#232 负负得正实现 Stack 的 FILO 的特性
 * 思路2：使用单队列实现，push 入队后，通过 for.offer/poll 将队列倒排，模拟 Stack FILO 特性
 */
public class Solution225 {

    Queue<Integer> queue;

    public Solution225() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        int n = queue.size();
        queue.offer(x);
        for (int i = 0; i < n; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }


    public static void main(String[] args) {
        Solution225 solution = new Solution225();
        solution.push(1);
        solution.push(2);
        solution.push(3);
        solution.push(4);
        solution.push(5);

        System.out.println("pop:" + solution.pop());
        System.out.println("top:" + solution.top());
        System.out.println("empty" + solution.empty());

    }
}
