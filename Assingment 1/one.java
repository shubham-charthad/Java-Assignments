import java.util.Scanner;
class one {
    public static void main (String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your Numerical grade: ");
    int grade = scanner.nextInt();               //to take input in Int


    if(grade >= 90)
       System.out.println("you grade is A ");
    else if(grade >= 80 )
       System.out.println("your grade is B");
    else if(grade >=70)
       System.out.println("your grade is C");
    else if (grade >=60 )
       System.out.println("your grade is D");
    else 
       System.out.println("failed");


       scanner.close();

    }
}