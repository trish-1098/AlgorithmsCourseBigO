package arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class ArraysClass {
    public static void main(String[] args) {
//        // 16 bytes of storage for 32 bit system
//        // static array
//        final String[] oldArray = new String[]{"a","b","c","d"};
//        System.out.println(oldArray[2]);
//
//        //dynamic array type in java
//        ArrayList<String> stringArrayList = new ArrayList<>(java.util.Arrays.asList(oldArray));
//        stringArrayList.add("e");
//        stringArrayList.remove(stringArrayList.size() - 1);
//        stringArrayList.add(0,"x");
//        stringArrayList.add(2,"alien");
//
//        System.out.println(stringArrayList.toString());
//
//        // adding something at the end of the array
//        String[] newArray = new String[oldArray.length + 1];
//        newArray[4] = "e";
//
//        System.out.println(newArray[4]);
//        System.out.println(reverseString("My Name is Trishant Sharma"));
//        System.out.println(reverseString("Sanya"));
        int[] array = mergeSortedArrays1(new int[]{0,3,4,31},new int[]{4,6,30});
        for (int i:
             array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    // Reversing a String
    public static String reverseString(String oGString) {
        if (oGString == null) {
            return null;
        }
        int lengthOfString = oGString.length();
        if (lengthOfString < 2) {
            return oGString;
        }
//        char[] originalStringArray = oGString.toCharArray();
        char[] reversedStringArray = new char[lengthOfString];
        for (int i = 0; i < lengthOfString; i++) {
            reversedStringArray[i] =
                    oGString.charAt((lengthOfString - 1) - i);
        }
        return new String(reversedStringArray);
    }

    // Merge 2 sorted arrays into one sorted array
    public static int[] mergeSortedArrays1(int[] sortedArrayOne, int[] sortedArrayTwo) {
        if (sortedArrayOne.length == 0) {
            return sortedArrayTwo;
        }
        if (sortedArrayTwo.length == 0) {
            return sortedArrayOne;
        }
        int newArrayLength = sortedArrayOne.length + sortedArrayTwo.length;
        int[] newArray = new int[newArrayLength];
//        HashMap<Integer,Boolean> sortedArrayOneMap = new HashMap<>();
        int i;
        for (i = 0; i < sortedArrayOne.length; i++) {
            newArray[i] = sortedArrayOne[i];
        }
        for (int j = 0; j < sortedArrayTwo.length; j++) {

            newArray[i] = sortedArrayTwo[j];
            i++;
        }
        for (int p = 0; p < newArrayLength; p++) {
            for (int q = p + 1; q < newArrayLength; q++) {
                if (newArray[p] > newArray[q]) {
                    int temp = newArray[p];
                    newArray[p] = newArray[q];
                    newArray[q] = temp;
                }
            }
        }
        return newArray;
    }

    //Tutors Solution to above problem
    public static Integer[] mergeSortedArrays2(Integer[] array1, Integer[] array2) {
        Integer array1Element = array1[0];
        Integer array2Element = array2[0];
        int i = 1;
        int j = 1;
        int k = 0;

        Integer[] newArray = new Integer[array1.length + array2.length];
        while ((array1Element != null) || array2Element!= null) {
            if ((!(array2Element == null)) || (array1Element < array2Element)) {
                newArray[k] = array1Element;
                array1Element = array1[i];
                i++; k++;
            } else {
                newArray[k] = array2Element;
                array2Element = array2[j];
                j++; k++;
            }
        }
        return newArray;
    }
}
