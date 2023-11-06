 import java.util.Scanner;

class Input03 {
     public static void main(String[] args) {
        //Create a Scanner
      int num1, num2 , num3 , sum ;
       Scanner firstScanner = new Scanner(System.in);
       System.out.println("Enter first number : ");
       num1 = firstScanner.nextInt();

       System.out.println("Enter second number : ");
       num2 = firstScanner.nextInt();

        System.out.println("Enter third number : ");
       num3 = firstScanner.nextInt();

       firstScanner.close();
       
       sum = num1 + num2 + num3;

       System.out.println("The sum of these numbers is : " + sum );
        
     }
}
// import java.util.Scanner;
// public class Input03 {

//     public static void main(String[] args) {
        
//         int num1, num2, sum;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter First Number: ");
//         num1 = sc.nextInt();
        
//         System.out.println("Enter Second Number: ");
//         num2 = sc.nextInt();
        
//         sc.close();
//         sum = num1 + num2;
//         System.out.println("Sum of these numbers: "+sum);
//     }
// }