package chegg;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TemperatureTest {

    @Test
    void toFahren() {
        assertEquals(88.00, Temperature.toFahren(56));
        assertEquals(85.00, Temperature.toFahren(52));
    }

    @Test
    @DisplayName("Fan to Cal")
    void toCelcius() {
        assertEquals(40.56, Temperature.toCelcius(105));
    }
}