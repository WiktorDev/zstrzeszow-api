package tech.wiktor.api.api.managers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import tech.wiktor.api.api.objects.Profile;
import tech.wiktor.api.api.objects.Teacher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TeachersManager {
    private static final List<Teacher> teachers = new ArrayList<>();

    public static List<Teacher> getTeachers() {
        return teachers;
    }

    public void init(){
        try {
            Document Doc = Jsoup.connect("http://zstrzeszow.pl/kadra.php/").get();
            Elements elements = Doc.select("div > table tbody tr");
            elements.forEach(element -> {
                Teacher teacher = new Teacher(element);
                teachers.add(teacher);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
