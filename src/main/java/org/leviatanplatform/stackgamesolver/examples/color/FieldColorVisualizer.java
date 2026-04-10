package org.leviatanplatform.stackgamesolver.examples.color;

import org.fusesource.jansi.Ansi;
import org.leviatanplatform.stackgamesolver.domain.Field;

import java.util.List;

public class FieldColorVisualizer {

    public static void visualize(Field field) {

        List<List<Integer>> listListProperties = field.getProperties();
        System.out.println(Ansi.ansi().fgRed().a("Texto rojo").reset());
    }
}
