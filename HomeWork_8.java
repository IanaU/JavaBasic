/**
 * Java Basic. Home work #7
 *
 * @author Iana Ushko
 * @todo 28.9.2022
 * @date 29.9.2022
 *
 */

public class HomeWork_8 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "red", 2, 1);
        System.out.println(cat);
        System.out.println("Try to play: " + cat.play());
        cat.feed();
        System.out.println("Try to play: " + cat.play());
        System.out.println("Try to play: " + cat.play());
        cat.feed();
        System.out.println("Try to jump: " + cat.jump(1));
        cat.feed();
        System.out.println("Try to jump: " + cat.jump(2));
    }
}