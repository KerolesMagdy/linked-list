package com.keroles;

public class Main {

    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.append(new MyLinkedList.MyLinkedListNode(2));
        myLinkedList.push(new MyLinkedList.MyLinkedListNode(4));
        myLinkedList.append(new MyLinkedList.MyLinkedListNode(5));
        myLinkedList.push(new MyLinkedList.MyLinkedListNode(7));
        myLinkedList.append(new MyLinkedList.MyLinkedListNode(1));
        myLinkedList.push(new MyLinkedList.MyLinkedListNode(9));
        myLinkedList.append(new MyLinkedList.MyLinkedListNode(6));
        myLinkedList.push(new MyLinkedList.MyLinkedListNode(3));
        myLinkedList.insertIndex(2,new MyLinkedList.MyLinkedListNode(8));
        myLinkedList.printLinkedList();
        System.out.println("Linked list length    = "+myLinkedList.getCount());
    }
}
