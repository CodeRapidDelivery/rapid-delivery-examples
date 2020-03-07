package tech.rapiddelivery.solid.liskov.preconditions.valid;

public class AmplifierMain {
    public static void main(String[] args) {
        Amplifier defaultA = new DefaultAmplifier(2);
        final int resultD = defaultA.execute(2);
        System.out.println(resultD);

        Amplifier negativeA = new NegativeAmplifier(3);
        negativeA.execute(2);
    }
}
