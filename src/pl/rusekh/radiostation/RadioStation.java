package pl.rusekh.radiostation;

import org.jsoup.Jsoup;

import java.io.IOException;
import java.net.URL;

public class RadioStation
{
    public static void main(String[] args) {
        try {
            for (int i = 1; i < 250; i++)
                System.out.println("https://stream.open.fm/" + i + " - "
                        + Jsoup.parse(new URL("https://open.fm/play/" + i), 10000).title());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
