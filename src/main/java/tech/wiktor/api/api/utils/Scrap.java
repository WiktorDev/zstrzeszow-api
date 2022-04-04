package tech.wiktor.api.api.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;

public class Scrap {
    private String imageURL;

    public Scrap(){
        try {
            Document Doc = Jsoup.connect("https://generator.memy.pl/").get();
            this.imageURL = Doc.select("body .container .row .col-sm-12 .meme-item .ngFotoBoxBox center #ngFotoBgIn").attr("style").replace("background: transparent url('", "").replace("') no-repeat top center; width:700px;", "");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getImageURL(){
        return imageURL;
    }
}