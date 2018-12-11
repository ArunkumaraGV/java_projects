import java.util.Scanner;
public class Main{

     public static void main(String []args){
         
         System.out.println("Enter the max limit to display fib series: ");
         Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        //int number=12;
         System.out.println("Fib series upto "+number+" is: ");
         
         System.out.print(fibon(number));
     }

  public static int fibon(int number){
             int fib1=1,fib2=1,fibonacci=1;
             
             if(number==1 || number==2){
                 return 1;
                 
             }
                 
                 for(int i=3; i<number; i++){
                     fibonacci=fib1+fib2;
                     fib1=fib2;
                     fib2=fibonacci;
                 }
                 return fibonacci;
             }
         
}
