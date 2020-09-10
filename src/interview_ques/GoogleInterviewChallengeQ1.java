package interview_ques;

import java.util.*;

public class GoogleInterviewChallengeQ1 {
    public static void main(String[] args) {
        String[] array1 = new String[]{"a", "b", "c", "x"};
        String[] array2 = new String[]{"z", "y", "x"};
        System.out.println(containsCommonItems2(array1, array2));
    }

    public static boolean doesContainCommonItems(String[] array1, String[] array2) { // O(a * b)
        ArrayList<String> alreadySearchedItemsForArrayOne = new ArrayList<>();
        List<String> itemsForArrayTwo = Arrays.asList(array2);
        for (String arrayOneElement : array1) {
            if (alreadySearchedItemsForArrayOne.contains(arrayOneElement)) { //Handles duplicate in array1
                continue;
            }
            if (itemsForArrayTwo.contains(arrayOneElement)) {
                return true;
            }
        }
        return false;
    }
    public static boolean containsCommonItems2 (String[] arr1, String[] arr2){ // O(a + b)
        Hashtable<String, Boolean> arrayOneObject = new Hashtable<>();
        for (String arrayOneElement : arr1) {
            if (!(arrayOneObject.containsKey(arrayOneElement))) {
                arrayOneObject.put(arrayOneElement, true);
            }
        }
        for (String arrayTwoElement : arr2) {
            if (arrayOneObject.containsKey(arrayTwoElement)) {
                return true;
            }
        }
        return false;
    }
}




////            for (String arrayTwoElement: array2) {
////                if (alreadySearchedItemsForArrayTwo.contains(arrayOneElement)) {
////                    return true;
////                } else if (arrayOneElement.equals(arrayTwoElement)) {
////                    return true;
////                } else {
////                    if (!alreadySearchedItemsForArrayTwo.contains(arrayTwoElement)) {
////                        alreadySearchedItemsForArrayTwo.add(arrayTwoElement);
////                    }
////                }
////            }
//            alreadySearchedItemsForArrayOne.add(arrayOneElement);
//        }
//        return false;
