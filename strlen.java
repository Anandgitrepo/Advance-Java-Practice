package API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class strlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data= Arrays.asList("java","python","c","react" , "c#","Next.js","Node.js");
		
		
		ArrayList<String> list= new ArrayList<String>();
		
		
		
		list.addAll(List.of("java","python","c","react" , "c#","Next.js","Node.js"));
		
		
		
		list.stream().filter(s -> s.length() > 4).forEach(s -> System.out.print(s + " "));
		

	}

}
