package algorithms.java.easy;

/**
 * 最基本的二分查找
 * 思想：
 * 1：获得检查变量：从数组中获取 low, high 开始和末尾的下标
 * 2：进入检查条件：如果 high low 产生交集则代表数组已经遍历完成，所以使用条件： while (high >= low)
 * 3: 获得 mid：通过公式 (high + low / 2) 获得当前范围的中位数
 * 4：
 * 结果的 3种可能性：
 * 1 值相等 target：array[mid] == target 返回 mid 作为结果
 * 2 值大于 target：缩小 high 的范围 high = mid - 1
 * 3 值小于 target：扩大 low 的范围  low = mid + 1
 * @author Phoenix on 2020/12/3 5:58 下午
 */
public class BinarySearch {

    public static int binarySearchIndex(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (high >= low) {
            int mid = (high + low) / 2;
            int e = array[mid];
            if (e == target) {return mid;}
            if (e > target) { high = mid - 1;}
            if (e < target) { low = mid + 1; }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrays = {0, 1, 2, 3, 4, 5};
        int searchIndex = BinarySearch.binarySearchIndex(arrays, 3);
        System.out.println("result :" + searchIndex);
    }
}
