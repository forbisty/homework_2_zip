import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 99;
        for (int i = 0; i < 1; i++) {
            System.out.println(generateRandomAge(n));
            System.out.println(permission(generateRandomAge(n), 15));
            System.out.println(permission(11, 1));
            System.out.println(permission(22, -2));
            System.out.println(permission(33, 3));
            System.out.println(permission(94, -89));
            System.out.println(permission(55, 5));
        }
    }

    public static String permission(int age, int temperature) {
        if ((age < 45 && age > 20) && (temperature < 30 && temperature > -20))
            return "Можно идти гулять";
        else if (age < 20 && (temperature < 28 && temperature > 0))
            return "Можно идти гулять";
        else if ((age > 45) && (temperature < 25 && temperature > -10))
            return "Можно идти гулять";
        else
            return "Оставайтесь дома";
    }

    public static int generateRandomAge(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("ERROR");
        }
        return new Random().nextInt(n + 1);
    }
}