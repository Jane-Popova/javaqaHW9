package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    ////// AmountStations////
    Radio station = new Radio(20);

    @Test
    public void testRadioAmountStations() {
        station.setCurrentRadio(15);
        int expected = 15;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    /// test next radio ///
    @Test
    public void testNextRadioAmountStations() {


        station.setCurrentRadio(11);

        station.nextRadio();
        int expected = 12;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextMaxRadioAmountStations() {
        station.setCurrentRadio(19);

        station.nextRadio();
        int expected = 0;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextPreMaxRadioAmountStations() {
        station.setCurrentRadio(18);

        station.nextRadio();
        int expected = 19;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    /// test prev radio ///
    @Test
    public void testPrevRadioAmountStations() {
        station.setCurrentRadio(14);

        station.prevRadio();
        int expected = 13;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevMinRadioAmountStations() {
        station.setCurrentRadio(0);

        station.prevRadio();
        int expected = 19;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testPrevMaxRadioAmountStations() {
        station.setCurrentRadio(19);

        station.prevRadio();
        int expected = 18;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }


/// test choice radio ///


    @Test
    public void testChoiceRadio6AmountStations() {
        station.setCurrentRadio(16);

        int expected = 16;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio8AmountStations() {
        station.setCurrentRadio(18);

        int expected = 18;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadioMaxAmountStations() {
        station.setCurrentRadio(19);

        int expected = 19;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadioMoreMaxAmountStations() {
        station.setCurrentRadio(20);

        int expected = 0;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testChoiceRadioInvalidPositiveNumberAmountStations() {
        station.setCurrentRadio(26);

        int expected = 0;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadioInvalidNegativeNumberAmountStations() {
        station.setCurrentRadio(-65);

        int expected = 0;
        int actual = station.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /// test next radio ///
    Radio radio = new Radio();

    @Test
    public void testNextRadio() {


        radio.setCurrentRadio(4);

        radio.nextRadio();
        int expected = 5;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextMaxRadio() {
        radio.setCurrentRadio(9);

        radio.nextRadio();
        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextPreMaxRadio() {
        radio.setCurrentRadio(8);

        radio.nextRadio();
        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextMinRadio() {
        radio.setCurrentRadio(0);

        radio.nextRadio();
        int expected = 1;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    /// test prev radio ///
    @Test
    public void testPrevRadio() {
        radio.setCurrentRadio(7);

        radio.prevRadio();
        int expected = 6;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevMinRadio() {
        radio.setCurrentRadio(0);

        radio.prevRadio();
        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevPreMinRadio() {
        radio.setCurrentRadio(1);

        radio.prevRadio();
        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevMaxRadio() {
        radio.setCurrentRadio(9);

        radio.prevRadio();
        int expected = 8;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }


/// test choice radio ///


    @Test
    public void testChoiceRadio0() {
        radio.setCurrentRadio(6);
        radio.setCurrentRadio(0);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio1() {
        radio.setCurrentRadio(1);

        int expected = 1;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio6() {
        radio.setCurrentRadio(6);

        int expected = 6;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio8() {
        radio.setCurrentRadio(8);

        int expected = 8;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio9() {
        radio.setCurrentRadio(9);

        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadioMore9() {
        radio.setCurrentRadio(10);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadioLess0() {
        radio.setCurrentRadio(-1);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadioInvalidPositiveNumber() {
        radio.setCurrentRadio(16);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadioInvalidNegativeNumber() {
        radio.setCurrentRadio(-6);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    //////////////////////////////////////////Volume////////////////////////////////////////////////////////////////////
    /// test increase volume ///
    Radio volume = new Radio();

    @Test
    public void testIncreasingVolume() {

        volume.setCurrentVolume(60);

        volume.increaseVolume();
        int expected = 61;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreasingMaxVolume() {

        volume.setCurrentVolume(100);

        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreasingPreMaxVolume() {

        volume.setCurrentVolume(99);

        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreasingMinVolume() {

        volume.setCurrentVolume(0);

        volume.increaseVolume();
        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    /// test reduce volume ///
    @Test
    public void testReducingVolume() {

        volume.setCurrentVolume(70);

        volume.reduceVolume();
        int expected = 69;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testReducingMinVolume() {

        volume.setCurrentVolume(0);

        volume.reduceVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReducingPreMinVolume() {

        volume.setCurrentVolume(1);

        volume.reduceVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReducingMaxVolume() {

        volume.setCurrentVolume(100);

        volume.reduceVolume();
        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReducingPreMaxVolume() {

        volume.setCurrentVolume(99);

        volume.reduceVolume();
        int expected = 98;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    /// test invalid values for volume///

    @Test
    public void testChoiceVolumeLess0() {

        volume.setCurrentVolume(-1);

        volume.reduceVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceVolumeMore100() {

        volume.setCurrentVolume(101);

        volume.reduceVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceVolumeInvalidPositiveNumber() {

        volume.setCurrentVolume(160);

        volume.reduceVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceVolumeInvalidNegativeNumber() {

        volume.setCurrentVolume(-60);

        volume.reduceVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}