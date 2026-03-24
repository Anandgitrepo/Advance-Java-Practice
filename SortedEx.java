package java10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= Arrays.asList(23,12,1,45,23,76,26,91);
		System.out.println(list);
		List<Integer> sortedList=list.stream().sorted().toList();
		System.out.println(sortedList);
		List<Integer> sortedList1=list.stream().sorted((a,b)->a-b).toList();		//read- comparetor and comparable operator -->imp
		System.out.println(sortedList1);
		List<Integer> sortedList2=list.stream().sorted((a,b)->b-a).toList();
		System.out.println("descending order="+sortedList2);
		List<Integer> sortedList3=list.stream().sorted((Comparator.reverseOrder()).toList();
		System.out.println("descending order="+sortedList3);

	}

}
