package anna;

import anna.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Backpack<T extends Item> {

    List<T> container = new ArrayList<>();

    public void addItem(T item) {
        container.add(item);
    }
}
