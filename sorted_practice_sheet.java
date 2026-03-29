package java10;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class sorted_practice_sheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question -1 
		List<Integer> list= Arrays.asList(12,5,33,9,21,1);
		List<Integer>sortedList= list.stream().sorted((a,b)->b-a).toList();
		System.out.println(sortedList);
		
		
		//Question-2
		List<Integer> list1= Arrays.asList(12,5,33,9,21,1);
		List<Integer>sortedList1= list.stream().sorted((a,b)->a-b).toList();
		System.out.println(sortedList);
		
		//Question-3
		List<Integer> list2= Arrays.asList(18,42,7,91,33,4);
		List<Integer> sortedList2=list.stream()
				.sorted().skip(list.size()-3).toList();
		
		List<Integer> list3= Arrays.asList(18,42,7,91,33,4);
		List<Integer> sortedList3=list.stream()
				.sorted().limit(3).toList();
		
		//Question- 4
		
//		List<Integer>list4= Arrays.asList(14,9,20,7,6,11,32,3);
//		List<Integer> sortedList4=list.stream()
//				.sorted((a,b)->b%2==0).toList();
//		System.out.println(sortedList4);
		
		//Question - 7-> 2nd max
		
		List<Integer>list5= Arrays.asList(14,9,20,7,6,11,32,3);
		System.out.println(list5);
		Integer second=list.stream().sorted(Comparator.reverseOrder())
				.toList().get(1);
		System.out.println(second);
		
		//Question-8
		
		List<Integer>list6=Arrays.asList(8,26,13,41,19,32,5);
		
		//List<Integer>sortedList5
		
		//Question-10;
		
		List<String>names=Arrays.asList("Ravi","Ankit","zoya","Meena","kunal");
		System.out.println(names);
		List<String> sortedName = names.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(sortedName);
        
        List<String> sortedName2 = names.stream()
                .sorted((a,b)->a.compareTo(b))
                .toList();

        System.out.println(sortedName2);
        
        //Question- 11
        
        List<String> sortedName3 = names.stream()
                .sorted((a,b)->b.compareTo(a))
                .toList();

        System.out.println(sortedName3);
        
        //Question- 12
        
        
        List<String>names4=Arrays.asList("java","Springboor","Api","Microservices");
        List<String> sortedName4 = names4.stream()
                .sorted((a,b)->b.length()-a.length())
                .toList();

        System.out.println(sortedName4);
        
        //Q-17. list<employee>list=new ArrayList(new employee(1,"rahul",2000,"IT");
        //we have 5 elements  in this list: like e1, e2, e3, e4, and e5;
        //now , sort the list with salary and department value ;
        
        
        List<employee> sortedList8 = list.stream()
                .sorted((e1, e2) -> {
                    if (e1.getSalary() == e2.getSalary()) {
                        return e1.getDept().compareTo(e2.getDept()); 
                    }
                    return (int)(e1.getSalary() - e2.getSalary()); 
                })
                .toList();
		
	
		
	}

}
