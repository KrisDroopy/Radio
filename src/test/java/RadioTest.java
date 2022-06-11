import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "4, 4, 23, 23",
                    "-1, 0, -10, 0",
                    "11, 0, 31, 0"
            }
    )
    void shouldStation(int newStation, int expected, int newStation1, int expected1) {
        Radio radio = new Radio();
        Radio radio1 = new Radio(30);

        radio.setStation(newStation);
        radio1.setStation(newStation1);

        assertEquals(expected, radio.getStation());
        assertEquals(expected1, radio1.getStation());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0, 1, 13, 14",
                    "9, 0, 29, 0"
            }
    )
    void shouldNextStation(int newStation, int expected, int newStation1, int expected1) {
        Radio radio = new Radio();
        Radio radio1 = new Radio(30);

        radio.setStation(newStation);
        radio1.setStation(newStation1);

        radio.nextStation();
        radio1.nextStation();

        assertEquals(expected, radio.getStation());
        assertEquals(expected1, radio1.getStation());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "5, 4, 20, 19",
                    "0, 9, 0, 29"
            }
    )
    void shouldPrevStation(int newStation, int expected, int newStation1, int expected1) {
        Radio radio = new Radio();
        Radio radio1 = new Radio(30);

        radio.setStation(newStation);
        radio1.setStation(newStation1);

        radio.prevStation();
        radio1.prevStation();

        assertEquals(expected, radio.getStation());
        assertEquals(expected1, radio1.getStation());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0, 0",
                    "3, 2",
                    "-1, 0",
                    "101, 0"
            }
    )
    void shouldDecreaseVolume(int newCurrentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(newCurrentVolume);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0, 1",
                    "50, 51",
                    "100, 100"
            }
    )
    void shouldIncreaseVolume(int newCurrentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(newCurrentVolume);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void jobLombok() {
        Radio radioLombok = new Radio(2, 1, 20, 3, 5, 1, 5);


        assertEquals(5, radioLombok.getAmountStations());
        assertEquals(1, radioLombok.getMinStation());
        assertEquals(5, radioLombok.getMaxStation());
        assertEquals(1, radioLombok.getMinVolume());
        assertEquals(20, radioLombok.getMaxVolume());
        assertEquals(3, radioLombok.getStation());
        assertEquals(2, radioLombok.getCurrentVolume());
    }

    @Test
    void shouldSetAndGet() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.setMinVolume(1);
        radio.setMaxVolume(15);
        radio.setStation(7);
        radio.setMinStation(1);
        radio.setMaxStation(10);
        radio.setAmountStations(10);

        assertEquals(10, radio.getAmountStations());
        assertEquals(1, radio.getMinStation());
        assertEquals(10, radio.getMaxStation());
        assertEquals(1, radio.getMinVolume());
        assertEquals(15, radio.getMaxVolume());
        assertEquals(7, radio.getStation());
        assertEquals(5, radio.getCurrentVolume());
    }

}
