import java.util.Random;
import java.util.Scanner;

class JavaBasic4Lesson {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
        System.out.println(random.nextInt(100));
        }
        Scanner scanner = new Scanner (System.in);
        System.out.println("# ");
        int a = scanner.nextInt();
        System.out.println(a * 2);
    }
}