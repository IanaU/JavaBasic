/**
 * Java Basic. Home work #3
 *
 * @author Iana Ushko
 * @todo 12.9.2022
 * @date 13.9.2022
 *
 */
class HomeWork03 {
    public static void main(String[] args) {
        // task 1
        int[] array = {25, 37, 2, 0, 101, 69};
        printArray(array);

        // task 2
        int max = getMax(array);
        System.out.println("Maximum number = " + max);
        
        // task 3 /* это все, что смогла( */
        int[] arr = {1, 1, 0};
        int inv = invertArray(arr);
        System.out.println(inv);
    }

    static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static int invertArray(int[] arr) {
        int inv = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
            arr[i] = inv;
            }
        }
        return inv;
    }
}