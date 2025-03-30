import java.util.Scanner;
class CustomerBill {

   public static void main(String[] args) {
      
      // Details
      Scanner input = new Scanner(System.in);
      System.out.print("Enter brand of phone: ");
      String brand = input.nextLine();
      System.out.print("Enter color of phone: ");
      String color = input.nextLine();
      System.out.print("Enter price of phone: ");
      double price = input.nextDouble();
      System.out.print("Enter quantity of phone: ");
      int quantity = input.nextInt();
      
      // The Gross Total, VAT, and Net Total
      double grossTotal = price * quantity;
      double vat = 0.038 * grossTotal;
      double netTotal = grossTotal + vat;
      
      // Display the details of the customer's bill
      System.out.println("Brand: " + brand);
      System.out.println("Color: " + color);
      System.out.println("Price: " + price);
      System.out.println("Quantity: " + quantity);
      System.out.println("Gross Total: " + grossTotal);
      System.out.println("VAT (3.8%): " + vat);
      System.out.println("Net Total: " + netTotal);
      
      // Ask for payment and compute change
      System.out.print("Enter payment: ");
      double payment = input.nextDouble();
      double change = payment - netTotal;
      
      // Display the change
      System.out.println("Change: " + change);
      
      input.close();
   }
}