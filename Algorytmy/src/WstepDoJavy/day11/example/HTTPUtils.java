package JulianIKornel.day11.example;

/**
 * Created by sp0rk on 11/07/17.
 */
public class HTTPUtils {
    private static final String Base_URL = "http.cat/";

    public static byte[] getData(String url) {
        byte[] data = new byte[100];

        String requestUrl = Base_URL + url;

        //Get data, do some stuff

        return data;
    }
}
