package Linked_List;

public class TowWayLinkedListTest {
    public static void main(String[] args) {
        TowWayLinkedList<String> l1 = new TowWayLinkedList<>();
        l1.insert("Rose");
        l1.insert("Jennie");
        l1.insert("List");
        l1.insert("Jisoo");

        for (String l: l1){
            System.out.println(l);
        }
        System.out.println("--------------------------------------");
        System.out.println("First Item: " + l1.getFirst());
        System.out.println("Last Item " + l1.getLast());

        System.out.println("--------------------------------------");

        //test get
        String getResult = l1.get(1);
        System.out.println("Element at index 1: " + getResult);
        //test remove
        String removeRes = l1.remove(0);
        System.out.println("Removed Element is :" + removeRes);
        //test clear
        l1.clear();
        System.out.println("the length of LinkedList after clear: " + l1.length());



    }
}
