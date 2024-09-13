package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    Radio cond = new Radio();

    @Test
    public void testNextRadio() {
        cond.setCurrentRadio(7);
        cond.nextRadio();
        int expected = 8;
        int actual = cond.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevRadio() {
        cond.setCurrentRadio(8);
        cond.prevRadio();
        int expected = 7;
        int actual = cond.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextMaxRadio() {
        cond.setCurrentRadio(9);
        cond.nextRadio();
        int expected = 0;
        int actual = cond.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevMinRadio() {
        cond.setCurrentRadio(0);
        cond.prevRadio();
        int expected = 9;
        int actual = cond.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio0() {
        cond.setCurrentRadio(0);
        int expected = 0;
        int actual = cond.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio1() {
        cond.setCurrentRadio(1);
        int expected = 1;
        int actual = cond.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio4() {
        cond.setCurrentRadio(4);
        int expected = 4;
        int actual = cond.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio8() {
        cond.setCurrentRadio(8);
        int expected = 8;
        int actual = cond.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio9() {
        cond.setCurrentRadio(9);
        int expected = 9;
        int actual = cond.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadioMore9() {
        cond.setCurrentRadio(10);
        int expected = 0;
        int actual = cond.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadioLess0() {
        cond.setCurrentRadio(-1);
        int expected = 0;
        int actual = cond.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    ////-----------------------------choice amountRadioStations ----------------------------------------------------////
    Radio cond20 = new Radio(20);

    @Test
    public void testNextRadioChoiceAmountRadioStations() {
        cond20.setCurrentRadio(12);
        cond20.nextRadio();
        int expected = 13;
        int actual = cond20.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevRadioChoiceAmountRadioStations() {
        cond20.setCurrentRadio(8);
        cond20.prevRadio();
        int expected = 7;
        int actual = cond20.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextMaxRadioChoiceAmountRadioStations() {
        cond20.setCurrentRadio(19);
        cond20.nextRadio();
        int expected = 0;
        int actual = cond20.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevMinRadioChoiceAmountRadioStations() {
        cond20.setCurrentRadio(0);
        cond20.prevRadio();
        int expected = 19;
        int actual = cond20.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio0ChoiceAmountRadioStations() {
        cond20.setCurrentRadio(0);
        int expected = 0;
        int actual = cond20.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio1ChoiceAmountRadioStations() {
        cond20.setCurrentRadio(1);
        int expected = 1;
        int actual = cond20.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio12ChoiceAmountRadioStations() {
        cond20.setCurrentRadio(12);
        int expected = 12;
        int actual = cond20.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio18ChoiceAmountRadioStations() {
        cond20.setCurrentRadio(18);
        int expected = 18;
        int actual = cond20.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio19ChoiceAmountRadioStations() {
        cond20.setCurrentRadio(19);
        int expected = 19;
        int actual = cond20.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadioMoreMaxChoiceAmountRadioStations() {
        cond20.setCurrentRadio(20);
        int expected = 0;
        int actual = cond20.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadioLessMinChoiceAmountRadioStations() {
        cond20.setCurrentRadio(-1);
        int expected = 0;
        int actual = cond20.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    /////////////////////////////////////////////Volume//////////////////////////////////////////////////////////////////////
    Radio condVolume = new Radio();

    @Test
    public void testIncreasingVolumeBy1() {
        condVolume.setCurrentVolume(10);
        condVolume.increaseVolume();
        int expected = 11;
        int actual = condVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReducingVolumeBy1() {
        condVolume.setCurrentVolume(10);
        condVolume.reduceVolume();
        int expected = 9;
        int actual = condVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreasingMaxVolume() {
        condVolume.setCurrentVolume(100);
        condVolume.increaseVolume();
        int expected = 100;
        int actual = condVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReducingMinVolume() {
        condVolume.setCurrentVolume(0);
        condVolume.reduceVolume();
        int expected = 0;
        int actual = condVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}