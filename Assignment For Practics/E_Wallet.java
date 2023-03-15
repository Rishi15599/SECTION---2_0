import java.util.Scanner;
public class E_Wallet {
  public void mainBal(){
    Scanner sc = new Scanner(System.in);
    double bal,addAmount,newbal,price,remaningbal;
    bal = 5000;
    System.out.println("-----------------------------------");
    System.out.println("             APNA BANK");
    System.out.println("\n       Main Balence : "+bal);
    System.out.println("-----------------------------------");
    System.out.println("\n-----------------------------------");
    System.out.println("    You Want To Add Some Amount");
    System.out.println("\n         Enter The Amount");
    addAmount=sc.nextDouble();
    System.out.println("\n-----------------------------------");
    newbal=bal+addAmount;
    System.out.println("      Now Balence : "+newbal);
    System.out.println("-----------------------------------");
    System.out.println("     You Want Buy Any Product");
    System.out.println("-----------------------------------");
    System.out.println("    Enter The Price of Product");
    price = sc.nextDouble();
    remaningbal=newbal-price;
    System.out.println("\n-----------------------------------");
    System.out.println("    Remaning Balence : "+remaningbal);
    System.out.println("-----------------------------------");
  }
}
class main{
    public static void main(String[] args) {
        E_Wallet E_Wallet=new E_Wallet();
        E_Wallet.mainBal();
    }
}