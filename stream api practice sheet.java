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
		        
		        //Question 4
		       
		        int maxEven = list.stream()
		                .filter(n -> n % 2 == 0)   
		                .max(Integer::compareTo)   
		                .get();

		        System.out.println(maxEven);
//		       
//		       //QUESTION 5
//		        	
		        list.stream()
	            .sorted((a, b) -> b - a) // descending
	            .limit(3)
	            .forEach(System.out::println);
		        	
		       //Question 6- multiply every number by 3 and find minimum
		        	
		        	
		        	
		        	
		       //Question 7- sum of numbers between 10 to 40
		        	
		        int min = list.stream()
		                .map(n -> n * 3)          
		                .min(Integer::compareTo)  
		                .get();

		        System.out.println(min);
		        	
		       //Question -8 - third largest numbers
		        
		        int thirdLargest = list.stream()
		                .sorted((a, b) -> b - a) // descending
		                .skip(2)
		                .findFirst()
		                .get();

		        System.out.println(thirdLargest);
		        	
		      
		      //Question -9- sum of smallest 4 numbers
		        	
		        int sum2 = list.stream()
		                .sorted()       // ascending
		                .limit(4)       
		                .mapToInt(Integer::intValue)
		                .sum();

		        System.out.println(sum2);
		        	
		     //Question -10 convert  numbers into square and print only top 4 values
		        	
		        list.stream()
                .map(n -> n * n)           
                .sorted((a, b) -> b - a)   
                .limit(4)                  
                .forEach(System.out::println);
		        	
		     //Question - 11 largest numbers after skipping the first 3 numbers 
		        	
		        int result = list.stream()
		                .sorted((a, b) -> b - a) 
		                .skip(3)                 
		                .findFirst()             
		                .get();

		        System.out.println(result);
		        	
		     //Question- 12 - smallest odd greater then 20
		        	
		          int result1 = list.stream()
		                  .filter(n -> n % 2 != 0)  
		                  .filter(n -> n > 20)      
		                  .min(Integer::compareTo)  
		                  .get();

		          System.out.println(result1);
		     
		     //Question 13- product of all numbers greater than 5
		          
		          int product2 = list.stream()
		        	        .filter(n -> n > 5)
		        	        .reduce(1, (a, b) -> a * b);
		          System.out.println(product2);
		          
		      //Question 14- sort the list skip the  first 2 smallest numbers then find the minimum value
		          
		          int result3 = list.stream()
		        	        .sorted()
		        	        .skip(2)
		        	        .min(Integer::compareTo)
		        	        .get();
		          System.out.println(result3);
		          
		      //Question 15- maximum square of odd numbers 
		          
		          int max = list.stream()
		        	        .filter(n -> n % 2 != 0)
		        	        .map(n -> n * n)
		        	        .max(Integer::compareTo)
		        	        .get();
		          System.out.println(max);
		        		  
		   //Question 16- even numbers toup 3 sum
		        		  
		          int sum3 = list.stream()
		        	        .filter(n -> n % 2 == 0)
		        	        .sorted((a, b) -> b - a)
		        	        .limit(3)
		        	        .mapToInt(Integer::intValue)
		        	        .sum();
		          System.out.println(sum3);
		        		  
		        		  
		  // Question 17- 
		        		  
		        		  
		        		  
		 //Question 18- 
		        		  
		        		  
		    //Question 19- 
		        		  

	}

}
