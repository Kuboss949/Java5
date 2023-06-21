import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Triple<Double, String, Boolean> t1 = new Triple<>(3.14, "Ala ma kota", true);
        System.out.println(t1);
        Triple<Integer, Double, String> t2 = new Triple<>(4, 3.12, "Ala");
        Triple<Integer, Double, String> t3 = new Triple<>(4, 3.12, "Ala");
        Triple<Integer, Double, String> t4 = new Triple<>(15, 3.12, "Ala");
        Triple<Integer, Double, String> t5 = new Triple<>(32, 3.12, "Alama");
        Triple<Integer, Double, String> t6 = new Triple<>(9, 3.12, "Alaniema");
        Triple<Integer, Double, String> t7 = new Triple<>(-2, 3.12, "Alatodla");

        System.out.println(t2.equals(t3));
        System.out.println(t3.equals(t2));
        System.out.println(t4.equals(t5));

        ArrayList<Triple<Integer, Double, String>> list = new ArrayList<>();
        list.add(t2);
        list.add(t3);
        list.add(t4);
        list.add(t5);
        list.add(t6);
        list.add(t7);

        for (var i: list) {
            System.out.println(i);
        }
        Collections.sort(list);
        System.out.println("----------------------");
        for (var i: list) {
            System.out.println(i);
        }
        Collections.sort(list, new TripleReverseComparator());
        System.out.println("----------------------");
        for (var i: list) {
            System.out.println(i);
        }


    }
}