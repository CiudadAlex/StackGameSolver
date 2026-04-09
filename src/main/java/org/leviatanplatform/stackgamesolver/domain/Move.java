package org.leviatanplatform.stackgamesolver.domain;

public class Move {

    private final int idStackSource;
    private final int idStackTarget;

    public Move(int idStackSource, int idStackTarget) {
        this.idStackSource = idStackSource;
        this.idStackTarget = idStackTarget;
    }

    public String toString() {
        return "(" + idStackSource + "," + idStackTarget + ")";
    }
}
