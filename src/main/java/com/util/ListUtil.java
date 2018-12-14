package com.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListUtil {
	public static <T> List<T> removeDuplicate(List<T> list) {
		
		Map<T, Integer> map = new HashMap<T, Integer>();
		List<T> dest = new ArrayList<T>();
		for(T s:list) {
			if(!map.containsKey(s)) {
				dest.add(s);
				map.put(s, 1);
			}
		}
		return dest;
	}
	public static void main(String[] args) {
		System.out.println(removeDuplicate(Arrays.asList(new String[]{"ceshi1","ceshi3","ceshi2","ceshi4","ceshi1","ceshi3","ceshi2","ceshi4"})));
	}
}
