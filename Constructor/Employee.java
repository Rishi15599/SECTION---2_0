public class Employee {
    String Emp_Name;
    String Emp_Id;
    long Emp_Phone;
    String Emp_Mail;
    String Emp_Job;
    String Emp_Salary;

    Employee(String Emp_Name, String Emp_Id, long Emp_Phone, String Emp_Mail, String Emp_Job, String Emp_Salary) {
        this.Emp_Name = Emp_Name;
        this.Emp_Id = Emp_Id;
        this.Emp_Phone = Emp_Phone;
        this.Emp_Mail = Emp_Mail;
        this.Emp_Job = Emp_Job;
        this.Emp_Salary = Emp_Salary;
    }

    public static void main(String[] args) {
        System.out.println("First Employee Details");
        Employee e1 = new Employee("Chandu", "123abc", 1234567890l, "chandu@gmail.com", "S E", "8-LPA");
        System.out.println("-Emp Name : "+e1.Emp_Name+"\n-Emp Id : "+e1.Emp_Id+"\n-Emp Phone : "+e1.Emp_Phone+"\n-Emp Mail : "+e1.Emp_Mail+"\n-Emp Job : "+e1.Emp_Job+"\n-Emp Salary : "+e1.Emp_Salary);
        System.out.println("----------------------------------------------------");
        System.out.println("Second Employee Details");
        Employee e2 = new Employee("Rishi", "12150", 5432167890l, "rishi@gmail.com", "S D", "12-LPA");
        System.out.println("-Emp Name :"+e2.Emp_Name+"\n-Emp Id : "+e2.Emp_Id+"\n-Emp Phone : "+e2.Emp_Phone+"\n-Emp Mail : "+e2.Emp_Mail+"\n-Emp Job : "+e2.Emp_Job+"\n-Emp Salary : "+e2.Emp_Salary);
    }
}
