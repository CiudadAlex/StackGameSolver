package org.leviatanplatform.stackgamesolver;

import org.leviatanplatform.stackgamesolver.domain.Field;
import org.leviatanplatform.stackgamesolver.engine.FieldSolver;
import org.leviatanplatform.stackgamesolver.examples.color.FieldColorExampleCreator;

public class Main {

    public static void main(String[] args) {

        Field field = FieldColorExampleCreator.create();
        FieldSolver.solve(field);

        //System.out.println(Ansi.ansi().fgRed().a("Texto rojo").reset());
    }
}
