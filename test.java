package demoJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(5,3,4,1,3,7,2,9,9,4);//of{10,5,80,29,7,29,75, 3, 4, 1, 3, 7, 2, 9, 9, 4} ;

		
		System.out.println(111 + 222 +"codejava");

		
		System.out.println("codejava" + 111+222);

	
		//Q. Write a program to count the occurrence of each character in a given string. i.e. string is “HELLO JAVA DEVELOPER”

		String s="HELLO JAVA DEVELOPER";
		Map<String,Integer> lstCount=new HashMap<String,Integer>();
		for(int i=0;i<s.length();i++) {
			String mapValue=Character.toString(s.charAt(i));
			//String mapValue=mapValue1.isBlank()?"WhiteSpace":mapValue1;
			if(mapValue.isBlank()) {continue;}
			if(lstCount.containsKey(mapValue)) {
				lstCount.put(mapValue,lstCount.get(mapValue)+1);
			}else {
				lstCount.put(mapValue, 1);
			}
			
		}
		
		System.out.println("lstCount"+lstCount);



		//list.add(10);list.add(9);list.add(29);list.add(7);list.add(29);list.add(7);

		//Map<Integer,Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//Map<Integer,Long> map = list.stream().filter(e-> String.valueOf(e).endsWith("9")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Set<Integer> value= new HashSet<Integer>();
		Set<Integer> streamlist=list.stream().filter(n->!value.add(n)).collect(Collectors.toSet());
		System.out.println(streamlist);
		
		List<Integer> list1 = Arrays.asList(5,3,4,1,3,7,2,9,9,4);
		Map<Integer, Long> slist=list1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(slist);
		Set<Integer> list2=list1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(v->v.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet());
		
		System.out.println(list2);
		List<Integer> list3 = Arrays.asList(5,3,4,1,3,7,2,9,9,4,19,29);
		List<Integer> slist3=list3.stream().filter(v->String.valueOf(v).endsWith("9")).collect(Collectors.toList());
		System.out.println(slist3);
		
		List<Integer> list4 = Arrays.asList(5,3,4,1,3,7,2,9,9,4,19,29);
		List<Integer> slist4= list4.stream().sorted().filter(v->(v.intValue()>=7 && v.intValue()<=19)).collect(Collectors.toList());
		System.out.println(slist4);
	}

}
