package tech.rapiddelivery.solid.liskov.preconditions;

public class NegativeAmplifier extends Amplifier {
    public NegativeAmplifier(int factor) {
        super(factor);
    }

    @Override
    public int execute(int input){
        if (input > 0){
            throw new IllegalStateException("Positive numbers not allowed");
        }
        return super.execute(input);
    }
}
