class JavaBasic2Lesson {
    public static void main(String[] args) {
        int t = 15;
        /*if (t < 0) {
            System.out.println("It's frost");
        }else{
            System.out.println("It's NO frost");
        }*/
        System.out.println(t < 0? "It's frost" : "It's NO frost");

        int m = 1;
        if (m == 12 || m == 1 || m == 2) {
            System.out.println("It's winter");
        } else if (m == 3 || m == 4 || m == 5){
            System.out.println("It's spring");
        } else if (m == 6 || m == 7 || m == 8) {
            System.out.println("It's summer");
        } else if (m == 9 || m == 10 || m == 11) {
            System.out.println("It's fall");
        } else {
            System.out.println("Error");
        }

        boolean isWeekend = true;
        boolean isIAmFree = true;
        if (isWeekend && isIAmFree) {
            System.out.println("I can walk");
        } else {
            System.out.println("I can not walk");
        }

        int d = 2;
        switch (d) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}