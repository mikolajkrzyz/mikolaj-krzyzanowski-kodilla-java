package com.kodilla.stream.beautifier;

public class BeautifyMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String textToBeautify = "beautify me object";

        UpperCaseDecorator upperCaseDecorator = new UpperCaseDecorator();

        String beautifytext = poemBeautifier.beautify(textToBeautify,upperCaseDecorator);
        System.out.println(beautifytext);

        // podejście funkcyjne
        PoemBeautifier poemBeautifier1 = new PoemBeautifier();
        String textToBeautifyme = "beautify me function";
        String beautifytext1 = poemBeautifier1.beautify(textToBeautifyme,(text -> text.toUpperCase()));
        System.out.println(beautifytext1);
    }
}
