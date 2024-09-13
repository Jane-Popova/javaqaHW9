package ru.netology.radio;

public class Radio {
    private int currentRadio;
    public int amountRadioStations;
    public int minRadioStation = 0;
    public int maxRadioStation;


    public int getCurrentRadio() {
        return currentRadio;
    }

    public Radio() {
        amountRadioStations = 10;
        maxRadioStation = amountRadioStations - 1;
    }

    public Radio(int size) {
        maxRadioStation = minRadioStation + size - 1;
    }


    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio > maxRadioStation) {
            return;
        }
        if (newCurrentRadio < minRadioStation) {
            return;
        }
        currentRadio = newCurrentRadio;
    }


    public void nextRadio() {
        if (currentRadio < maxRadioStation) {
            currentRadio = currentRadio + 1;
        }
        if (currentRadio >= maxRadioStation) {
            currentRadio = minRadioStation;
        }
        setCurrentRadio(currentRadio);
    }

    public void prevRadio() {
        if (currentRadio > minRadioStation) {
            currentRadio = currentRadio - 1;
        }
        if (currentRadio <= minRadioStation) {
            currentRadio = maxRadioStation;
        }
        setCurrentRadio(currentRadio);
    }

    ///////////////////////////////////////Volume////////////////////////////////////////////////////////////////////////////////
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




