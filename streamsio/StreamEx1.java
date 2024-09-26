package com.streamsio;
//stream can only used to manipulate data it cannot used to update data.
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx1 {

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<String>();
		names.add("Siddharth");
		names.add("Priyanka");
		names.add("Vaishnavi");
		names.add("Tejashri");
		names.add("Shubham");
		names.add("Sandhya");
		names.add("Swapnil");
		names.add("Pooja");
		names.add("Sachin");
		
		
		
		List<String> s_name=names.stream()        //stream the list
				.filter((n)->n.startsWith("S"))   // filter-> used to filter the list
				.sorted()                         // To sort the list 
				.map(n->n)                        // map->map the filtered data.
			  //.map(n->n+" Cyber")               //map is also used to add new string into list
				.collect(Collectors.toList());    // collect-> collect the mapped data into list (tolist())
		
		System.out.println(s_name);
		
		List<Integer> num=new ArrayList<Integer>();
		num.add(55);
		num.add(10);
		num.add(74);
		num.add(79);
		num.add(11);
		num.add(18);
		num.add(65);
		num.add(84);
		num.add(36);
		num.add(99);
		//for odd number
		List<Integer> odd=num.stream()
				.filter(n->n%2 !=0)     //filtered the stream into odd number
				.sorted()               //sort the filtered list
				.map(n->n*n)            //map the odd sorted number to their square
				.collect(Collectors.toList()); //collect the square of sorted number into list.
		
		System.out.println(odd);
		
		
		//for even number
		List<Integer> even=num.stream()
				.filter(n->n%2 ==0)     //filtered the stream into even number
				.sorted()               //sort the filtered list
				.map(n->n*n)            //map the even sorted number to their square
				.collect(Collectors.toList()); //collect the square of sorted number into list.
		
		System.out.println(even);
		
		int add=num.stream().map(x->x).reduce(0, (sum,n)->sum+n);
		System.out.println(add);
		int add2=num.stream().map(x->x).reduce(0,Integer::sum);
		System.out.println(add2);
		//using collectors
		int add3=num.stream().collect(Collectors.summingInt(x->x));
		System.out.println(add3);
		
		
		List<Integer> num1=new ArrayList<Integer>();
		num1.add(1);
		num1.add(2);
		num1.add(3);
		num1.add(4);
		num1.add(5);
		num1.add(6);
		
		//multiplication
		int multiplication=num1.stream().map(x->x).reduce(1, (mult,n)->mult*n);
		System.out.println(multiplication);
		
		//factorial
		int fact=num1.stream().map(x->x).reduce(1, (facto,n)->facto*n);   
		System.out.println(fact);
		
		//average
		double avg=num1.stream().collect(Collectors.averagingDouble(x->x));
		System.out.println(avg);
		
		
		//count of number in list by using count().
		long count=num1.stream().map(x->x).count();
		System.out.println(count);
		
		
		//count of odd number in list by using count().
				long count1=num1.stream().filter(n->n%2!=0).map(x->x).count();
				System.out.println(count1);
				
	
		
				
		
		
	
		
	}

}
