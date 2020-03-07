package tech.rapiddelivery.solid.liskov.preconditions.valid;

import java.util.Optional;
import java.util.function.Function;

public class NegativeAmplifier extends Amplifier {
    public NegativeAmplifier(int factor) {
        super(factor);
    }

    @Override
    Function<Integer, Optional<String>> checkInputForErrors() {
        return (input) -> {
            if (input > 0) {
                return Optional.of("The argument should be negative");
            } else {
                return Optional.empty();
            }
        };
    }
}
