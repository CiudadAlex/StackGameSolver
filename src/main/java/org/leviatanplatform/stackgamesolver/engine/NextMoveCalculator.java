package org.leviatanplatform.stackgamesolver.engine;

import org.leviatanplatform.stackgamesolver.domain.Field;

import java.util.ArrayList;
import java.util.List;

public class NextMoveCalculator {

    public List<Field> calculateNextPossibleMoves(Field field) {

        List<Field> listNextPossibleFields = new ArrayList<>();

        int numberOfStacks = field.getNumberOfStacks();

        for (int i = 0; i < numberOfStacks; i++) {
            for (int k  =0; k < numberOfStacks; k++) {
                addToNextPossibleFieldsIfPossibleMoveNotRepetitive(listNextPossibleFields, field, i, k);
            }
        }

        return listNextPossibleFields;
    }

    private void addToNextPossibleFieldsIfPossibleMoveNotRepetitive(List<Field> listNextPossibleFields, Field field, int idSourceStack, int idTargetStack) {

        if (idSourceStack == idTargetStack) {
            return;
        }

        if (!field.canMove(idSourceStack, idTargetStack)) {
            return;
        }

        Field fieldMoved = field.cloneField();
        fieldMoved.move(idSourceStack, idTargetStack);

        if (!fieldMoved.isCurrentPositionAlsoInPrevious()) {
            // Only if the movement is possible and it is not among the previous ones it is considered
            listNextPossibleFields.add(fieldMoved);
        }
    }
}
