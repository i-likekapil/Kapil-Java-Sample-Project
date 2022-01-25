package chegg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class TemperatureTest {

    @Test
    void toFahren() {
        Assertions.assertEquals(88.00, Temperature.toFahren(56));
        Assertions.assertEquals(85.00, Temperature.toFahren(52));
    }

    @Test
    @DisplayName("Fan to Cal")
    void toCelcius() {
        Assertions.assertEquals(40.56, Temperature.toCelcius(105));
    }
}