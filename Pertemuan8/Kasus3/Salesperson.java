package Pertemuan8.Kasus3;

//*****************************************************
// Salesperson.java
//
// Represents a sales person who has a first name,
// last name, and total number of sales.
//*****************************************************
public class Salesperson implements Comparable<Salesperson>{
    private String firstName, lastName;
    private int totalSales;

    //-----------------------------------------------------
    // Constructor : Sets up the sales person object with
    //               the given data.
    //-----------------------------------------------------
    public Salesperson (String first, String last, int sales){
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    //-----------------------------------------------------
    // Returns the sales person as a string.
    //-----------------------------------------------------
    public String toString(){
        return (lastName + ", " + firstName + ": \t" + totalSales);
    }

    //-----------------------------------------------------
    // Returns true if the sales people have
    // the same name.
    //-----------------------------------------------------
    public boolean equals (Object other)
    {
    	return (lastName.equals(((Salesperson)other).getLastName()) && firstName.equals(((Salesperson)other).getFirstName()));
    }
    
    //-----------------------------------------------------
    // Order is based on total sales with the name
    // (last, then first) breaking a tie.
    //-----------------------------------------------------
    public int compareTo(Salesperson other) {
        if (this.totalSales < other.totalSales) {
            return 1;
        } else if (this.totalSales > other.totalSales) {
            return -1;
        } else {
            // If total sales are the same, use the name to break the tie in descending alphabetical order
            int nameComparison = other.lastName.compareTo(this.lastName); // Compare in descending order
            if (nameComparison != 0) {
                return nameComparison;
            } else {
                return other.firstName.compareTo(this.firstName); // Compare in descending order
            }
        }
    }
    
    //-----------------------------------------------------
    // First name accessor.
    //-----------------------------------------------------
    public String getFirstName()
    {
    	return firstName;
    }
    
    //-----------------------------------------------------
    // Last name accessor.
    //-----------------------------------------------------
    public String getLastName()
    {
    	return lastName;
    }
    
  //-----------------------------------------------------
    // Total sales accessor.
    //-----------------------------------------------------
    public int getSales()
    {
    	return totalSales;
    }
}