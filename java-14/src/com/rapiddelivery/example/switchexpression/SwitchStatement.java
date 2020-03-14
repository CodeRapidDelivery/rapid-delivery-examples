package com.rapiddelivery.example.switchexpression;

public class SwitchStatement {

    public static void main(String[] args) {
        Day day = Day.SATURDAY;

        // switch statement
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

        // Switch expression as the value
        String dayActivity = switch (day) {
            case MONDAY, WEDNESDAY, FRIDAY -> "Go to the gym";
            case TUESDAY, THURSDAY, SUNDAY -> "Relax";
            case SATURDAY -> "Go to the swimming pool";
        };
        System.out.println(dayActivity);

        // variables scope
        switch (day) {
            case MONDAY:
                String activity = "Go to the Gym";
                System.out.println(activity);
                break;
            case SATURDAY:
                /* TODO cannot do that
                String activity = "Relax";*/
                System.out.println("Go to the swimming pool");
        }

        switch (day) {
            case MONDAY -> {
                String activity = "Go to the Gym" ;
            }
            case SATURDAY -> {
                String activity = "Go to the swimming pool";
            }
        }

        // yield in switch expression
        String result = switch (day) {
            case MONDAY -> {
                String activity = "Go to the Gym" ;
                yield activity;
            }
            case SATURDAY -> "Go to the swimming pool";
            default -> "";
        };

        String resultOldSwitch = switch (day){
            case MONDAY:
                yield "Sth";
            case SATURDAY:
                yield "Go to the swimming pool";
            default:
                yield "";
        };
    }


}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

