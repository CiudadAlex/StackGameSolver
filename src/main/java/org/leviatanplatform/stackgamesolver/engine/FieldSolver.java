package org.leviatanplatform.stackgamesolver.engine;

import org.leviatanplatform.stackgamesolver.domain.Field;
import org.leviatanplatform.stackgamesolver.domain.Move;

import java.util.List;

public class FieldSolver {

    public List<Move> solve(Field field) {

        List<Field> listNextFields = NextMoveCalculator.calculateNextPossibleMoves(field);
        // FIXME acabar
        return null;
    }
}
