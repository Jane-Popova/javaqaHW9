package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void testNextRadio() {
        Radio cond = new Radio();

        cond.setCurrentRadio(7);

        cond.nextRadio();
        int expected = 8;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevRadio() {
        Radio cond = new Radio();

        cond.setCurrentRadio(7);

        cond.prevRadio();
        int expected = 6;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextMaxRadio() {
        Radio cond = new Radio();

        cond.setCurrentRadio(9);

        cond.nextRadio();
        int expected = 0;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevMinRadio() {
        Radio cond = new Radio();

        cond.setCurrentRadio(0);

        cond.prevRadio();
        int expected = 9;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio0() {
        Radio cond = new Radio();

        cond.setCurrentRadio(0);

        int expected = 0;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio1() {
        Radio cond = new Radio();

        cond.setCurrentRadio(1);

        int expected = 1;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio4() {
        Radio cond = new Radio();

        cond.setCurrentRadio(4);

        int expected = 4;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio8() {
        Radio cond = new Radio();

        cond.setCurrentRadio(8);

        int expected = 8;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadio9() {
        Radio cond = new Radio();

        cond.setCurrentRadio(9);

        int expected = 9;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadioMore9() {
        Radio cond = new Radio();

        cond.setCurrentRadio(10);

        int expected = 0;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChoiceRadioLess0() {
        Radio cond = new Radio();

        cond.setCurrentRadio(-1);

        int expected = 0;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void testIncreasingVolumeBy1() {
        Radio cond = new Radio();

        cond.setCurrentVolume(10);

        cond.increaseVolume();
        int expected = 11;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReducingVolumeBy1() {
        Radio cond = new Radio();

        cond.setCurrentVolume(10);

        cond.reduceVolume();
        int expected = 9;
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
    public void testReducingMinVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(0);

        cond.reduceVolume();
        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}