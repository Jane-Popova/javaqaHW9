package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void testIncreasingRadioBy1() {
        Radio cond = new Radio();

        cond.setCurrentRadio(7);

        cond.increaseRadio();
        int expected = 8;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReducingRadioBy1() {
        Radio cond = new Radio();

        cond.setCurrentRadio(7);

        cond.reduceRadio();
        int expected = 6;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreasingMaxRadio() {
        Radio cond = new Radio();

        cond.setCurrentRadio(9);

        cond.increaseRadio();
        int expected = 0;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReducingMinRadio() {
        Radio cond = new Radio();

        cond.setCurrentRadio(0);

        cond.reduceRadio();
        int expected = 9;
        int actual = cond.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

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