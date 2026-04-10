package org.leviatanplatform.stackgamesolver.engine;

import org.leviatanplatform.stackgamesolver.domain.Field;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FieldSolver {

    public static Field solve(Field field) {

        List<Field> listNextFields = List.of(field);
        int i = 0;

        while (true) {

            for (Field nextField : listNextFields) {
                if (nextField.isSolved()) {
                    return nextField;
                }
            }

            listNextFields = getNextFields(listNextFields);

            i++;
            System.out.println(i + " >> " + listNextFields.size());
        }
    }

    public static List<Field> getNextFields(List<Field> listFields) {

        Map<String, Field> listAllNextFields = new HashMap<>();

        for (Field field : listFields) {

            List<Field> listNextFields = NextMoveCalculator.calculateNextPossibleMoves(field);

            for (Field nextField : listNextFields) {
                listAllNextFields.put(nextField.getPositionString(), nextField);
            }
        }

        return new ArrayList<>(listAllNextFields.values());
    }
}
