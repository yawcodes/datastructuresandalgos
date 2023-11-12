package lineardatastructures.techniques;

import lineardatastructures.singlelinkedlist.Node;
import lineardatastructures.singlelinkedlist.SingleLinkedList;

public class TwoPointerTechnique {

    /**
     *  This is to illustrate finding the tail seeker of a linkedList
     *  Example if you were given n which is the number in the linkedList you want to return
     *  Example: linkedList <head> a -> b -> c -> d -> e -> null <tail>
     *  Given the linkedlist above TwoPointerTechnique(3) is O(n) - 3 = 2
     *  Returns 2
     *
     */

    public static Node findN(SingleLinkedList list, int n) {
        Node currentNode = null;
        Node tailSeeker = list.head;
        int count = 0;

        while (tailSeeker != null) {
            if (count >= n) {
               if (currentNode == null) {
                   currentNode = list.head;
               }
               currentNode = currentNode.getNextNode();
            }
            tailSeeker = tailSeeker.getNextNode();
            count ++;
        }

        return currentNode;
    }

    public static void main(String[] args) {
        SingleLinkedList seasons = new SingleLinkedList();
        seasons.addToHead("summer");
        seasons.addToHead("winter");
        seasons.addToHead("fall");
        seasons.addToHead("spring");

        seasons.printLinkedList();
        Node result = TwoPointerTechnique.findN(seasons, 1);
        System.out.println("********* Printing results ***********");
        System.out.println(result.data);

    }

}
