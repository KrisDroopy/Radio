public class Radio {
    private int currentVolume;
    private int station;

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        }
        else  {
            currentVolume = 0;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume != 10) {
            currentVolume++;
        }
        else  {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setStation(int station) {
        if (station < 0) {
            return;
        }
        if (station > 9) {
            return;
        }
        this.station = station;
    }

    public void nextStation() {
        if (station != 9) {
            station++;
        }
        else  {
            station = 0;
        }
        this.station = station;
    }

    public void prevStation() {
        if (station != 0) {
            station--;
        }
        else  {
            station = 9;
        }
        this.station = station;
    }

    public int getStation() {
        return station;
    }

}