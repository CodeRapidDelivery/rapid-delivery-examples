package com.rapiddelivery.example;

public class TextBlocks {
    public static void main(String[] args) {
        System.out.println(
                """
                Here is the text
                    Here is the indention
                And Back
                """
        );
        System.out.println(
                """
                Here is the text
                    Here is the indention
                And Back
            """
        );

        System.out.println(
                """
                Here is everything \
                in one \
                Line \
                """
        );
    }
}
