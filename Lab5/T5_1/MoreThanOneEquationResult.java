import java.util.List;

public class MoreThanOneEquationResult implements EquationResult {
    List<Float> value;

    public MoreThanOneEquationResult(List<Float> value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
