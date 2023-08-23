import java.util.PriorityQueue;
import java.util.Comparator;
public class heaps {
    public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(5);
        pq.add(1);
        pq.add(4);
        pq.add(9);
        pq.add(17);
        while (pq.isEmpty()) {
            System.out.println(pq.Comparator());
            pq.remove();
        }
    }
}
 