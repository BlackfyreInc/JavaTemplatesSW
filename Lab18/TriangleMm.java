public class TriangleMm implements Triangle {

    private float a;
    private float b;
    private float c;
    public static boolean checkExistence(float a, float b, float c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public TriangleMm(float a, float b, float c) {
        assert checkExistence(a, b, c);

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(float a) {
        if (checkExistence(a, b, c))
            this.a = a;
        else System.out.println("Error: value is not set");
    }

    public void setB(float b) {
        if (checkExistence(a, b, c))
            this.b = b;
        else System.out.println("Error: value is not set");
    }

    public void setC(float c) {
        if (checkExistence(a, b, c))
            this.c = c;
        else System.out.println("Error: value is not set");
    }

    public float perimeter() {
        return a + b + c;
    }

    public float square() {
        float p = perimeter() / 2;
        float s = p * (p - a) * (p - b) * (p - c);
        return (float) Math.sqrt(s);
    }

    public Memento save() {
        return new TriangleMementoRestore(this, a, b, c);
    }
}
