package com.company.keroles;

public class MyLinkedList {

    private MyLinkedListNode head;
    private MyLinkedListNode tail;
    private int count=0;

    public static class MyLinkedListNode{
        private int data;
        private MyLinkedListNode next;

        public MyLinkedListNode(int data) {
            this.data = data;
            this.next=null;
        }

        public int getData() {
            return data;
        }
        public MyLinkedListNode getNext() {
            return next;
        }

        public void setNext(MyLinkedListNode next) {
            this.next = next;
        }
    }

    public MyLinkedListNode getHead() {
        return head;
    }

    public int getCount() {
        return count;
    }

    public void setHead(MyLinkedListNode head) {
        this.head = head;
    }
    public MyLinkedListNode getTail() {
        return tail;
    }
    public void setTail(MyLinkedListNode tail) {
        this.tail = tail;
    }
    public void append(MyLinkedListNode node){
        if (this.head==null){
            this.head=this.tail =node;
        } else {
            this.tail.setNext(node);
            this.tail =node;
        }
        count++;
    }
    public void push(MyLinkedListNode node){
        if (this.head==null){
            this.head=this.tail =node;
        } else {
            node.setNext(head);
            this.head=node;
        }
        count++;
    }
    public void insertAfter(MyLinkedListNode prev_node,MyLinkedListNode new_node){
        if (prev_node ==null)return;
        new_node.setNext(prev_node.getNext());
        prev_node.setNext(new_node);
        count++;
    }
    public void insertIndex(int index,MyLinkedListNode new_ode){
        if (head==null||count==0){
            System.out.println("No elements to delete");
            return;
        }
        if (index>=count){
            System.out.println("Out of index");
            return;
        }
        if (index==0){
            push(new_ode);
            return;
        }else {
            int c=0;
            MyLinkedListNode current=this.head;
            while (c++<count){
                if (c==index){
                    new_ode.setNext(current.getNext());
                    current.setNext(new_ode);
                    break;
                }
                current=current.getNext();
            }
            count++;
        }
    }
    public void deleteHead(){
        if (this.head !=null){
            head=head.next;
            count--;
        }
    }
    public void deleteTail(){
        if (head==null)return;
        else if (head.getNext()==null){
            head=null;
        }else {
            MyLinkedListNode prev, temp;
            prev = temp = head;
            while (temp.getNext() != null) {
                prev=temp;
                temp=temp.getNext();
            }
            prev.setNext(null);
        }
        count--;
    }
    public void deleteNodeByIndex(int index){
        if (head==null||count==0){
            System.out.println("No elements to delete");
            return;
        }
        if (index>=count){
            System.out.println("Out of index");
            return;
        }
        if (index==0){
            head=head.getNext();
            count--;
            return;
        }else {
            int c=0;
            MyLinkedListNode prev,temp;
            prev=temp=head;
            while (c<=index){
                if (index==c) {
                    break;
                }
                prev=(temp);
                temp=temp.getNext();
                c++;
            }
            prev.setNext(temp.getNext());
            count--;
        }
    }

    public void printLinkedList(){
        MyLinkedListNode printNext=getHead();
        while (printNext!=null){
            System.out.println(printNext.getData());
            printNext=printNext.getNext();
        }
    }

}
