package anna;

public class Circle implements Comparable<Circle>{

    int radius;

    @Override
    public int compareTo(Circle other) {
        return Integer.compare(this.radius, other.radius);
    }
}
