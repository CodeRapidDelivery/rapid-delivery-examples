package tech.rapiddelivery.solid.liskov.preconditions.valid;

import java.util.Optional;
import java.util.function.Function;

class DefaultAmplifier extends Amplifier {
    DefaultAmplifier(int factor) {
        super(factor);
    }

    @Override
    Optional<String> checkForErrors(int number) {
        return Optional.empty();
    }
}
