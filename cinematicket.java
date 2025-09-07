package exp1;
import java.util.Scanner;
public class cinematicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter day of booking (Mon, Tue, Wed, Thu, Fri, Sat, Sun): ");
        String day = sc.nextLine();
        int basePrice = 200;
        int price = basePrice;
        if (age < 5) {
            price = 0; 
        } else if (age >= 5 && age <= 18) {
            price = basePrice - (basePrice * 40 / 100);
        } else if (age > 60) {
            price = basePrice - (basePrice * 30 / 100); 
        } 
        if (price > 0) {
            if (day.equalsIgnoreCase("Mon") || day.equalsIgnoreCase("Tue") ||
                day.equalsIgnoreCase("Wed") || day.equalsIgnoreCase("Thu") ||
                day.equalsIgnoreCase("Fri")) 
            {
                price = price - (price * 10 / 100);  
            }
        }
        if (price == 0) {
            System.out.println("Your ticket is Free.");
        } else {
            System.out.println("Your ticket price is ₹" + price);
        }

        sc.close();
    }
}
