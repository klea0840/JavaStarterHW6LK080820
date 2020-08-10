import java.util.Scanner;

public class HW6task5Premium {

    public static void main(String[] args) {


        final double ten = 10;
        final double fitn = 15;
        final double twfive = 25;
        final double thfive = 35;
        final double frfive = 45;
        final double fifty = 50;

        Scanner sc = new Scanner(System.in);
        System.out.print("Type work record in years: ");
        double years = sc.nextDouble();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Type salary: ");
        double salary = sc1.nextDouble();

        if ((years < 0) || (salary <= 0)) {
            System.out.println("Error: negative or 0 values are not applicable");
        } else if (years < 5) {
            System.out.println("Bonus : " + (salary * (ten/100)));
        } else if ((years >= 5 ) && (years < 10)) {
            System.out.println("Bonus : " + (salary * (fitn/100)));
        } else if ((years >= 10) && (years < 15)) {
            System.out.println("Bonus : " + (salary * (twfive/100)));
        } else if ((years >= 15) && (years < 20)) {
            System.out.println("Bonus : " + (salary * (thfive/100)));
        } else if ((years >= 20) && (years < 25)) {
            System.out.println("Bonus : " + (salary * (frfive/100)));
        } else if (years >= 25) {
            System.out.println("Bonus : " + (salary * (fifty/100)));
        }
    }
}
