public class HW6task4LogicOperations {

    public static void main(String[] args) {

        int x = 5, y = 10, z = 15;

//        x += y >> x++ * z; // 5
//        System.out.println(x);

//        z = ++x & y * 5; // 2
//        System.out.println(z);

//        y /= x + 5 | z; // 0
//        System.out.println(y);

//        z = x++ & y * 5; // 0
//        System.out.println(z);

        x = y << x++ ^ z; // 335
        System.out.println(x);




    }
}
