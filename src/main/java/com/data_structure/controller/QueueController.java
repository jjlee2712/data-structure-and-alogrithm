package com.data_structure.controller;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/queue")
public class QueueController {

    // Queue = FIFO data structure, First in, first out
    // Enqueue = add to the end of the queue (offer())
    // Dequeue = remove from the front of the queue (poll())
    // Peek = view the front of the queue (peek())

    // Example of a queue
    // 1. Printer Queue
    // 2. Queue of customers at a bank

    @GetMapping("")
    public void queue() {
        Queue<String> queue = new LinkedList<String>();
        
        // Add items to the queue
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        
        // Check if the queue is empty
        System.out.println(queue.isEmpty());

        // Get the size of the queue
        System.out.println(queue.size());

        // Check if the queue contains an item
        System.out.println(queue.contains("Harold"));



        // Print the queue
        System.out.println(queue.peek());

        // Remove items from the queue
        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println("Queue: " + queue);
    }


    // Priority Queue = FIFO data structure, First in, first out with priority
    // Higher priority items are dequeued before lower priority items

    @GetMapping("/priority_queue")
    public void priorityQueue() {
        // Create a priority queue with reverseOrder
        // Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        // queue.offer(3.0);
        // queue.offer(2.5);
        // queue.offer(1.0);
        // queue.offer(4.5);

        // Create a priority queue with natural order
        Queue<String> queue = new PriorityQueue<>();

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
