package tech.rapiddelivery.solid.liskov.preconditions.valid;

import java.util.Optional;

public class NegativeAmplifier extends Amplifier {
    public NegativeAmplifier(int factor) {
        super(factor);
    }

    @Override
    Optional<String> checkForErrors(int negativeNumber) {
        if (negativeNumber > 0) {
            return Optional.of("The argument should be negative");
        } else {
            return Optional.empty();
        }
    }
}
