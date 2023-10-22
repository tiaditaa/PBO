package Pertemuan8.Kasus3;

import java.util.Scanner;

public class Number 
{
	//-------------------------------------------------
	//Reads in an array of integers, sorts them,
	//then prints them in sorted order.
	//-------------------------------------------------
	public static void main(String[] args)
	{
		Integer[] intList;    //merubah primitif int menjadi objek integer
		int size;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print ("\nHow many integers do you want to sort? ");
		size = scan.nextInt();
		intList = new Integer[size]; //menggunakan object
		
		System.out.println ("\nEnter the numbers...");
		for (int i = 0; i < size; i++)
			intList[i] = scan.nextInt();
		
	//	//primitive int -> menjadi object
		//asc
		Sorting.selectionSort(intList);
		
		//perintah descending
		Sorting.insertionSort(intList);
		
		System.out.println ("\nYour numbers in sorted order...");
		for (int i = 0; i < size; i++)
			System.out.print(intList[i] + " ");
		System.out.println();
	}
}