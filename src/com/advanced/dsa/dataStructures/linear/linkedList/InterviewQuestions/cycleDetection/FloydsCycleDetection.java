package com.advanced.dsa.dataStructures.linear.linkedList.InterviewQuestions.cycleDetection;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class FloydsCycleDetection {
    static Node head;
    static void createList(){
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=head.next;// 4-->2
       // head.next.next.next.next=null;
    }
    static boolean hasCycle(){
        Node fast=head;
        Node slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){//if Slow and fast meet cycle exist
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        createList();
        System.out.println(hasCycle()?"Cycle Detected":"No Cycle");
    }
}
