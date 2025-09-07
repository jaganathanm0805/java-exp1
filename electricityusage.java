package exp1; 
	import java.util.Scanner;
	public class electricityusage {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int totalUnits = 0;
	        for (int month = 1; month <= 12; month++) {
	            System.out.print("Enter electricity units for month " + month + ": ");
	            int units = sc.nextInt();
	            totalUnits += units;
	        }
	        double average = totalUnits / 12.0;
	        System.out.println("Total units used: " + totalUnits);
	        System.out.println("Average monthly usage: " + average);
	        if (average > 500) {
	            System.out.println("Warning: High Consumption Alert!");
	        }
	    }
	}

