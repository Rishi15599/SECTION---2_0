//example of user defined parametrised constructor

public class UserDefineParametrisedConstructor {
    UserDefineParametrisedConstructor(string s){
        System.out.println("par-constructor which is strong type");
    }
    public static void main(String[] args) {
        System.out.println("main start");
        UserDefineParametrisedConstructor u1=new UserDefineParametrisedConstructor("java");
        System.out.println("main ends");
    }
}
