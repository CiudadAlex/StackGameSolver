package org.leviatanplatform.stackgamesolver;

import org.fusesource.jansi.Ansi;
import org.leviatanplatform.stackgamesolver.domain.Field;
import org.leviatanplatform.stackgamesolver.engine.FieldSolver;
import org.leviatanplatform.stackgamesolver.examples.color.FieldExampleCreator;

public class Main {

    public static void main(String[] args) {

        Field field = FieldExampleCreator.create();
        FieldSolver.solve(field);

        //System.out.println(Ansi.ansi().fgRed().a("Texto rojo").reset());
    }
}
