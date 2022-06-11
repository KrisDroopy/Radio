public class Radio {
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int station;
    private int amountStations = 10;
    private int minStation = 0;
    private int maxStation = 9;

    public Radio () {
    }

    public Radio (int amountStations) {
        this.amountStations = amountStations;
        maxStation = amountStations - 1;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void decreaseVolume() {
        if (currentVolume != minVolume) {
            currentVolume--;
        }
        else  {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume != maxVolume) {
            currentVolume++;
        }
        else  {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setStation(int station) {
        if (station < minStation) {
            return;
        }
        if (station > maxStation) {
            return;
        }
        this.station = station;
    }

    public void nextStation() {
        if (station != maxStation) {
            station++;
        }
        else  {
            station = minStation;
        }
        this.station = station;
    }

    public void prevStation() {
        if (station != minStation) {
            station--;
        }
        else  {
            station = maxStation;
        }
        this.station = station;
    }

    public int getStation() {
        return station;
    }

}