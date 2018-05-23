import java.util.LinkedList;

public class a_11_4 {

    /*
    4. Write a method called partition that accepts a list of integers and an integer value E as its parameter, and rearranges
    (partitions) the list so that all the elements with values less than E occur before all elements with values greater than E.
    The exact order of the elements is unimportant, so long as all elements less than E appear before all elements greater than
    E. For example, for the linked list [15, 1, 6, 12, –3, 4, 8, 21, 2, 30, –1, 9], one acceptable ordering of the list after a call of partition(list, 5)
    would be [–1, 1, 2, 4, –3, 12, 8, 21, 6, 30, 15, 9].
    You may assume that the list contains no duplicates and does not contain the element value E.
    */

    public static void main(String[] args) {

        LinkedList<Integer> testList = new LinkedList<>();

        testList.add(0, 15);
        testList.add(1, 1);
        testList.add(2, 6);
        testList.add(3, 12);
        testList.add(4, -3);
        testList.add(5, 4);
        testList.add(6, 8);
        testList.add(7, 21);
        testList.add(8, 2);
        testList.add(9, 30);
        testList.add(10, -1);
        testList.add(11, 9);

        System.out.println("testList: \n" + testList);
        System.out.println("Expected result from partition(testList, 5) \n" +
                "[–1, 1, 2, 4, –3, 12, 8, 21, 6, 30, 15, 9]");
        partition(testList, 5);
        System.out.println("Result from partition(testList, 5): \n" + testList);

    }

    public static void partition(LinkedList<Integer> list, int E) {

        for (int i = 0; i < list.size(); i++) {

            if (E > list.get(i)) {

                // I save the value of element i, so i'm able to insert it after i've removed it.
                int savedValue = list.get(i);

                list.remove(i);
                list.addFirst(savedValue);
            }
        }
    }
}
