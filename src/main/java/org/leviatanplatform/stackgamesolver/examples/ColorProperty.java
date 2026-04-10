package org.leviatanplatform.stackgamesolver.examples;

public enum ColorProperty {

    RED(1),
    YELLOW(2),
    BLUE(3),
    PURPLE(4),
    GREEN(5);

    private final int property;

    ColorProperty(int property) {
        this.property = property;
    }

    public int getProperty() {
        return property;
    }
}
