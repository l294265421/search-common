package com.liyuncong.search.search_common.impl;

import org.junit.Test;

public class TestBinarySearch {
	@Test
	public void testSearch() {
		Integer[] integers = new Integer[] {new Integer(3), new Integer(13),
		new Integer(15),new Integer(24),new Integer(34)};
		
		System.out.println(new BinarySearch().search(integers, new Integer(34)));
	}
}
