package oop.ex3A2;

public class Pair<X, Y> {
    private X x;
    private Y y;

    public Pair(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x.toString() + ", " + y.toString() + ")";
    }
}
