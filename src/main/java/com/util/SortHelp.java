package com.util;

import java.math.BigDecimal;

public class SortHelp implements Comparable<SortHelp>{
	private int sort;
	private String value;
	
	public SortHelp() {
	}
	public SortHelp(int sort, String value) {
		this.sort = sort;
		this.value = value;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "sort="+sort+",value="+value;
	}
	@Override
	public int compareTo(SortHelp o) {
		// TODO Auto-generated method stub
		return new BigDecimal(this.value).compareTo(new BigDecimal(o.getValue()));
	}
}
