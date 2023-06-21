import java.util.Objects;

public class Triple <T1, T2, T3> implements Comparable<Triple<T1,T2,T3>>{

    private T1 first;
    private T2 second;
    private T3 third;

    public Triple(T1 first, T2 second, T3 third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return "Triple<" +
                first +
                ", " + second +
                ", " + third +
                '>';
    }

    public T1 getFirst() {
        return first;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triple<?, ?, ?> triple = (Triple<?, ?, ?>) o;
        return first.equals(triple.first) && second.equals(triple.second) && third.equals(triple.third);
    }


    public T2 getSecond() {
        return second;
    }

    public T3 getThird() {
        return third;
    }

    @Override
    public int compareTo(Triple other) {
        int cmp1 = ((Comparable<T1>) this.first).compareTo((T1) other.getFirst());
        int cmp2 = ((Comparable<T2>) this.second).compareTo((T2) other.getSecond());
        int cmp3 = ((Comparable<T3>) this.second).compareTo((T3) other.getSecond());
        if (cmp1 < 0 || cmp1==0 && (cmp2<0 || cmp2==0 && cmp3<0)) {
            return -1;
        } else if(cmp1 == 0 && cmp2 == 0 && cmp3 == 0) {
            return 0;
        }else{
            return 1;
        }
    }
}
