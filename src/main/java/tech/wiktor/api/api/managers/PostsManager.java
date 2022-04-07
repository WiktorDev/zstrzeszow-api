package tech.wiktor.api.api.managers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import tech.wiktor.api.api.objects.Post;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PostsManager {
    private static final List<Post> posts = new ArrayList<>();

    public static List<Post> getPosts() {
        return posts;
    }

    public void init(){
        if(!posts.isEmpty()) posts.clear();
        try {
            Document Doc = Jsoup.connect("http://zstrzeszow.pl/").get();
            Elements elements = Doc.select("div.newsy > div");
            elements.forEach(element -> {
                Post post = new  Post(element);
                posts.add(post);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}