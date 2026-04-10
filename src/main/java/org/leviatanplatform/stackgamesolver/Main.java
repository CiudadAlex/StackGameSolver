package org.leviatanplatform.stackgamesolver;

import org.leviatanplatform.stackgamesolver.domain.Field;
import org.leviatanplatform.stackgamesolver.domain.Move;
import org.leviatanplatform.stackgamesolver.engine.FieldSolver;
import org.leviatanplatform.stackgamesolver.examples.color.FieldColorExampleCreator;
import org.leviatanplatform.stackgamesolver.examples.color.FieldColorVisualizer;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Field field = FieldColorExampleCreator.create();

        FieldColorVisualizer.visualize(field);

        solve(field);
    }

    private static void solve(Field field) {

        List<Move> listMove = FieldSolver.solve(field);

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
