import java.util.Scanner;

/* You have been assigned to create a system to manage products in a retail store.
 Create a class called Product with the productId (int), productName (String), price
 (double), and quantity (int) as attributes.
 (a) Create Getters and Setters for each attribute. Apply the below validation in the
 setters:
 • price should always be greater than 0.
 • quantity should not be negative.
 (b) Implement a method called displayDetails() to print the product information.
 (c) Implement a method called calculateTotalValue() to calculate and return the total
 value of the stock.
 Total Value = price * quantity
 Create another class named ProductApp containing the main method to do followings:
 (a) Create a Product object.
 (b) Accept user input to set values for each attribute using setters.
 (c) Display the product details using displayDetails().
 (d) Display the total value of the product stock using calculateTotalValue().
 */
public class Product {
    private int prodcutId;
    private String productName;
    private double price;
    private int quantity;
    private double total;

    //create setters and getters

    public String getProductName() {
        return productName;
    }

    public void setProductName(String prouctName) {
        productName = prouctName;
    }

    public int getProductId() {
        return prodcutId;
    }

    public void setProductId(int prodcutId) {
        this.prodcutId = prodcutId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.out.println("Price must be greater than 0");
        }
        else {
            this.price = price;
        }

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0 ){
            System.out.println("Quantity cannot be negative");
        }
        else {
            this.quantity = quantity;
        }
    }

    public void displayDetails(){

        System.out.println();
        System.out.println("Product Id : " + this.prodcutId);
        System.out.println("Product Name : " + this.productName);
        System.out.println("Product Price : " + this.price);
        System.out.println("Qunatity : "+ this.quantity);
        System.out.println("Total Price : "+ calculateTotalValue());

    }
    public double calculateTotalValue(){

      this.total=this.price * this.quantity;
        return total;

    }

}

class ProductApp {
public static void main(String[] args) {

        Product p1 = new Product();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the product name: ");
        p1.setProductName(sc.nextLine());

        System.out.print("Enter the ProductId: ");
        p1.setProductId(sc.nextInt()) ;

        System.out.print("Enter The Quantity: ");
        p1.setQuantity(sc.nextInt());

        System.out.print("Enter The Price of the Product: ");
        p1.setPrice(sc.nextDouble());

        p1.displayDetails();

        p1.calculateTotalValue();
    }
}