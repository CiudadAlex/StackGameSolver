package org.leviatanplatform.stackgamesolver.domain;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private final List<Stack> listStacks;

    public Field(List<Stack> listStacks) {
        this.listStacks = listStacks;
    }

    public Field cloneField() {

        List<Stack> listStacksCloned = new ArrayList<>();

        for (Stack stack : listStacks) {
            listStacksCloned.add(stack.cloneStack());
        }

        return new Field(listStacksCloned);
    }

    public String getPositionString() {
        StringBuilder sb = new StringBuilder();

        for (Stack stack : listStacks) {
            sb.append(stack.getPositionString()).append("|");
        }

        return sb.toString();
    }
}
