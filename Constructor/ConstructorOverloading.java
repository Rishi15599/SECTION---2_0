public class ConstructorOverloading {
    ConstructorOverloading(){
        System.out.println("non-par contructor");
    }
    ConstructorOverloading(String s,int i){
        System.out.println("string and int type contructor");
    }
    ConstructorOverloading(double d){
        System.out.println("double type contructor");
    }
    public static void main(String[] args) {
        System.out.println("main start");
        ConstructorOverloading c1=new ConstructorOverloading();
        ConstructorOverloading c2=new ConstructorOverloading(23.2);
        ConstructorOverloading c3=new ConstructorOverloading("java",10);
        System.out.println("main ends");
    }
}