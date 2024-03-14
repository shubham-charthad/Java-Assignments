import java.util.Scanner;

class five{
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     char chart;
     System.out.println("enter a character");
     chart = scanner.next().charAt(0);                     //to take input in char

     char lowercase = Character.toLowerCase(chart);       //to convert uppercase into lowercase
      
    if(lowercase == 'a' || lowercase == 'e' ||lowercase =='i'||lowercase == 'o'||lowercase=='u'){
     System.out.println("vowel");
    }else if (Character.isLetter(chart)){                  //other valid character 
      System.out.println("constant");
    }else{
     System.out.println("invalid charcter");               //any not valid charcter # @
    }

    scanner.close();
    }
}