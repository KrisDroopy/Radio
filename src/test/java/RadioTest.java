import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "4, 4",
                    "-1, 0",
                    "11, 0"
            }
    )
    void shouldStation(int newStation, int expected) {
        Radio radio = new Radio();
        radio.setStation(newStation);

        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0, 1",
                    "9, 0"
            }
    )
    void shouldNextStation(int newStation, int expected) {
        Radio radio = new Radio();
        radio.setStation(newStation);

        radio.nextStation();

        int actual = radio.getStation();


        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "5, 4",
                    "0, 9"
            }
    )
    void shouldPrevStation(int newStation, int expected) {
        Radio radio = new Radio();
        radio.setStation(newStation);

        radio.prevStation();

        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0, 0",
                    "3, 2",
                    "-1, 0",
                    "11, 0"
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
                    "10, 10"
            }
    )
    void shouldIncreaseVolume(int newCurrentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(newCurrentVolume);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}
