package tech.rapiddelivery.solid.liskov.preconditions;

public class Amplifier {
    private final int gainFactor;

    public Amplifier(int factor) {
        gainFactor = factor;
    }

    public int execute(int input) {
        return gainFactor * input;
    }
}
