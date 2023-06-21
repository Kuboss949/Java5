import java.util.Comparator;

public class TripleReverseComparator implements Comparator<Triple> {
    @Override
    public int compare(Triple first, Triple second) {
        return -1 * first.compareTo(second);
    }

}
