package org.leviatanplatform.stackgamesolver.domain;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    private final List<T> listElements;
    private final int capacity;

    public Stack(int capacity) {
        this.listElements = new ArrayList<>();
        this.capacity = capacity;
    }

    public void push(T element) {

        if (isFull()) {
            throw new StackException("The stack is full");
        }

        listElements.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new StackException("The stack is empty");
        }
        return listElements.remove(listElements.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new StackException("The stack is empty");
        }
        return listElements.get(listElements.size() - 1);
    }

    public boolean isEmpty() {
        return listElements.isEmpty();
    }

    public boolean isFull() {
        return size() >= capacity;
    }

    public int size() {
        return listElements.size();
    }
}
