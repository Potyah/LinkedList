package singly_linked_list_main;

import singly_linked_list.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(null);
        System.out.println(list);

        list.reverse();

        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();
        list2 = list.copy();
        System.out.println(list2);
    }
}