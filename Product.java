/* You have been hired by an E-Commerce Company to develop a Shopping Discount
 System that calculates the final price of products based on discounts and promotional
 offers.
 Each product has a base price, and customers can receive discounts based on their mem
bership type or seasonal promotions. The system should allow for flexible discount cal
culations and ensure that all prices are correctly computed.
 The discount policy is as follows:
 Membership Type	Discount Percentage
Premium Member	20% Off
Regular Member	10% Off
Non-Member	No Discount (0%)
Additionally, the company offers seasonal promotions, which provide an extra discount
 on top of membership discounts.
 a) Implement aProduct class with four attributes: productID, productName, basePrice,
 and membershipType (Premium, Regular, or Non-Member).
 b) Overload the default constructor of the Product class as follows:
 a. A constructor that accepts only productID and productName.
 b. A constructor that accepts productID, productName, and basePrice.
 c. A constructor that initializes all four attributes
 c) Implement getters and setters for membershipType and basePrice. The setter
 for membershipType must ensure that only valid types (Premium, Regular, Non
Member) are accepted; otherwise, it should set to Non-Member.
 d) Create two versions of the calculateFinalPrice() method as;
 a. A method that calculates the final price based on the membership discount.
 b. Another that allows an extra seasonal discount (amount
 c. as a parameter) without modifying the stored values.
 e) Implement a displayProductDetails() method to print all relevant details, including
 the final price after discounts.
 f) Implement a main method and create Product objects to demonstrate the above
 variations of constructors. Then call the appropriate methods to calculate the final
 prices and display all the details of each product*/

public class Product{
    private int ProductID;
    private String ProductName;
    private double basePrice;
    private String Membership;
    private double DiscountRate;
    private double finalPrice;

    public Product(int ProductId,String ProductName){
        this.ProductID = ProductId;
        this.ProductName = ProductName;
        this.basePrice = 0;
        this.Membership = "Non Member";

    }
    public Product(int ProductId,String ProductName,double basePrice){
        this.ProductID = ProductId;
        this.ProductName = ProductName;
        this.basePrice = basePrice;
        this.Membership = "Non Member";

    }
    public Product(int ProductId,String ProductName,double basePrice,String Membership){
        this.ProductID = ProductId;
        this.ProductName = ProductName;
        this.basePrice = basePrice;
        setMembership(Membership);

    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getMembership() {
        return Membership;
    }

    public void setMembership(String membership) {
        if (membership.equals("Premium") || membership.equals("Regular")) {
            this.Membership= membership + " Member";
        } else {
            this.Membership = "Non-Member";
        }

        switch (membership){
            case "Premium": DiscountRate = 20;
            break;
            case "Regular": DiscountRate = 10;
            break;
            default :DiscountRate = 0;
        }
    }
    public double calculateFinalPrice(){
        finalPrice = basePrice-(basePrice*(DiscountRate/100));
        return finalPrice;
    }
    public double calculateFinalPrice(double amount){
        finalPrice = basePrice-(basePrice*(DiscountRate/100))-amount;
        return finalPrice;
    }


    public void displayProductDetails(){
        System.out.println("Product Name: "+ProductName);
        System.out.println("Product ID: "+ProductID);
        System.out.println("Base Price: "+basePrice);
        System.out.println("Membership: "+Membership);
        System.out.println("Final Price "+calculateFinalPrice());
        System.out.println();
    }

}

 class ShoppingDiscountSystem {
     public static void main(String[] args) {

         Product p1 = new Product(1,"P1");
         Product p2 = new Product(2,"P2",100 );
         Product p3 = new Product(3,"P3",200,"Premium" );
         Product p4 = new Product(4,"P4",300,"Regular");
         Product p5 = new Product(5,"P5",400,"non");

        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();
        p4.displayProductDetails();
        p5.displayProductDetails();


     }
}
