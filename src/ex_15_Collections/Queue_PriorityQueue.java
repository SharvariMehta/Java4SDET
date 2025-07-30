package ex_15_Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add("sharvari");
        priorityQueue.add("pravin");
        priorityQueue.add("mehta");
        System.out.println("Natural sorting by Priority Queue : "+priorityQueue);
        System.out.println("Using peek function : "+priorityQueue.peek());
        System.out.println("Using poll function to remove 1st element : "+priorityQueue.poll());
        System.out.println("PriorityQueue after removing head element : "+priorityQueue);
    }
}
/*
OUTPUT:
Natural sorting by Priority Queue : [mehta, sharvari, pravin]
Using peek function : mehta
Using poll function to remove 1st element : mehta
PriorityQueue after removing head element : [pravin, sharvari]
 */
