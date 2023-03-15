class demo{
    int i=80;
    public void fly(){
        System.out.println("fly is non-statics");
    }
}
public class staticMethod2_b {
    int j=10;
    public void m1(){
        System.out.println("m1 is non-static method");
        // demo d1=new demo();
        // System.out.println(d1.i);
        // d1.fly();
        main();
    }
    public static void main(){
        System.out.println("main is static method");
        staticMethod2_b s1=new staticMethod2_b();
        s1.m1();
        System.out.println(s1.j);
    }
    public static void main(String[] args) {
        System.out.println("main start");
        
        System.out.println("main ends");
    }
}
