package com.rapiddelivery.example;

import java.math.BigDecimal;
import java.util.Objects;

public class PatternMatching {
    private int a;
    private int b;

    public void matching(Object object){
        // Before
        if (object instanceof BigDecimal){
            BigDecimal number = (BigDecimal) object;
            System.out.println(number.add(BigDecimal.TEN));
        }

        // Java 14
        if (object instanceof BigDecimal number){
            System.out.println(number.add(BigDecimal.TEN));
        }

        if (object instanceof BigDecimal number && number.equals(BigDecimal.ZERO)){
            System.out.println("It is zero");
        }
       /*
        Will not compile
        if (object instanceof BigDecimal number || number.equals(BigDecimal.ZERO)){
            System.out.println("It is zero");
        }
        */
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final PatternMatching matching = (PatternMatching) o;
        return a == matching.a &&
                b == matching.b;
    }

    public boolean newEquals(Object o) {
        if (this == o) return true;

        return  o instanceof PatternMatching patternMatching
                && a == patternMatching.a
                && b == patternMatching.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
