public class ConstructorOverloading1 {
    ConstructorOverloading1(){
        System.out.println("non-par contractor");
    }
    ConstructorOverloading1(int i){
        System.out.println("int type controctor");
    }
    ConstructorOverloading1(int i,double d){
        System.out.println("int and double type constroctor");
    }
    ConstructorOverloading1(int i, double d , char c){
        System.out.println("int,double and char type constractor");
    }
    ConstructorOverloading1(int i,double d,String s){
        System.out.println("int,double and string type constroctor");
    }
    public static void main(String[] args) {
        System.out.println("main start");
        ConstructorOverloading1 d1=new ConstructorOverloading1();
        ConstructorOverloading1 d2=new ConstructorOverloading1(10);
        ConstructorOverloading1 d3=new ConstructorOverloading1(10, 10.5);
        ConstructorOverloading1 d4=new ConstructorOverloading1(10, 10.5, 'c');
        ConstructorOverloading1 d5=new ConstructorOverloading1(10, 10.5, "java");
    }
}