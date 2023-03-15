public class Student {
    String name;
    int rollNo;
    double marks;
    Student(String stdname,int stdrollNo,double stdmarks){
        name=stdname;
        rollNo=stdrollNo;
        marks=stdmarks;
    }
    public static void main(String[] args) {
        System.out.println("First student details");
        Student s1=new Student("Rishi",121,550);
        System.out.println("Name : "+s1.name+"\nRoll Number : "+s1.rollNo+"\nMarks : "+s1.marks);
        System.out.println("=======================================");
        System.out.println("Second student details");
        Student s2=new Student("Prakash",122,450);
        System.out.println("Name : "+s2.name+"\nRoll Number : "+s2.rollNo+"\nMarks : "+s2.marks);
    }
}
