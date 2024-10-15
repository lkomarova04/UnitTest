import org.junit.Test;
import static org.junit.Assert.*;

public class UnitConverterTest {

    @Test
    public void testKilometersToMiles() {
        double kilometers = 10.0;
        double expectedMiles = 6.21371;
        double delta = 0.0001;
        assertEquals("Конвертация километров в мили неверна", expectedMiles, UnitConverter.kilometersToMiles(kilometers), delta);
    }

    @Test
    public void testKilogramsToPounds() {
        double kilograms = 5.0;
        double expectedPounds = 11.0231;
        double delta = 0.0001;
        assertEquals("Конвертация килограммов в фунты неверна", expectedPounds, UnitConverter.kilogramsToPounds(kilograms), delta);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        double celsius = 25.0;
        double expectedFahrenheit = 77.0;
        assertEquals("Конвертация градусов Цельсия в Фаренгейт неверна", expectedFahrenheit, UnitConverter.celsiusToFahrenheit(celsius), 0);
    }

    @Test
    public void testLitersToGallons() {
        double liters = 10.0;
        double expectedGallons = 2.6417;
        double delta = 0.0001;
        assertEquals("Конвертация литров в галлоны неверна", expectedGallons, UnitConverter.litersToGallons(liters), delta);
    }

    @Test
    public void testHoursToMinutes() {
        int hours = 3;
        int expectedMinutes = 180;
        assertEquals("Конвертация часов в минуты неверна", expectedMinutes, UnitConverter.hoursToMinutes(hours));
    }
}