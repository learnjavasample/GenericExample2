package anna.item;

public class Item implements Comparable<Item> {

    int weight;

    @Override
    public int compareTo(Item other) {
        return Integer.compare(this.weight, other.weight);
    }
}
