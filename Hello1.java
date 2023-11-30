import java.util.Scanner;

class Hello1
{
   public static void main(String args[])
       {
          Scanner reader= new Scanner(System.in);
          System.out.println("Enter a number = ");
          int num=reader.nextInt();// read Input
          System.out.println("\nEntered number is:"+ num);
       }
}