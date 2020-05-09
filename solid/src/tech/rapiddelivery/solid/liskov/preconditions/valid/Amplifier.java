package tech.rapiddelivery.solid.liskov.preconditions.valid;

import java.util.Optional;

abstract class Amplifier {
    private final int gainFactor;

    public Amplifier(int factor) {
        gainFactor = factor;
    }

    abstract Optional<String> checkForErrors(int number);

    public int execute(int number) {
        checkForErrors(number)
                .ifPresent((m) -> {
                    throw new IllegalStateException(m);
                });

        return gainFactor * number;
    }
}
