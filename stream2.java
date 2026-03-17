package API;
import java.util.*;
//import java.util.A



public class stream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
//	list.addAll(List.of"(aalu",'gazar', 'mulli'));
		list.add("aalu");
		list.addAll(List.of("allu","gazar","mulli"));
		System.out.println(list);
		
		
		System.out.println("count="+list.stream().filter(element)->element>60).count());
		
	}

}
