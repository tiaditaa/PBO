package Pertemuan8.Kasus3;

import java.util.Scanner;

public class ModifyWeeklySales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many salespeople do you want to rank? ");
        int numSalespeople = scan.nextInt();
        scan.nextLine(); // Consuming the newline character

        Salesperson[] salesStaff = new Salesperson[numSalespeople];

        for (int i = 0; i < numSalespeople; i++) {
            System.out.print("Enter first name for salesperson " + (i + 1) + ": ");
            String firstName = scan.nextLine();
            
            System.out.print("Enter last name for salesperson " + (i + 1) + ": ");
            String lastName = scan.nextLine();
            
            System.out.print("Enter total sales for salesperson " + (i + 1) + ": ");
            int totalSales = scan.nextInt();
            scan.nextLine(); // Consuming the newline character
            
            salesStaff[i] = new Salesperson(firstName, lastName, totalSales);
        }

        Sorting.insertionSort(salesStaff);

        System.out.println("\nRanking of Sales for the Week\n");

        for (Salesperson s : salesStaff) {
            System.out.println(s);
        }
    }
}