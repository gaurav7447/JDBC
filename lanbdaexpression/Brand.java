package com.lanbdaexpression;

public class Brand {

	public static void main(String[] args) {
		Cardata c1=new Cardata("Mahindra","thar","Matte Black",1700000 ,"5 seater");
		Cardata c2=new Cardata("Tata","Nexon","RED",1200000 ,"4 seater");
	    Cardata c3=new Cardata("MarutiSuzuki","Alto","White",400000 ,"4 seater");
		
		
		Vehicle car1 = (c)->{
		System.out.println(c.company+" "+c.name+ " "+c.color+" "+c.price+" "+c.seating);
		
		};
		car1.details(c1);
		
		
		Vehicle car2 = (c)->{
			System.out.println(c.company+" "+c.name+ " "+c.color+" "+c.price+" "+c.seating);
			
			};
			car1.details(c2);
			
			
			Vehicle car3 = (c)->{
				System.out.println(c.company+" "+c.name+ " "+c.color+" "+c.price+" "+c.seating);
				
				};
				car1.details(c3);	

	}

}
