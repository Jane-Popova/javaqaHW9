package ru.netology.radio;

public class Radio {
    private int currentRadio;

    public int getCurrentRadio() {
        return currentRadio;
    }


    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio < 0) {
            return;
        }
        if (newCurrentRadio > 9) {
            return;
        }
        currentRadio = newCurrentRadio;
    }


    public void nextRadio() {
        if (currentRadio < 9) {
            currentRadio = currentRadio + 1;
        }
        if (currentRadio >= 9) {
            currentRadio = 0;
        }
        setCurrentRadio(currentRadio);
    }

    public void prevRadio() {
        if (currentRadio > 0) {
            currentRadio = currentRadio - 1;
        }
        if (currentRadio <= 0) {
            currentRadio = 9;
        }
        setCurrentRadio(currentRadio);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
//            if (newCurrentVolume < 0) {
//                return;
//            }
//            if (newCurrentVolume > 100) {
//                return;
//            }
        currentVolume = newCurrentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 100) {
            currentVolume = 100;
        }
        setCurrentVolume(currentVolume);
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        setCurrentVolume(currentVolume);
    }
}




