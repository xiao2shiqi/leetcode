package algorithms.java.easy;

import java.util.Arrays;
import java.util.List;

/**
 * 二分查找
 * @author Phoenix on 2020/12/3 5:58 下午
 */

public class BinarySearch {


    public static int binarySearchIndex(int[] array, int n) {
        int low = 0;
        int high = array.length - 1;
        while (high >= low) {
            int mid = (high + low) / 2;     // 中位数
            int e = array[mid];
            if (e == n) {return mid;}
            if (e > n) { high = mid - 1;}
            if (e < n) { low = mid + 1; }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrays = {0, 1, 2, 3, 4, 5};
        int searchIndex = BinarySearch.binarySearchIndex(arrays, 3);
        System.out.println("result :" + searchIndex);
    }
}
