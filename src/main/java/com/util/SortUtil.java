package com.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**list排序
 * @author Administrator
 *
 */
public class SortUtil {

/**值和index排序
 * @param list 值
 * @param list2 index
 * @return
 */
private static List<List<String>> createSortListIndexAndValue(List<String> list, List<String> list2) {
	// TODO Auto-generated method stub
	List<List<String>> listIndexAndVal = new ArrayList<List<String>>();
	List<SortHelp> listSortHelp = new ArrayList<SortHelp>();
	listSortHelp = createListSortHelp(list);
	Collections.sort(listSortHelp);
	
	List<String> listValue = createListValue(listSortHelp);
	List<String> listInd = createListIndex(listSortHelp,list2);
	listIndexAndVal.add(listInd);
	listIndexAndVal.add(listValue);
	return listIndexAndVal;
}
/**根据排序后的辅助类中组合成index
 * @param listSortHelp
 * @param list
 * @return
 */
private static List<String> createListIndex(List<SortHelp> listSortHelp, List<String> list) {
	// TODO Auto-generated method stub
	List<String> dest = new ArrayList<String>();
	for(SortHelp s:listSortHelp) {
		dest.add(list.get(s.getSort()));
	}
	return dest;
}
/**从比较辅助类中解析出值
 * @param listSortHelp
 * @return
 */
private static List<String> createListValue(List<SortHelp> listSortHelp) {
	// TODO Auto-generated method stub
	List<String> dest = new ArrayList<String>();
	for(SortHelp s:listSortHelp) {
		dest.add(s.getValue());
	}
	return dest;
}
/**创建比较辅助类
 * @param list
 * @return
 */
private static List<SortHelp> createListSortHelp(List<String> list) {
	// TODO Auto-generated method stub
	int len = list.size();
	List<SortHelp> listSortHelp = new ArrayList<SortHelp>();
	SortHelp sortHelp;
	for(int i=0;i<len;i++) {
		sortHelp = new SortHelp(i,list.get(i));
		listSortHelp.add(sortHelp);
	}
	return listSortHelp;
}
private static void sortList(List<String[]> createCombination) {
	// TODO Auto-generated method stub
	
}
/**打印list元素为数组
 * @param list
 */
private static void printList(List<String[]> list) {
	// TODO Auto-generated method stub
	for(String[] s:list) {
		System.out.println(Arrays.toString(s));
	}
}
/**list组合返回数组
 * @param list
 * @return
 */
private static List<String[]> createCombination(List<List<String>> list) {
	// TODO Auto-generated method stub
	int len = list.size();
	int legend = list.get(0).size();
	List<String[]> dest = new ArrayList<String[]>();
	String[] temp;
	for(int i=0;i<legend;i++){
		temp = new String[len];
		for(int j=0;j<len;j++){
			temp[j] = list.get(j).get(i);
		}
		dest.add(temp);
	}
	return dest;
}
/**list组合返回字符串组合
 * @param list
 * @return
 */
private static List<String> createCategory(List<List<String>> list) {
	// TODO Auto-generated method stub
	int len = list.size();
	int legend = list.get(0).size();
	List<String> dest = new ArrayList<String>();
	StringBuffer sbf = new StringBuffer();
	for(int i=0;i<legend;i++){
		sbf = new StringBuffer();
		for(int j=0;j<len;j++){
			sbf.append(list.get(j).get(i));
			if(j<len-1){
				sbf.append("_");
			}
		}
		dest.add(sbf.toString()); 
	}
	return dest;
}
public static void main(String[] args) {
	List<List<String>> list = new ArrayList<List<String>>();
	/*list.add(Arrays.asList(new String[]{"ceshi1","1"}));
	list.add(Arrays.asList(new String[]{"ceshi3","3"}));
	list.add(Arrays.asList(new String[]{"ceshi2","2"}));
	list.add(Arrays.asList(new String[]{"ceshi4","4"}));*/
	list.add(Arrays.asList(new String[]{"ceshi1","ceshi3","ceshi2","ceshi4","ceshi11","ceshi31","ceshi21","ceshi41"}));
	list.add(Arrays.asList(new String[]{"1","3","2","4","11","31","21","41"}));
	//需要根据list2中的数值进行排序，并使用该排序对list1中的项进行排序操作
	//基本思路组合成对象之后进行排序即可
	
	String temp;
	List<String[]> listIndex = new ArrayList<String[]>();
	int len = list.size();
	/*for(int i=0;i<len;i++) {
		listIndex.add(new String[]{});
	}
	for(List<String> s:list){
		temp = s.get(1);
		
	}*/
	System.out.println(list);
	System.out.println(createCategory(list));
	//System.out.println(createCombination(list));
	//printList(createCombination(list));
	sortList(createCombination(list));
	List<SortHelp> listSortHelp = new ArrayList<SortHelp>();
	listSortHelp = createListSortHelp(list.get(1));
	System.out.println(listSortHelp);
	Collections.sort(listSortHelp);
	//反转
	Collections.reverse(listSortHelp);
	System.out.println(listSortHelp);
	List<String> listValue = createListValue(listSortHelp);
	System.out.println(listValue);
	List<String> listInd = createListIndex(listSortHelp,list.get(0));
	System.out.println(listInd);
	
	List<List<String>> listIndexAndVal = createSortListIndexAndValue(list.get(1),list.get(0));
	System.out.println(listIndexAndVal);
}
}

