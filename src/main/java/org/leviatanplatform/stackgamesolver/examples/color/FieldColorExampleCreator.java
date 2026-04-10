package org.leviatanplatform.stackgamesolver.examples.color;

import org.leviatanplatform.stackgamesolver.domain.Field;
import org.leviatanplatform.stackgamesolver.domain.Item;
import org.leviatanplatform.stackgamesolver.domain.Stack;

import java.util.ArrayList;
import java.util.List;

import static org.leviatanplatform.stackgamesolver.examples.color.ColorProperty.*;

public class FieldColorExampleCreator {

    private static final int STACK_CAPACITY = 4;

    public static Field create() {

        List<Stack> listStacks = new ArrayList<>();

        addStack(listStacks, MARINE, GREEN, PINK, PURPLE);
        addStack(listStacks, MARINE, RED, PINK, ORANGE);
        addStack(listStacks, RED, MARINE, BLUE, CYAN);
        addStack(listStacks, GREEN, CLAY, PURPLE, GREEN);
        addStack(listStacks, CYAN, RED, YELLOW, ORANGE);
        addStack(listStacks, YELLOW, ORANGE, CLAY, LIMA);
        addStack(listStacks, LIMA, YELLOW, BROWN, BLUE);
        addStack(listStacks, LIMA, PINK, YELLOW, CYAN);
        addStack(listStacks, BLUE, RED, BROWN, PURPLE);
        addStack(listStacks, ORANGE, BROWN, LIMA, GREEN);
        addStack(listStacks, MARINE, CLAY, CLAY, CYAN);
        addStack(listStacks, PURPLE, BROWN, PINK, BLUE);
        addStack(listStacks);
        addStack(listStacks);

        return new Field(listStacks);
    }

    private static void addStack(List<Stack> listStacks, ColorProperty... arrayColorProperty) {
        listStacks.add(buildStack(arrayColorProperty));
    }

    private static Stack buildStack(ColorProperty... arrayColorProperty) {

        List<ColorProperty> listColorProperty = List.of(arrayColorProperty);
        List<Item> listItems = listColorProperty.stream().map(c -> new Item(c.getProperty())).toList();
        List<Item> listElements = new ArrayList<>(listItems);
        return new Stack(STACK_CAPACITY, listElements);
    }
}
