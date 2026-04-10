package org.leviatanplatform.stackgamesolver.examples.color;

public enum ColorProperty {

    PURPLE(1, 128, 0, 128),
    PINK(2, 255, 128, 128),
    GREEN(3, 0, 255, 0),
    MARINE(4, 0, 0, 128),
    ORANGE(5, 255, 128, 0),
    CYAN(6, 0, 255, 255),
    BLUE(7, 0, 0, 255),
    CLAY(8, 139, 69, 19),
    YELLOW(9, 255, 255, 0),
    LIMA(10, 128, 255, 0),
    BROWN(11, 165, 42, 42),
    RED(12, 255, 0, 0);


    private final int property;
    private final int r;
    private final int g;
    private final int b;

    ColorProperty(int property, int r, int g, int b) {
        this.property = property;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getProperty() {
        return property;
    }
}
