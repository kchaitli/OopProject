package com.xworkz.oops;

import java.util.*;
/*public class MaxValue {

	public static void main(String[] args) {
		
		int[] a= new int[] {20,30,50,40};
		int max= a[0];
		for(int i=1;i<a.length;i++) {if(a[i]>max)
		{
			max=a[i];
		}
		}
		
		System.out.println("the given array is: ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("The largest number is: "+max);

	}

}*/
public class MaxValue{
	
	public static void main(String []args) {
		
		int n,max;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number of elements in the array:");
		n=s.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		max=a[0];
		for(int i=0;i<n;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("Maximum value in the array is:"+max);
	}
}
