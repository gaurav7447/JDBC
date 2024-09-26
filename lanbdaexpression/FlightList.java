package com.lanbdaexpression;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightList {

	public static void main(String[] args) {
		
		Flights f1=new Flights(5,"Indigo", "Pune", "Mumbai", 1.5);
		Flights f2=new Flights(5,"Kingfisher", "Pune", "Mumbai", 1.5);
		Flights f3=new Flights(5,"Amirates", "Pune", "Mumbai", 1.5);
		Flights f4=new Flights(5,"Indigo", "Pune", "Mumbai", 1.5);
		Flights f5=new Flights(5,"Indigo", "Pune", "Mumbai", 1.5);
		Flights f6=new Flights(5,"Indigo", "Pune", "Mumbai", 1.5);
		
		ArrayList<Flights> al=new ArrayList<Flights>();
		al.add(f1);
		al.add(f2);
		al.add(f3);
		al.add(f4);
		al.add(f5);
		al.add(f6);
		
		Collections.sort(al,(fl1,fl2)->{
			if(fl1.Id>fl2.Id) {
				
				return 1;
				
			}
			else if(fl1.Id<fl2.Id) {
				return -1;
				
			}
			else {
				return 0;
			}
			
		});
		
		
		al.forEach((f)-> {System.out.println(f.Id+" "+f.name+" "+f.from+" "+f.to+" "+f.duration);});
		
		
		

	}

}
