/**
 * Java Basic. Home work #2
 *
 * @author Iana Ushko
 * @todo 7.9.2022
 * @date 9.9.2022
 *
 */
class HomeWork02 {
    public static void main(String[] args) {
    /* Не получается несколько раз вызвать метод. Не понимаю( */

        System.out.println(checkWeather());
        System.out.println(canWalk()? "I can not walk" : "I can walk");
        System.out.println(add(10, 3));
        System.out.println(sub(10, 3));
        System.out.println(mul(10, 3));
        System.out.println(div(10, 3));
        System.out.println(dayOfWeek());
        System.out.println(canBuyFood());
    }
        // task 1
    static String checkWeather() {
        int temperature = 10;
        if (temperature < 0) {
            return "It's frost";
        } else if (temperature >= 0 || temperature <= 18){
            return "It's cold";
        } else if (temperature >= 19 || temperature <= 28){
            return "It's warm";
        } else if (temperature >= 29){
            return "It's hot";
        } else {
            return "Error";
        }
    }

        // task 2
    static boolean canWalk() {
        boolean isWeekend = true;
        boolean isRain = true;
        boolean booleanExpression = (isWeekend && !isRain);
        return booleanExpression;
    }

        // task 3
    static int add(int a,int b) {
        int c = a + b;
        return c;
    }
    static int sub(int a,int b) {
        int d = a - b;
        return d;
    }
    static int mul(int a,int b) {
        int e = a * b;
        return e;
    }
    static float div(float a,float b) {
        float f = a / b;
        return f;
    }

        // task 4
    static String dayOfWeek () {
        int d = 5;
        switch (d) {
            case 1:
                return "It's Monday";
            case 2:
                return "It's Tuesday";
            case 3:
                return "It's Wednesday";
            case 4:
                return "It's Thursday";
            case 5:
                return "It's Friday";
            case 6:
                return "It's Saturday";
            case 7:
                return "It's Sunday";
            default:
        }
        return "Error";
    }

        // task 5
    static String canBuyFood() {
        boolean isLidlOpen = true;
        boolean isTescoOpen = true;
        if (isLidlOpen && isTescoOpen){
            return "I can bay food in Lidl and in Tesco";
        } else if (isLidlOpen && !isTescoOpen){
            return "I can bay food in Lidl";
        } else if (!isLidlOpen && isTescoOpen){
            return "I can bay food in Tesco";
        } else if (!isLidlOpen && !isTescoOpen){
            return "I can't bay food";
        }
        return "Error";
    }
}