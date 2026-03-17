package API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class firstletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> data= Arrays.asList("Amit","Ravi","Anil","Vikas" , "Ashok","Rahul");
		
		
		ArrayList<String> list= new ArrayList<String>();
		
		
		
		list.addAll(List.of("Amit","Ravi","Anil","Vikas","Ashok","Rahul"));
		
		
		
		list.stream().filter(s -> s.charAt(0) == 'A').forEach(s -> System.out.print(s + " "));
		
		

	}

}
