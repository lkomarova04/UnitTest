public class UnitConverter {

    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    // 2. Конвертация килограммов в фунты
    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // 3. Конвертация градусов Цельсия в Фаренгейт
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // 4. Конвертация литров в галлоны
    public static double litersToGallons(double liters) {
        return liters * 0.26417;
    }

    // 5. Конвертация часов в минуты
    public static int hoursToMinutes(int hours) {
        return hours * 60;
    }
}