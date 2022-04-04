package tech.wiktor.api.api.objects;

import lombok.Getter;
import lombok.Setter;
import org.jsoup.nodes.Element;

@Getter
@Setter
public class Teacher {
    private String name;
    private String subject;

    public Teacher(Element element){
        this.name = element.select("strong").text();
        this.subject = element.select("td:last-of-type").text();
    }
}