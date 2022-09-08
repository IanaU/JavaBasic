/**
 * Java Basic. Home work #1
 *
 * @author Iana Ushko
 * @todo 5.9.2022
 * @date 8.9.2022
 */
class Pizza {
    public static void main(String[] args) {
        int pizzaDiameter = 28;
        double pizzaRadius = pizzaDiameter / 2d;
        double pizzaArea = Math.PI * pizzaRadius * pizzaRadius;
        double pizzaCalories = pizzaArea * 40;
        System.out.printf("Pizza %d cm in diameter has %.2f calories", pizzaDiameter, pizzaCalories);
    }
}