package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    /// test next radio ///
    @Test
    public void testNextRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(4);

        radio.nextRadio();
        int expected = 5;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextMaxRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(9);

        radio.nextRadio();
        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextPreMaxRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(8);

        radio.nextRadio();
        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextMinRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(0);

        radio.nextRadio();
        int expected = 1;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    /// test prev radio ///
    @Test
    public void testPrevRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(7);

        radio.prevRadio();
        int expected = 6;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevMinRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(0);

        radio.prevRadio();
        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevPreMinRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(1);

        radio.prevRadio();
        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevMaxRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(9);

        radio.prevRadio();
        int expected = 8;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }


/// test choice radio ///


    @Test
    public void testChoiceRadio0() {
        Radio radio = new Radio();
        radio.setCurrentRadio(6);
        radio.setCurrentRadio(0);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio1() {
        Radio radio = new Radio();

        radio.setCurrentRadio(1);

        int expected = 1;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio6() {
        Radio radio = new Radio();

        radio.setCurrentRadio(6);

        int expected = 6;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio8() {
        Radio radio = new Radio();

        radio.setCurrentRadio(8);

        int expected = 8;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio9() {
        Radio radio = new Radio();

        radio.setCurrentRadio(9);

        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadioMore9() {
        Radio radio = new Radio();

        radio.setCurrentRadio(10);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadioLess0() {
        Radio radio = new Radio();

        radio.setCurrentRadio(-1);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadioInvalidPositiveNumber() {
        Radio radio = new Radio();

        radio.setCurrentRadio(16);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadioInvalidNegativeNumber() {
        Radio radio = new Radio();

        radio.setCurrentRadio(-6);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    //////////////////////////////////////////Volume////////////////////////////////////////////////////////////////////
    /// test increase volume ///
    @Test
    public void testIncreasingVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(60);

        cond.increaseVolume();
        int expected = 61;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreasingMaxVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(100);

        cond.increaseVolume();
        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreasingPreMaxVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(99);

        cond.increaseVolume();
        int expected = 100;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreasingMinVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(0);

        cond.increaseVolume();
        int expected = 1;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    /// test reduce volume ///
    @Test
    public void testReducingVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(70);

        cond.reduceVolume();
        int expected = 69;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testReducingMinVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(0);

        cond.reduceVolume();
        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReducingPreMinVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(1);

        cond.reduceVolume();
        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReducingMaxVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(100);

        cond.reduceVolume();
        int expected = 99;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReducingPreMaxVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(99);

        cond.reduceVolume();
        int expected = 98;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    /// test invalid values for volume///

    @Test
    public void testChoiceVolumeLess0() {
        Radio cond = new Radio();

        cond.setCurrentVolume(-1);

        cond.reduceVolume();
        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceVolumeMore100() {
        Radio cond = new Radio();

        cond.setCurrentVolume(101);

        cond.reduceVolume();
        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceVolumeInvalidPositiveNumber() {
        Radio cond = new Radio();

        cond.setCurrentVolume(160);

        cond.reduceVolume();
        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceVolumeInvalidNegativeNumber() {
        Radio cond = new Radio();

        cond.setCurrentVolume(-60);

        cond.reduceVolume();
        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}

