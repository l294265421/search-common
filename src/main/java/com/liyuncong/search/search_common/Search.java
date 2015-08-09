package com.liyuncong.search.search_common;

public interface Search {
	public <T extends Comparable<T>> T search(T[] a, T x);
	public <T extends Comparable<T>> T search(T[] a, T x, int left, int right);
}
