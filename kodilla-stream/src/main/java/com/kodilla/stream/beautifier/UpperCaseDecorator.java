package com.kodilla.stream.beautifier;

public class UpperCaseDecorator implements PoemDecorator {
    @Override
    public String decorate (String text){
        String decorated2 = text.toUpperCase(); // może być też "return text.toUpperCase();"
        return decorated2;

    }
}
