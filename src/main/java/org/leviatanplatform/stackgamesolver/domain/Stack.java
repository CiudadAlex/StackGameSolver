package org.leviatanplatform.stackgamesolver.domain;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private final List<Item> listElements;
    private final int capacity;

    public Stack(int capacity) {

        if (capacity <= 0) {
            throw new StackException("The stack capacity must at least be 1");
        }

        this.listElements = new ArrayList<>();
        this.capacity = capacity;
    }

    public boolean canPush(Item element) {

        if (isEmpty()) {
            return true;
        }

        if (isFull()) {
            return false;
        }

        Item lastElement = peek();
        return element.getProperty() == lastElement.getProperty();
    }

    public void push(Item element) {

        if (isFull()) {
            throw new StackException("The stack is full");
        }

        listElements.add(element);
    }

    public Item pop() {
        if (isEmpty()) {
            throw new StackException("The stack is empty");
        }
        return listElements.remove(listElements.size() - 1);
    }

    public Item peek() {
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
