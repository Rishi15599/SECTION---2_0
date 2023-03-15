public class non_StaticMethod4_a {
    int i=100;
    public void display(){
        System.out.println("display is non-static");
    }
    public void show(){
        System.out.println("show is non-static");
        display();
        System.out.println(i);
    }
    public static void main(String[] args) {
        System.out.println("main start");
        non_StaticMethod4_a n1=new non_StaticMethod4_a();
        n1.show();
        System.out.println("main ends");
    }
}
