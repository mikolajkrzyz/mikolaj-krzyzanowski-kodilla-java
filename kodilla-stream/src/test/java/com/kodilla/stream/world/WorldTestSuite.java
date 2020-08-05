package com.kodilla.stream.world;


import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //given

        //azja
        Country country1 = new Country("Rosja", new BigDecimal("142470272"));
        Country country2 = new Country("Chiny", new BigDecimal("1330044605"));
        Country country3 = new Country("Japonia", new BigDecimal("1147996000"));

        //europa
        Country country4 = new Country("Polska", new BigDecimal("142470272"));
        Country country5 = new Country("Szwecja", new BigDecimal("5569077"));
        Country country6 = new Country("Włochy", new BigDecimal("7209764"));

        //pld ameryka
        Country country7 = new Country("Brazylia", new BigDecimal("203429773"));
        Country country8 = new Country("Argentyna", new BigDecimal("113724226"));
        Country country9 = new Country("Chile", new BigDecimal("15007343"));

        List<Country> asiaList = new ArrayList<>();
        asiaList.add(country1);
        asiaList.add(country2);
        asiaList.add(country3);

        List<Country> europaList = new ArrayList<>();
        europaList.add(country4);
        europaList.add(country5);
        europaList.add(country6);

        List<Country> southAmericaList = new ArrayList<>();
        southAmericaList.add(country7);
        southAmericaList.add(country8);
        southAmericaList.add(country9);

        Continent asia = new Continent(asiaList);
        Continent europa = new Continent(europaList);
        Continent southAmerica = new Continent(southAmericaList);

        List<Continent> worldList = new ArrayList<>();
        worldList.add(asia);
        worldList.add(europa);
        worldList.add(southAmerica);

        World world = new World(worldList);

        //when

        BigDecimal peopleAllAroundTheWorld = world.getPeopleQuantity();

        //then
        Assert.assertEquals(new BigDecimal("3107921332"), peopleAllAroundTheWorld);

    }
}
