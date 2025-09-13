package com.data_structure.controller;

import java.util.LinkedList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/linked_list")
public class LinkedListController {

    // LinkedList = stores Nodes in 2 parts (data + address)
    //  Nodes are non-consecutive memory locations
    // Elements are linked using pointers


    //                 Singly Linked List
    //      Node              Node            Node
    // [data | next] -> [data | next] -> [data | next] -> null

    //                 Doubly Linked List
    //            Node                          Node            
    // [address | data | address] -> [address | data | address] -> null

    // Example of a linked list
    // 1. Implementation of stacks and queues
    // 2. GPS navigation

    @GetMapping("")
    public void linkedList() {
        LinkedList<String> linkedList = new LinkedList<String>();

        // Stack operations using LinkedList
        // linkedList.push("A");
        // linkedList.push("B");
        // linkedList.push("C");
        // linkedList.push("D");
        // linkedList.push("F");
        // linkedList.pop();

        // Queue operations using LinkedList
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        // linkedList.poll();

        linkedList.add(4, "E");
        linkedList.remove("E");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.addFirst("0");
        linkedList.addLast("G");

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println(linkedList.indexOf("F"));
        System.out.println(linkedList);
    }
}
