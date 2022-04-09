package tech.wiktor.api.api.objects;

import lombok.Getter;
import lombok.Setter;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import tech.wiktor.api.api.serialize.Serializer;
import tech.wiktor.api.api.utils.ClassToID;
import tech.wiktor.api.api.utils.ParseTeacher;

import java.time.DayOfWeek;
import java.util.*;

@Getter
@Setter
public class LessonPlan {
    private String classID;
    private String className;
    private String day;
    private List<HashMap<String, Object>> subjects = new ArrayList<>();

    public LessonPlan(Elements elements, String className, int dayID){
        if(!subjects.isEmpty()) subjects.clear();
        this.classID = ClassToID.parse(className);
        this.className = className;
        this.day = String.valueOf(DayOfWeek.of(dayID+1));

        for (int i = 1; i < elements.size(); i++){
            int test = dayID;
            HashMap<String, Object> test1 = new HashMap<>();
            Element element = elements.get(i).select(".l").get(test);
            test1.put("subject", element.select(".p").text());
            test1.put("teacher", ParseTeacher.parse(element.select("a").text()));
            test1.put("class", element.select(".s").text());
            if(element.select("a").text().length() > 2){
                List<String> teachers = new ArrayList<>();
                Serializer.deserialize(element.select("a").text()).forEach(name -> {
                    teachers.add(ParseTeacher.parse(name));
                });
                test1.put("teacher", teachers);
            }
            subjects.add(test1);
            test++;
        }
    }
}