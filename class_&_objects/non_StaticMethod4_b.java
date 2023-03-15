class demo{
    int i = 100;
    public void fly(){
        System.out.println("fly is non-static in demo class");
    }
}
class non_StaticMethod4_b {
    int i=50;
    public void display(){
        System.out.println("display is non-static");
        System.out.println(i);
        System.out.println("display ends");
    }
    public void show(){
        System.out.println("show is non-static in non-static method class");
        display();
    }
    public static void main(String[] args) {
        System.out.println("main start");
        non_StaticMethod4_b n1=new non_StaticMethod4_b();
        n1.show();
        demo d1=new demo();
        // d1.fly();
        System.out.println("main ends");
    }
}
