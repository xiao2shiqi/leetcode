package main

import "fmt"

/**
 * LC#3：无重复字符的最长子串
 * Link：https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence/
 * 思路1：两层循环计数，从当前字符开始计算每个字符出现的最大序列，并且使用 ans 保存最长序列
 */
func lengthOfLongestSubstring(s string) int {
	// 哈希集合，用于记录字符
	m := map[byte]int{}
	n := len(s)
	ans, p := 0, -1
	for i := 0; i < n; i++ {
		if i != 0 {
			// 移除已检查过的元素
			delete(m, s[i-1])
		}
		// 从指针开始，遍历子序列
		for p+1 < n && m[s[p+1]] == 0 {
			m[s[p+1]]++
			p++
		}
		if ans < p-i+1 {
			ans = p - i + 1
		}
	}
	return ans
}

func main() {
	s := "dvdf"
	res := lengthOfLongestSubstring(s)
	fmt.Print("res >>", res)
}
