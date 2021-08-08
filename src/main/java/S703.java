import java.util.PriorityQueue;

/**
 * LC#703：数据流中的第 K 大元素
 * Link：https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/
 * Solution：维护一个 MinHeap，保证堆的 size = K，堆顶为 K 元素，如果比 K 小则无法进入堆，如果比 K 大则自动淘汰最小元素，时间复杂度 O(1)
 * @author Phoenix on 2021/8/8.
 */
public class S703 {

    // 直接使用 Java PriorityQueue（默认小顶堆）
    final PriorityQueue<Integer> q;
    final int k;

    public S703(int k, int[] a) {
        this.k = k;
        q = new PriorityQueue<>(k);
        // 加入堆顶
        for (int n : a) {
             add(n);
        }
    }

    public int add(int n) {
        if (q.size() < k) {
            q.offer(n);
        }else if (q.peek() < n) {
            q.poll();
            q.offer(n);
        }
        return q.peek();
    }

    @Override
    public String toString() {
        return "S703{" +
                "q=" + q +
                ", k=" + k +
                '}';
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 8, 2};
        S703 s = new S703(3,  a);
        s.add(3);
        s.add(5);
        s.add(10);
        s.add(9);
        s.add(4);

        System.out.println(s);
    }

}
