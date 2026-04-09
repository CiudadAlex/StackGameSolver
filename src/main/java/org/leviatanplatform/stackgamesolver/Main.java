package org.leviatanplatform.stackgamesolver;

import org.leviatanplatform.stackgamesolver.domain.Field;
import org.leviatanplatform.stackgamesolver.engine.FieldSolver;
import org.leviatanplatform.stackgamesolver.examples.FieldExampleCreator;

public class Main {

    public static void main(String[] args) {

        Field field = FieldExampleCreator.create();
        FieldSolver.solve(field);
    }
}
