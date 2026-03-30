package practice;
import java.util.*;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        List<Integer> list = Arrays.asList(15,22,8,40,12,35,50,5);

		        int sum = list.stream()
		                .sorted((a, b) -> b - a)
		                .limit(3)
		                .mapToInt(Integer::intValue)
		                .sum();

		        System.out.println(sum);
		        
		        
		        
		        //Question -2
		        
		        int secondSmallest = list.stream()
		                .sorted()
		                .skip(1)
		                .findFirst()
		                .get();

		        System.out.println(secondSmallest);
		        
		        
		        //Question 3
		        
		        int sumSq = list.stream()
		                .filter(n -> n % 2 == 0)   
		                .filter(n -> n > 10)       
		                .map(n -> n * n)           
		                .mapToInt(Integer::intValue)
		                .sum();

		        System.out.println(sumSq);

	}

}
