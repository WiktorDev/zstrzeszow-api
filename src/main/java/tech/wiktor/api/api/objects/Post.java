package tech.wiktor.api.api.objects;

import lombok.Getter;
import lombok.Setter;
import org.jsoup.nodes.Element;

@Getter
@Setter
public class Post {
    private String title;
    private String description;
    private String content;
    private String image;
    private String date;

    public Post(Element element){
        this.title = element.select("div > h2").text();
        this.description = element.select("div > .description").text();
        this.content = element.select("div > p:not(.description)").text();
        this.image = element.select("div > p > :not(.description)").attr("src");
        this.date = element.select("div > time").attr("datetime");
    }
}