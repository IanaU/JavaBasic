/**
 * Java Basic. Home work #7
 *
 * @author Iana Ushko
 * @todo 26.9.2022
 * @date 27.9.2022
 *
 */

import java.util.*;

public class HomeWork_7 {
    public static void main(String[] args) {
        List<Integer> lottery = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            lottery.add(i + 1);
        }
        Collections.shuffle(lottery);
        System.out.println(lottery.subList(0, 10));
    }
    
    static void showCollections() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(6, 8, 4, 2, 3, 1));
        System.out.println(arrayList);
        System.out.println(Collections.max(arrayList));
        System.out.println(Collections.min(arrayList));
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }

    static void showMap() {
        Map<Integer, String> daysMap = new HashMap<>();
        daysMap.put(1, "Monday");
        daysMap.put(2, "Tuesday");
        System.out.println(daysMap);
        System.out.println(daysMap.get(1));
    }

    static void showList() {
        List<Integer> arrayList = new ArrayList<>();
        System.out.println(arrayList);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.addAll(Arrays.asList(4, 3, 2, 1));
        System.out.println(arrayList);
        arrayList.add(2, Integer.valueOf(12));
        System.out.println(arrayList);
        arrayList.remove(4);
        System.out.println(arrayList);
        for (Integer a : arrayList) {
            System.out.println(a);
        }
    }

    static int[] generateArray(int length) {
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * 20);
        }
        return result;
    }

    static void showArrays() {
        int[] arr = generateArray(25);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int found = Arrays.binarySearch(arr, 10);
        System.out.println(found + ": " + arr[found]);
    }
}