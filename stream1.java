package API;
import java.util.*;
//import java.util.function.Consumer;
import java.util.stream.Stream;

public class stream1 {
	public static void main(String[]args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(45);
		list.addAll(List.of(23,45,45,6,7,46));
		System.out.println(list);
		Stream listStream=list.stream();
		//list.stream().filter(n->n>30.forEach(element)->System.out.println(element));
		listStream.forEach((element)->System.out.println(element+ " "));
		listStream.forEach(System.out::println);
		System.out.println();
		//System.out.println("count="+list.stream().count());
		System.out.println("count="+list.stream().filter((item)->item>30).count());
		//Stream listStream=list.stream();
		
	}

}
