package org.leviatanplatform.stackgamesolver.domain;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private final List<Stack> listStacks;
    private final List<String> listPreviousPositions;

    public Field(List<Stack> listStacks, List<String> listPreviousPositions) {
        this.listStacks = listStacks;
        this.listPreviousPositions = listPreviousPositions;
    }

    public Field cloneField() {

        List<Stack> listStacksCloned = new ArrayList<>();

        for (Stack stack : listStacks) {
            listStacksCloned.add(stack.cloneStack());
        }

        List<String> listPreviousPositionsCloned = new ArrayList<>();
        listPreviousPositionsCloned.addAll(listPreviousPositions);

        return new Field(listStacksCloned, listPreviousPositionsCloned);
    }

    public String getPositionString() {
        StringBuilder sb = new StringBuilder();

        for (Stack stack : listStacks) {
            sb.append(stack.getPositionString()).append("|");
        }

        return sb.toString();
    }
}
