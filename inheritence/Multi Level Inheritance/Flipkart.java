import java.net.Socket;
import java.util.Scanner;

public class Flipkart {
    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The UserId");
        String Id = sc.next();
        if (true) {
            System.out.println("Please Enter Your Password");
        }
        String Password = sc.next();
        if (true) {
            System.out.println("You Susscessfully Login");
        }
    }

    public void searchProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Product Name");
        String Product = sc.next();
        System.out.println("Your Product In Stock");
    }

}

class FlipkartCart extends Flipkart {
    public void addToCart() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("You want to add the product please type -- add --");
        String Add = sc.next();
        if (true) {
            System.out.println("Your Product Is Added");
        }
        System.out.println("------------------------------");
        System.out.println("Please Enter The Address");
    }

    public void selectAddress() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The City");
        String City = sc.next();
        System.out.println("Enter The District");
        String District = sc.next();
        System.out.println("Enter The PinCode");
        String Pincode = sc.next();
        System.out.println("Your Address Added Successfully");
    }
}

class FlipkartPayment extends FlipkartCart {
    public void selectPaymentMode() {
        System.out.println("Please Chosse The Payment Mode Chash On Delivery");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter -- cash on delivery --");
        String Pincode = sc.next();
        System.out.println("Payment Successfully");
        System.out.println("Go for Oreder Now");
    }

    public void orderNow() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Order");
        String Pincode = sc.next();
        System.out.println("Order successfully");

    }

}

class MainFlipkart {
    private static final String Product = null;

    public static void main(String[] args) {
        FlipkartPayment f = new FlipkartPayment();
        f.login();
        f.searchProduct();
        f.addToCart();
        f.selectAddress();
        f.selectPaymentMode();
        f.orderNow();
        System.out.println("Your Product is shipping soon ");
        System.out.println("Thank you for Visit");
    }
}
