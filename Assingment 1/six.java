import java.util.Scanner;

class six{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Height");
    float height = scanner.nextFloat();
    System.out.println("Enter Weight");
    float weight = scanner.nextFloat();
    
    float bodymass= weight / (height*height);
    System.out.println(bodymass);

    if (bodymass >= 25.0)
    System.out.println("Over Weight");
    else if (bodymass <= 24.0 && bodymass >= 18.0)
    System.out.println("Normal Weight");
    else 
    System.out.println("Under Weight");

    
    scanner.close();

    }
}