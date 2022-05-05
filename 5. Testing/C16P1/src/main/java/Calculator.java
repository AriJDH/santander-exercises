import java.util.stream.DoubleStream;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double addStream(double... operands) {
        return DoubleStream.of(operands).sum();
    }
}
