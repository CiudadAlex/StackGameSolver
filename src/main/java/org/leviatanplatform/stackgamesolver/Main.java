package org.leviatanplatform.stackgamesolver;

import org.leviatanplatform.stackgamesolver.domain.Field;
import org.leviatanplatform.stackgamesolver.domain.Move;
import org.leviatanplatform.stackgamesolver.engine.FieldSolver;
import org.leviatanplatform.stackgamesolver.examples.color.FieldColorExampleCreator;
import org.leviatanplatform.stackgamesolver.examples.color.FieldColorVisualizer;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Field field = FieldColorExampleCreator.createEasy();

        FieldColorVisualizer.visualize(field);

        solve(field);
    }

    private static void solve(Field field) {

        Field fieldSolution = FieldSolver.solve(field);
        FieldColorVisualizer.visualize(fieldSolution);

        List<Move> listMove = fieldSolution.getListMoves();

        if (listMove == null) {
            System.out.println("No solution found");

        } else {
            System.out.println("Solution found!!");

            for (Move move : listMove) {
                System.out.println(move.getIdStackSource() + " -> " + move.getIdStackTarget());
            }
        }
    }
}
