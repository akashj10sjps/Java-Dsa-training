package com.advanced.collections.queues;

import java.util.ArrayDeque;
import java.util.Deque;

//undo redo operations
public class ArrayDequeExample {
    public static void main(String[] args) {
        //Double ended queue
        Deque<String> actions=new ArrayDeque<>();
        actions.addLast("User types A");
        actions.addLast("User types B");
        actions.addLast("User types C");
        System.out.println("Available actons:"+actions);
        System.out.println("undo action:"+actions.removeLast());
        System.out.println("undo action:"+actions.removeFirst());
        System.out.println("Remaining actons:"+actions);
    }
}
