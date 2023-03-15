public class staticMethod2_a {
    int i=80;
    public void m1(){
        System.out.println("m1() is non-static");
    }
    public static void display(){
        System.out.println("display is static method");
        staticMethod2_a s1=new staticMethod2_a();
        s1.m1();
        System.out.println(s1.i);
    }
    public static void main(String[] args) {
        System.out.println("main start");
        display();
        System.out.println("main ends");
    }
}
