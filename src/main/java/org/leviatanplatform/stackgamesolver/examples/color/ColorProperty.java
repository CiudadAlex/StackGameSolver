package org.leviatanplatform.stackgamesolver.examples.color;

public enum ColorProperty {

    PURPLE(1, 128, 0, 128),
    PINK(2, 232, 28, 242),
    GREEN(3, 19, 133, 6),
    MARINE(4, 22, 5, 207),
    ORANGE(5, 255, 128, 0),
    CYAN(6, 0, 255, 255),
    BLUE(7, 38, 134, 219),
    CLAY(8, 165, 42, 42),
    YELLOW(9, 255, 255, 0),
    LIMA(10, 128, 255, 0),
    BROWN(11, 165, 127, 38),
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

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    public static ColorProperty getByProperty(int property) {

        for (ColorProperty colorProperty : values()) {
            if (property == colorProperty.getProperty()) {
                return colorProperty;
            }
        }
        return null;
    }
}
