package anna;

import anna.item.Book;
import anna.item.Item;
import anna.item.Phone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {


    public static void print(Collection<String> lst) {
        for (String s : lst) {
            System.out.println(s);
        }
    }


    public static <T extends Comparable<T>> T max(T a, T b) {
       if (a.compareTo(b) > 0) {
           return a;
       }

       return b;
    }


    public static boolean find(List<? extends Item> list, Item item) {
    //public static <T extends anna.item.Item> boolean find(List<T> list, anna.item.Item item) {
        for (Item t : list) {
            if (t.compareTo(item) == 0) {
                return true;
            }
        }

        return false;
    }


    public static <E extends Item> void checkList1(List<E> list, int max) {
        //List<E> newList = new ArrayList<>();
        //Item item = newList.get(0);

        if (list.size() > max) {
            list.clear();
        }
    }

    public static void checkList2(List<? extends Item> list, int max) {
        if (list.size() > max) {
            list.clear();
        }
    }



    //PECS
    //Producer Extends, Consumer Super
    public static void copy(List<? extends Item> src, List<? super Item> dst) {
        for (Item item : src) {
            dst.add(item);
        }
    }


    public static void main(String[] args) {

        Item item = new Item();

        List<Book> books = new ArrayList<>();
        List<Phone> phones = new ArrayList<>();
        List<Item> items = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        //copy(books, items);
        //copy(phones, objects);
        //copy(books, phones);
        //copy(items, books);


        //find(books, new Book());
        //find(phones, new Phone());
        //find(items, new Item());


        List<String> strList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();
        //print(strList);
        //print(objList);


        Backpack<Item> backpack = new Backpack<>();
        backpack.addItem(new Book());
        backpack.addItem(new Phone());
        backpack.addItem(new Item());

        //Backpack<String> backpack1 = new anna.Backpack<>();

    }
}
