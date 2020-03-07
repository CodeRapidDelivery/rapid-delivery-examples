package tech.rapiddelivery.solid.liskov.preconditions.valid;

import java.util.Optional;
import java.util.function.Function;

abstract class Amplifier {
    private final int gainFactor;

    public Amplifier(int factor) {
        gainFactor = factor;
    }

    abstract Function<Integer, Optional<String>> checkInputForErrors();

    public int execute(int input) {
        checkInputForErrors()
                .apply(input)
                .ifPresent((m) -> {
                    throw new IllegalStateException(m);
                });

        return gainFactor * input;
    }
}
