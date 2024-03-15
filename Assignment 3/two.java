import java.util.Scanner;

class two{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        double num1 = sc.nextDouble();

        int num2 = (int) num1;      //Narrowing (small to bigger datatype coversion)
        System.out.println(num1+"  "+num2);


        sc.close();
            }
}