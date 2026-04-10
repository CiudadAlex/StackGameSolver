package org.leviatanplatform.stackgamesolver.examples.color;

import org.fusesource.jansi.Ansi;
import org.leviatanplatform.stackgamesolver.domain.Field;

public class FieldColorVisualizer {

    public static void visualize(Field field) {


        System.out.println(Ansi.ansi().fgRed().a("Texto rojo").reset());
    }
}
