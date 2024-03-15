class one{
    public static void main(String[] args){

        int num1 = 15;
        double num2 = num1;     //Implicit widening
        double num3 = (double) num1 ;      //Explicit widening
        System.out.println(num2+ " " +num3);


    }
}