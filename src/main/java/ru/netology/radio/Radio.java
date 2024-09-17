package ru.netology.radio;

public class Radio {
    /// поля//
    private int currentRadio;
    private int currentVolume;

    /// конструкторы//
    public void nextRadio() {
        if (currentRadio != 9) {
            currentRadio++;
        } else {
            currentRadio = 0;
        }
    }

    public void prevRadio() {
        if (currentRadio != 0) {
            currentRadio--;
        } else {
            currentRadio = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume++;
//        } else {
//            currentVolume = 100;
        }
    }

    public void reduceVolume() {
        if (currentVolume != 0) {
            currentVolume--;
//        } else {
//            currentVolume = 0;
        }
    }

    /// методы///
    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentRadio(int currentRadio) {
        if (currentRadio < 0) {
            return;
        }
        if (currentRadio > 9) {
            return;
        }
        this.currentRadio = currentRadio;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

}