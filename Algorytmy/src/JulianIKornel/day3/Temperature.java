package JulianIKornel.day3;


public class Temperature {
    private float celcius;

    private Temperature(float celcius) {   // prywatny konstruktor
        this.celcius = celcius;
    }

    public static Temperature fromCelcius(float celcius) {
        return new Temperature(celcius);
    }

    public static Temperature fromKelvin(float kelvin) {
        float celcius = kelvinToCelcius(kelvin);
        return new Temperature(celcius);
    }

    public static Temperature fromFahreinheit(float fahrenheit) {
        float celcius = fahrenheitToCelcius(fahrenheit);
        return new Temperature(celcius);
    }

    private static float kelvinToCelcius(float kelvin) {
        return kelvin - 273;
    }

    private static float fahrenheitToCelcius(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public float toFahrenheit() {
        return celcius * 9 / 5 + 32;
    }

    public float toKelvin() {
        return celcius + 273;
    }

    public float toCelcius() {
        return celcius;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "celcius=" + String.format("%.1f", celcius) + ", " + "kelvin=" + String.format("%.1f", toKelvin()) + ", " + "fahrenheit=" + String.format("%.1f", toFahrenheit()) +
                '}';
    }
}
