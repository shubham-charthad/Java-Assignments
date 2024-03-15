import java.lang.*;
class four{
    public static void main(String[] args){
    int num = 20;

    String str = "537";
    
    double num1 = num;
    System.out.println(num1);
    
    float num2 = num;
    System.out.println(num2);

    boolean num3 = (num > 0);        //int to boolean
    System.out.println(num3);


    String st = Integer.toString(num);    //int to String
    System.out.println(st);


    int number = Integer.parseInt(str);       //String(str) to int --"537" --> 537
    System.out.println(number);


    }
}