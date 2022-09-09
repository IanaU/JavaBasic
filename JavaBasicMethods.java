class JavaBasicMethods {
    public static void main(String[] args) {
        printHello();
        printHelloName("world");
        System.out.println(add(3, 5));
    }

    static void printHello() {
        System.out.println("Hello");
    }

    static void printHelloName(String name) {
        System.out.println("Hello, " + name + "!");
    }

    static int add(int a, int b) {
        int c = a + b;
        return c;
    }
}