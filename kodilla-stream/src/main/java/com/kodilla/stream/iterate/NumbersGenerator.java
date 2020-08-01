package com.kodilla.stream.iterate;

import java.util.stream.*;

public final class NumbersGenerator {
    public static void generateEven(int max) { // której zadaniem jest wygenerowanie kolejnych liczb parzystych. Metoda otrzymuje jeden argument wejściowy max mówiący o tym ile liczb 'pozwalamy' wygenerować naszemu strumieniowi Stream.
        Stream.iterate(1, n -> n + 1) // Metoda ta tworzy strumień obiektów typu Integer, o wartości początkowej określonej przez argument seed. Wartości kolejnych obiektów w strumieniu wyznaczane są przez wyrażenie lambda f (lub referencję do metody). Wyrażenie to otrzymuje jeden argument wejściowy - aktualną wartość obiektu w strumieniu - a jego zadaniem jest zwrócenie wartości
                .limit(max) // metodę limit(long maxSize) interfejsu Stream, która ogranicza wielkość strumienia do maxSize obiektów (jest to operacja filtrująca)
                .filter(n -> n % 2 == 0) // powstaje nowy Stream, na którym w linii nr 9 wywołujemy metodę filter(Predicate predicate), gdzie predicate jest wyrażeniem lambda, które powinno zwracać true, gdy obiekt ma pozostać w strumieniu oraz wartość false, gdy obiekt powinien zostać "odrzucony" i nie przekazany do strumienia wyjściowego metody filter(Predicate predicate) - jak wskazuje nazwa metody, jest to operacja filtrująca
                .forEach(System.out::println);

    }
}
