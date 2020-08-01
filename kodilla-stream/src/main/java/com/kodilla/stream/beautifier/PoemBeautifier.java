package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify ( String text, PoemDecorator poemDecorator) { //musimy miec co upiekszyc (Stringtext), musimy wiedzieć jak upiekszyc ( PoemDecorator)
        String decorated = poemDecorator.decorate(text); // tutaj upiększamy i przypisujemy do zmiennej decorated
        return decorated; // zwracam zmienna decorated
    }
}
