package org.leviatanplatform.stackgamesolver.domain;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private final List<Stack> listStacks;
    private final List<String> listPreviousPositions;
    private final List<Move> listMoves;

    public Field(List<Stack> listStacks) {
        this.listStacks = listStacks;
        this.listPreviousPositions = new ArrayList<>();
        this.listMoves = new ArrayList<>();
    }

    public Field(List<Stack> listStacks, List<String> listPreviousPositions, List<Move> listMoves) {
        this.listStacks = listStacks;
        this.listPreviousPositions = listPreviousPositions;
        this.listMoves = listMoves;
    }

    public Field cloneField() {

        List<Stack> listStacksCloned = new ArrayList<>();

        for (Stack stack : listStacks) {
            listStacksCloned.add(stack.cloneStack());
        }

        List<String> listPreviousPositionsCloned = new ArrayList<>();
        listPreviousPositionsCloned.addAll(listPreviousPositions);

        List<Move> listMovesCloned = new ArrayList<>();
        listMovesCloned.addAll(listMoves);

        return new Field(listStacksCloned, listPreviousPositionsCloned, listMovesCloned);
    }

    public boolean canMove(int idStackSource, int idStackTarget) {

        Stack stackSource = listStacks.get(idStackSource);
        Stack stackTarget = listStacks.get(idStackTarget);

        if (!stackSource.canPop()) {
            return false;
        }

        Item itemSource = stackSource.peek();
        return stackTarget.canPush(itemSource);
    }

    public void move(int idStackSource, int idStackTarget) {

        String currentPosition = getPositionString();

        Stack stackSource = listStacks.get(idStackSource);
        Stack stackTarget = listStacks.get(idStackTarget);

        Item itemSource = stackSource.pop();
        stackTarget.push(itemSource);

        listPreviousPositions.add(currentPosition);

        Move move = new Move(idStackSource, idStackTarget);
        listMoves.add(move);
    }

    public boolean isCurrentPositionAlsoInPrevious() {
        String currentPosition = getPositionString();
        return listPreviousPositions.contains(currentPosition);
    }

    public boolean isSolved() {

        for (Stack stack : listStacks) {
            if (!stack.isSolved()) {
                return false;
            }
        }

        return true;
    }

    public int getNumberOfStacks() {
        return listStacks.size();
    }

    public List<Move> getListMoves() {
        return listMoves;
    }

    public String getPositionString() {
        StringBuilder sb = new StringBuilder();

        for (Stack stack : listStacks) {
            sb.append(stack.getPositionString()).append("|");
        }

        return sb.toString();
    }
}
