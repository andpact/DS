import map.Map;
import queue.Queue;
import set.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new Set<>();
        for (int i = 0; i < 100; i++) {
            set.add(10);
        }
        System.out.println("size : " + set.size());
//        for (int i = 0; i < 50; i++) {
//            set.remove(i);
//        }
//        System.out.println("size after removed : " + set.size());

//        for (int i = 0; i < set.size(); i++) {
//            System.out.println("contains " + (i + 5) + " :" + set.contains(i + 5));
//
//        }
    }
}
