package tech.wiktor.api.api.managers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import tech.wiktor.api.api.objects.Post;
import tech.wiktor.api.api.objects.Profile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProfilesManager {
    private static final List<Profile> profiles = new ArrayList<>();

    public static List<Profile> getProfiles() {
        return profiles;
    }

    public void init(){
        if(!profiles.isEmpty()) profiles.clear();
        try {
            Document Doc = Jsoup.connect("http://zstrzeszow.pl/").get();
            Elements elements = Doc.select("div#three-column > div");
            elements.forEach(element -> {
                Profile profile = new Profile(element);
                profiles.add(profile);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}