package com.lanbdaexpression;

public class WorldCup24T20 implements WorldCup{

	public static void main(String[] args) {
		WorldCup first=new WorldCup24T20(); // normal 
		System.out.println(first.position());
		
		WorldCup runnersup =new WorldCup(){  //  by using anonymous function 
			public String position() {
				return "South Africa was runnerup";
			}
		};
		System.out.println(runnersup.position());
		
		
		//calling position method using lambda expression
		WorldCup second= ()->{return "Australia";};  //Lambda Function syntax or using lambda expression 
		System.out.println(second.position());

	}

	@Override
	public String position() {
		
		return "India Won the Match";
	}

}
