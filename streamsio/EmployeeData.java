package com.streamsio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeData {

	public static void main(String[] args) {
		Employee emp1=new Employee(101,"Gaurav Deshmane","Java","Mohol",5000);
		Employee emp2=new Employee(102,"Kapil Pise","developer","pandharpur",23500);
		Employee emp3=new Employee(103,"Rohan Pardise","tester","las vegas",778200);
		Employee emp4=new Employee(104,"Kedar Kolwar","manager","nagasaki",56900);
		Employee emp5=new Employee(105,"Sachin Kokare","developer","kothrude",75810);
		Employee emp6=new Employee(106,"Siddharth Sirohia","clerk","gangtok",50000);
		
		
		List<Employee> employ=new ArrayList<Employee>();
		employ.add(emp1);
		employ.add(emp2);
		employ.add(emp3);
		employ.add(emp4);
		employ.add(emp5);
		employ.add(emp6);
		
		//filtering the data with the domain basic
		System.out.println("-----------------------------Domain Basic----------------------------------");
		List<Employee> empl= employ.stream()
				.filter(e->e.domain.equals("developer"))        //filtered the data using employee domain 
				.map(e->e)                                       //map the data 
				.collect(Collectors.toList());                   
		
		empl.forEach((e)->System.out.println(e.id+" "+e.name+" "+e.domain+" "+e.salary));
		
		System.out.println("-------------------------Salary--------------------------------------");
		//filtering the data with salary 
		List<Employee> empl1= employ.stream()
				.filter(e->e.salary>10000)        //filtered the data using employee salary 
				.map(e->e)                                       //map the data 
				.collect(Collectors.toList());                   
		
		empl1.forEach((e)->System.out.println(e.id+" "+e.name+" "+e.domain+" "+e.salary));
		
		
		System.out.println("--------------------------Getting only name form list and printing-------------------------------------");
		List<String> empl2= employ.stream()
				.filter(e->e.domain.equals("developer"))        //filtered the data using employee domain 
				.map(e->e.name)                                       //map the data 
				.collect(Collectors.toList());                   
		
		empl2.forEach(n->System.out.println(n));
	
		//maximum salary form list using max()
		Employee salmax=employ.stream().max((empp1,empp2)->empp1.salary>empp2.salary?1:-1).get();
		System.out.println(salmax.salary);
		
		//minimum salary from list using min().
		Employee salmin=employ.stream().min((empp1,empp2)->empp1.salary>empp2.salary?1:-1).get();
		System.out.println(salmin.salary+" "+salmin.name);
		
		//extracting the data from list in key-value pair
		Map<Integer,String> empdata=employ.stream()
				.map(e->e)
				.collect(Collectors.toMap(e->e.id, e->e.name));
		System.out.println(empdata);
		
		
		
		
		
		
		
		

	}

}
