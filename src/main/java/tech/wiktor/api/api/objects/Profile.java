package tech.wiktor.api.api.objects;

import lombok.Getter;
import lombok.Setter;
import org.jsoup.nodes.Element;

@Getter
@Setter
public class Profile {
    private String image;
    private String name;
    private String description;

    public Profile(Element element){
        this.image = "http://www.zstrzeszow.pl/"+element.select("div > .image a img").attr("src");
        this.name = element.select("div > h2").text();
        this.description = element.select("div > p").text();
    }
}