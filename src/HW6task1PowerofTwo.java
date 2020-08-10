import java.util.Scanner;

public class HW6task1PowerofTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Type value: ");
        long i = sc.nextLong();

        if ((i != 0) && ((i & (i - 1)) == 0)) {
            System.out.println("The number is a degree of 2");
        }
        else {
            System.out.println("The number is not a degree of 2");
        }
    }
}
