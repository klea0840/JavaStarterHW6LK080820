import java.util.Scanner;

public class HW6task3Parity {

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("Type value: ");
       long i = sc.nextLong();

       if ((i & 1) == 0) {
           System.out.println("The number is a multiple of 2");
       } else {
           System.out.println("The number is not a multiple of 2");
       }

//       if (i % 2 == 0) {
//           System.out.println("The number is a multiple of 2");
//       } else {
//           System.out.println("The number is not a multiple of 2");
//       }





   }
}

