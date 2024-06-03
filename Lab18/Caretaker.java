import java.util.Comparator;
import java.util.Stack;

public class Caretaker<T, H> {
    private final Stack<T> mementos = new Stack<>();
    private final H triangle;

    public Caretaker(H triangle) {
        this.triangle = triangle;
    }

    public void saveMemento(T memento) {
        mementos.push(memento);
    }

    public void restoreMemento() {
        if (mementos.isEmpty()) {
            return;
        }

        final T memento = mementos.pop();
        if (memento instanceof TriangleCrt.Memento memento1 && triangle instanceof TriangleCrt triangleCrt) {
            triangleCrt.restore(memento1);
        } else if (memento instanceof TriangleMementoGetSide triangleMementoGetSide && triangle instanceof TriangleCli triangleCli) {
            triangleCli.restore(triangleMementoGetSide);
        } else if (memento instanceof TriangleMementoRestore triangleMementoRestore) {
            triangleMementoRestore.restore();
        }
    }

    public T getMaxAreaMemento() {
        return mementos.stream().max(Comparator.comparing(memento -> {
            if (memento instanceof TriangleCrt.Memento memento1 && triangle instanceof TriangleCrt triangleCrt) {
                triangleCrt.restore(memento1);
                return triangleCrt.square();
            } else if (memento instanceof TriangleMementoGetSide triangleMementoGetSide && triangle instanceof TriangleCli triangleCli) {
                triangleCli.restore(triangleMementoGetSide);
                return triangleCli.square();
            } else if (memento instanceof TriangleMementoRestore triangleMementoRestore && triangle instanceof TriangleMm triangleMm) {
                triangleMementoRestore.restore();
                return triangleMm.square();
            }
            return 0f;
        })).orElse(null);
    }
}
