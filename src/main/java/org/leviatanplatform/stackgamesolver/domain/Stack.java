package org.leviatanplatform.stackgamesolver.domain;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private final List<Item> listElements;
    private final int capacity;

    public Stack(int capacity) {
        this(capacity, List.of());
    }

    public Stack(int capacity, List<Item> listElements) {

        if (capacity <= 0) {
            throw new StackException("The stack capacity must at least be 1");
        }

        this.listElements = new ArrayList<>();
        this.capacity = capacity;

        this.listElements.addAll(listElements);
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

    public boolean canPop() {

        if (isEmpty() || isSolved()) {
            return false;
        }

        return true;
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

    public boolean isSolved() {
        if (isEmpty()) {
            // Void is solved
            return true;
        }

        if (!isFull()) {
            return false;
        }

        int propertyValue = listElements.get(0).getProperty();

        for (Item item : listElements) {
            if (item.getProperty() != propertyValue) {
                return false;
            }
        }

        // All equal is solved
        return true;
    }

    public Stack cloneStack() {
        return new Stack(capacity, listElements);
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

    public String getPositionString() {
        StringBuilder sb = new StringBuilder();

        for (Item item : listElements) {
            sb.append(item.getProperty()).append(",");
        }

        return sb.toString();
    }

    public List<Integer> getProperties() {
        List<Integer> listProperties = new ArrayList<>();

        for (Item item : listElements) {
            listProperties.add(item.getProperty());
        }

        return listProperties;
    }
}
