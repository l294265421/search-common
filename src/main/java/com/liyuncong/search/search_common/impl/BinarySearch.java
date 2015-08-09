package com.liyuncong.search.search_common.impl;

import com.liyuncong.search.search_common.Search;

public class BinarySearch implements Search{

	public <T extends Comparable<T>> T search(T[] a, T x) {
		return this.search(a, x, 0, a.length);
	}

	public <T extends Comparable<T>> T search(T[] a, T x, int left, int right) {
		// 找到根元素位置
		int mid = (left + right) / 2;
		// 等于处理根节点
		// right小于等于left的情况（数组中只有一个或没有元素，是基本情况）
		if (left > right || (left == right && a[mid].compareTo(x) != 0)) {
			return null;
		}
		// right大于left的情况
		// right大于left和right小于等于left的情况中a[mid] == x的情况合并在一起
		if (a[mid].compareTo(x) == 0) {
			return x;
		}
		// 等于继续在左右子树中查找
		if (x.compareTo(a[mid]) > 0) {
			return search(a, x, mid + 1, right);
		} else {
			return search(a, x, left, mid - 1);
		}		
	}

}
