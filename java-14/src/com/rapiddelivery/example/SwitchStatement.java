package com.rapiddelivery.example;

public class SwitchStatement {
    public static void main(String[] args) {
        Day day = Day.SATURDAY;

        switch (day) {
            case MONDAY:
            case WEDNESDAY:
            case FRIDAY:
                System.out.println("Go to the gym");
                break;
            case TUESDAY:
            case THURSDAY:
            case SUNDAY:
                System.out.println("Relax");
                break;
            case SATURDAY:
                System.out.println("Go to the Swimming pool");
        }

        switch (day) {
            case MONDAY, WEDNESDAY, FRIDAY -> System.out.println("Go to the gym");
            case TUESDAY, THURSDAY, SUNDAY -> System.out.println("Relax");
            case SATURDAY -> System.out.println("Go to the swimming pool");
        }

        String dayActivity = switch (day) {
            case MONDAY, WEDNESDAY, FRIDAY -> "Go to the gym";
            case TUESDAY, THURSDAY, SUNDAY -> "Relax";
            case SATURDAY -> "Go to the swimming pool";
//            default -> "no activity";
        };
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

