package com.advanced.dsa.dataStructures.linear.linkedList.singly;
class LinkedList{
    Node head;//Starting node of the list -> only access point
    private int size;
    LinkedList(){
        size=0; //Initially list is empty ,so size is zero.
    }
    public class Node {
        String data; //The data of the node-> String type
        Node next;//address of the next node-> Node type
        Node(String data){
            this.data=data;
            this.next=null;//Initially node is connected to null
            size++;//Increment the size as a node is created
        }
    }
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addFirst(String data){
        //Create a new node
        Node newNode=new Node(data);
        //Point the next node to new node to the head
        newNode.next=head;
        //this newNode is the new head of the list
        //point the head to this newNode
        head=newNode;
    }
    public void addLast(String data){
        //Create a new node
        Node newNode=new Node(data);
        //If the list is empty head will point to null
        if(head==null){
            head=newNode;//the newNode becomes the head of the list
            return;
        }
        //For multiple elements -we need to find the last(tail) node
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        //After this loop we will be standing at last node
        //Point the last node next to newNode
        last.next=newNode;
    }
    public void removeFirst(){
        //Empty List
        if(head==null){
            System.out.println("Empty list.Can't remove head");
            return;
        }
        //Single element or multiple elements
        //For a single element -> if deleted-> head becomes null
        //For multiple elements-> if deleted-> head is the next node
        head=this.head.next;
        size--;//reduce the size of nodes
    }
    public void removeLast(){
        //Empty List
        if(head==null){
            System.out.println("Empty list.Can't remove tail");
            return;
        }
        //Single element
        if(head.next==null){
            head=null;
            size--;//One node deleted
            return;
        }
        Node secondLast=head;
        Node Last=head.next;
        while(Last.next!=null){
            secondLast=Last;
            Last=Last.next;
        }
        secondLast.next=null;
        //Last Node will be cleared by JVM
        size--;
    }
    public void deleteTargetNode(String target){
        //Empty List cannot remove target
        if(head==null){
            System.out.println("Empty list.Can't remove tail");
            return;
        }
        //Case where target is head node
        if(head.data.equals(target)){
            head=head.next;//Move the head to next node
            size--;
            return;
        }
        //Case where target is anywhere else in the list
        Node previous=null;
        Node current=head;
        while(current!=null&&!current.data.equals(target)){
            previous=current;
            current=current.next;
        }
        if(current==null){
            System.out.println("Target not found");
        }
        previous.next = current.next;
        size--;
    }
    public static void main(String[] args) {
        LinkedList sll=new LinkedList();
        sll.addFirst("ECE");
        sll.addFirst("&");
        sll.addFirst("EE");
        sll.addFirst("6th sem");
        sll.printList();
        sll.addLast("coding");
        sll.addLast("Training");
        sll.addLast("taking");
        sll.addLast("today");
        sll.printList();
        sll.removeFirst();
        sll.printList();
        sll.removeLast();
        sll.printList();
        sll.deleteTargetNode("coding");
        sll.printList();
    }
}

