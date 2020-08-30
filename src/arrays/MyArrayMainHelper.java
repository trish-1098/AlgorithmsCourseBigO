package arrays;

public class MyArrayMainHelper {
    public static void main(String[] args) {
        MyArray array = new MyArray();
        array.pushNewItem("hi");
        System.out.println(array.getArray().size());
        for (int i = 0; i < array.getLength(); i++) {
            System.out.println(array.getArrayItem(i));
        }
    }
}
