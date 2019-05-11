package algorithms.java.easy;

/**
 * #21: Merge Two Sorted Lists
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * 思路：
 * 1 跟合并有序数组差不多
 */
public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //方式一：移动指针对比，时间复杂度 O（n）
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode p = l1;
        ListNode q = l2;

        ListNode headNode;  //定义头节点
        if(p.val < q.val) {
            headNode = p;
            p = p.next;     //定义头节点，并且移动p节点引用
        } else {
            headNode = q;
            q = q.next;
        }
        ListNode r = headNode;      //定义r作为头节点的移动引用
        while (p != null && q != null) {
            if(p.val < q.val) {
                r.next = p;         //通过比较，不断改变r.next引用的对象
                p = p.next;         //p节点移到下一个元素的引用
            } else {
                r.next = q;
                q = q.next;
            }
            r = r.next;     //移动r引用，类似冒泡排序
        }

        if(p != null) {
            r.next = p;     //当只有一个链表不为null，r.next引用该对象
        } else {
            r.next = q;
        }
        return headNode;
    }

    /**
     * 定义链表节点
     */
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int data, ListNode next) {
            this.val = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        //建立链表
        ListNode n1 = new ListNode(4, null);
        ListNode n2 = new ListNode(2, n1);
        ListNode n3 = new ListNode(1, n2);

        ListNode n4 = new ListNode(4, null);
        ListNode n5 = new ListNode(3, n4);
        ListNode n6 = new ListNode(1, n5);

        ListNode mergeNode = MergeTwoSortedLists.mergeTwoLists(n3, n6);
        //打印链表
        while (mergeNode != null) {
            System.out.print(mergeNode.val + ">");
            mergeNode = mergeNode.next;
        }
    }
}