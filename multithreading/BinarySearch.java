package com.multithreading;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter element in array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be searched");
		int target=sc.nextInt();
		
		int first=0;
		int last=arr.length-1;
		int mid=0;
		int flag=0;
		
		while(first<=last) {
			mid=(last+first)/2;
			if(target==arr[mid]) {
				
				flag=1;
				break;
			
			}
			else if(target<arr[mid]) {
				last=mid-1;
			}
			else {
				first=mid+1;
			}
		}
		if(flag==1) {
			System.out.println("Number found in Index = " +mid);
		}
		else {
			System.out.println("Search not found");
		}
				
				
				
			
	}

}
