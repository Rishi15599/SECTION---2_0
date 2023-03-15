//constructor overloding-----------------------------------------
public class Sample {
    Sample(){
        System.out.println("non-par constroctor");
    }
    Sample(String s,int i){
        System.out.println("string and int type constroctor");
    }
    Sample(double d){
        System.out.println("double type constroctor");
    }
    public static void main(String[] args) {
        System.out.println("main strat");
        Sample s1=new Sample();
        Sample s2=new Sample(10.5);
        Sample s3=new Sample("java", 10);
        System.out.println("main ends");
    }
}
