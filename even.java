package API;

import java.util.Arrays;
import java.util.ArrayList;

import java.util.*;
//import java.util.predicate;
//practice question 01
public class even {

			public static void main(String[]args) {
				
				// TODO Auto-generated method stub
				List<Integer> data = Arrays.asList(24,56,23,45,67);			//diff between arrays.asList and asOf
				System.out.println(data);
				ArrayList<Integer> list= new ArrayList<Integer>();
				list.add(23);
				list.add(45);
				list.addAll(List.of(23,45,67,78,47,85,112,81,94));
				list.addAll(data);
				
				//for printing even elements 
				
				//System.out.println(list);
				list.stream().filter((n)->n%2==0).forEach((n)->System.out.print(n+" "));
				
				
			}

		

	}


