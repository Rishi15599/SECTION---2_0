public class Facebook1 {
    Facebook1( String userId,String userNmae,String password){
        System.out.println("userId ; "+userId+"\nuserName : "+userNmae+"\npassword : "+password);
    }
    public static void main(String[] args) {
        System.out.println("First User");
        Facebook1 f1=new Facebook1("Rishi15599","Rishi Prakash","12345678");
        System.out.println("Second User");
        Facebook1 f2=new Facebook1("Prakash15599","Rishi Prakash","12345678");
        System.out.println("Third User");
        Facebook1 f3=new Facebook1("Raju15599","Rishi Prakash","12345678");


    }
}
