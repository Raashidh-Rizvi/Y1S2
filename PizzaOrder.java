/*
 Develop a system to manage details for a Pizza Restaurant System.
 Scenario:
 The system should record pizza order details, calculate the total price based on
 pizza size, handle optional toppings, and provide special features such as delivery
 charges and estimated preparation time.
 The pizza price chart is as follows:

 Small - $8.00
 Medium - $10.00
 Large - $12.00
 Each extra topping adds $1.50 to the base price.
 (a) Implement a class called “PizzaOrder” with the orderID (String), customer
Name (String), size (String), (Small, Medium, or Large), toppingCount (int),
 and isDelivery (boolean) as attributes.
 (b) Implement a default constructor that initializes attributes with default val
ues.
 (c) Implement overloaded constructors to allow:
 i. a constructor that accepts only orderID and customerName.
 ii. A constructor that accepts all five attributes.
 (d) Provide getters and setters for size. The setter for size must validate that
 the size is either ”Small”, ”Medium”, or ”Large”. If an invalid size is entered,
 set the default to ”Small”.
 (e) Implement a method called getBasePrice() which returm the price according
 to the size of the pizza (refer to the above tabledatails)
 (f) Implement method overloading by creating two versions of the calculateTo
talPrice() method:
 1
i. One that calculates the total price using the stored values, including top
pings and delivery fee (if applicable). (Hint– call getBasePrice() method
 to get the basic price according to the size of the pizza.)
 ii. Another that accepts a discountPercentage as parameter (double) and
 applies the discount to the total price. (Hint– call calculateTotalPrice()
 method to get the price according to the size, number of toppings, and
 delivery status.)
 g) Implement a method called estimatePreparationTime() to calculate and return
 the preparation time based on the number of toppings.
 h) Implement a method called displayOrderDetails() to display the full order
 details, including the total price and estimated preparation time.


*/import java.util.Scanner;

public class PizzaOrder {
    private String orderID;
    private String customerName;
    private String size;
    private int toppingCount;
    private boolean isDelivery;
    private double basePrice;


    private static int basePrepTime = 10;
    private static int basePrepTimeForTopping = 4;

    private static double deliveryFee = 3;

    public PizzaOrder(){
        orderID = "null";
        customerName = "null";
        size = "null";
        toppingCount = 0;
        isDelivery = false;
    }

    public PizzaOrder(String orderID,String customerName){
        this();
        this.orderID = orderID;
        this.customerName = customerName;

    }

    public PizzaOrder(String orderID,String customerName,String size,int toppingCount,boolean isDelivery){
        this(customerName,orderID);
        setSize(size);
        this.toppingCount = toppingCount;
        this.isDelivery = isDelivery;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {

        switch(size){
            case "Large": size = "Large";
                break;
                case "Medium": size = "Medium";
                    break;
                    default: size = "Small";

        }
        this.size = size;

    }
    public double getBasePrice(){
        switch(size){
            case "Large": basePrice = 12.0;
            break;
            case "Medium":basePrice =10.0;
            break;
            default: basePrice = 8.0;
        }
        return basePrice;

    }
    public double isDelivery(){
        return isDelivery ? deliveryFee : 0;

    }

    public double calculateTotalPrice(){
        return(getBasePrice()+(toppingCount*1.5)+isDelivery());
    }
    public double calculateTotalPrice(double discount){
        return calculateTotalPrice() - (calculateTotalPrice()*discount/100);
    }
    public int estimatePreparationTime() {
        return  basePrepTime + (toppingCount * basePrepTimeForTopping );
    }
    public void DisplayInfo(){
        System.out.println("Order ID: "+orderID);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Size: "+size);
        System.out.println("Topping Count: "+toppingCount);
        System.out.println("Delivery Fee: "+isDelivery());
        System.out.println("Total Price: "+calculateTotalPrice());
        System.out.println("Estimate Preparation Time: "+estimatePreparationTime()+" Minutes");
        System.out.println();

    }
}
class PizzaRestaurantSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PizzaOrder order1 = new PizzaOrder("03001", "Olivia Green", "Medium", 3, true);
        order1.DisplayInfo();


        PizzaOrder order2 = new PizzaOrder("03002", "Noah Smith", "Large", 2, false);
        order2.DisplayInfo();
        System.out.println("Enter the discount percentage: ");
        double percentage = sc.nextDouble();
        System.out.println("Order 02 - Price after the discount: $" + order2.calculateTotalPrice(percentage));
        System.out.println();


        PizzaOrder order3 = new PizzaOrder();
        order3.DisplayInfo();
    }
}

