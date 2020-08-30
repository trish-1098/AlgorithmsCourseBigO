package arrays;

import java.util.ArrayList;

// Not actual Solution

public class MyArray {

    private int length;
    private ArrayList<String> array;

    public MyArray() {
        this.length = 0;
        this.array = new ArrayList<>(length);
    }

    public String getArrayItem(int index) {
        return this.array.get(index);
    }

    public int getLength() {
        return length;
    }

    public ArrayList<String> getArray() {
        return array;
    }

    public int pushNewItem (String item) {
        this.array.add(item);
        length++;
        return this.array.size();
    }

    public String removeFromEnd() {
        String deletedItem = this.array.remove(this.array.size() - 1);
        length--;
        return deletedItem;
    }

    public String removeItem(int index) {
        String deletedItem = this.array.remove(index);
        length--;
        return deletedItem;
    }

    public void pushNewItem(String item, int index) {
        this.array.add(index,item);
        length++;
    }
}
