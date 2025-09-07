package com.data_structure.controller;

import java.util.Stack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/stack")
public class StackController {

    // Stack = LIFO data structure
    // Last in, first out
    // Push = add to the top of the stack
    // Pop = remove from the top of the stack
    // Peek = view the top of the stack
    // IsEmpty = check if the stack is empty
    // Search = search for an item in the stack and return its position from the top of the stack (1-based index)

    // Example of a stack
    // 1. Undo and Redo of a function
    // 2. Stacking of books
    // 3. Moving back and forward of web pages
    
    @GetMapping("")
    public void stack() {
        Stack<String> stack = new Stack<String>();
        System.out.println("Stack Operations");
        System.out.println("Check if stack is empty (stack.empty()): " + stack.empty());

        stack.push("Minecraft");
        stack.push("Fortnite");
        stack.push("Roblox");
        stack.push("Hollow Knight");

        System.out.println("Check if stack is empty (stack.empty()): " + stack.empty());
        System.out.println("Stack: " + stack);

        String game = stack.pop();
        System.out.println("Popped game: " + game);
        System.out.println("Stack after pop(): " + stack);
        System.out.println("Peek top game (stack.peek()): " + stack.peek());
        System.out.println("Search for 'Fortnite' in stack (stack.search('Fortnite')): " + stack.search("Fortnite"));
    }
    
}
