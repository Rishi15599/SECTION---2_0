import java.util.Scanner;

class VowelOrNot {
    public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Character");

		char c = sc.next().charAt(0);

		switch(c){
		case  'a','e','i','o','u','A','E','I','O','U':{
		System.out.println("It is  a vowel");
		}	
		break;
	    default :{
        System.out.println("It is not a Vowel");
        }
	    }
    }
}