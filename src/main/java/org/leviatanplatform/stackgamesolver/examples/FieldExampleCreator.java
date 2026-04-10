package org.leviatanplatform.stackgamesolver.examples;

import org.leviatanplatform.stackgamesolver.domain.Field;
import org.leviatanplatform.stackgamesolver.domain.Item;
import org.leviatanplatform.stackgamesolver.domain.Stack;

import java.util.ArrayList;
import java.util.List;

public class FieldExampleCreator {

    private static final int STACK_CAPACITY = 4;

    public static Field create() {

        List<Stack> listStacks = new ArrayList<>();

        Stack stack = buildStack(ColorProperty.BLUE, ColorProperty.RED, ColorProperty.GREEN, ColorProperty.YELLOW);
        listStacks.add(stack);
        listStacks.add(buildStack());
        listStacks.add(buildStack());

        // FIXME acabar

        return new Field(listStacks);
    }

    private static Stack buildStack(ColorProperty... arrayColorProperty) {

        List<ColorProperty> listColorProperty = List.of(arrayColorProperty);
        List<Item> listItems = listColorProperty.stream().map(c -> new Item(c.getProperty())).toList();
        List<Item> listElements = new ArrayList<>(listItems);
        return new Stack(STACK_CAPACITY, listElements);
    }
}
