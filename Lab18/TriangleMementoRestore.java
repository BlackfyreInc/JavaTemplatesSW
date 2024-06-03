public class TriangleMementoRestore implements Memento {
    private final TriangleMm triangle;
    private final float a;
    private final float b;
    private final float c;

    public TriangleMementoRestore(TriangleMm triangle, float a, float b, float c) {
        this.triangle = triangle;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void restore() {
        triangle.setA(a);
        triangle.setB(b);
        triangle.setC(c);
    }
}
