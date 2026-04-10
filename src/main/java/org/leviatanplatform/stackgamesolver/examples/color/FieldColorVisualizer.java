package org.leviatanplatform.stackgamesolver.examples.color;

import org.fusesource.jansi.Ansi;
import org.leviatanplatform.stackgamesolver.domain.Field;

import java.util.Iterator;
import java.util.List;

public class FieldColorVisualizer {

    private static final int NUM_STACKS_IN_ROW = 4;
    private static final String COLOR_SPACE = "    ";

    public static void visualize(Field field) {

        List<List<Integer>> listListProperties = field.getProperties();
        Iterator<List<Integer>> iteratorStacks = listListProperties.iterator();

        // FIXME acabar

        System.out.println(Ansi.ansi().fgRed().a("Texto rojo").reset());
    }

    private void printRowOfStacks(List<List<Integer>> listListPropertiesRow) {
        // FIXME acabar
    }

    private void printPropertyColor(Integer propertyColor) {

        if (propertyColor == null) {
            System.out.print(COLOR_SPACE);
            return;
        }

        ColorProperty colorProperty = ColorProperty.getByProperty(propertyColor);
        int r = colorProperty.getR();
        int g = colorProperty.getG();
        int b = colorProperty.getB();
        System.out.print(Ansi.ansi().bgRgb(r, g, b).a(COLOR_SPACE).reset());
    }
}
