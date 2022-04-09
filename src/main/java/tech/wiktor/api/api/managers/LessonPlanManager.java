package tech.wiktor.api.api.managers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import tech.wiktor.api.api.objects.LessonPlan;
import tech.wiktor.api.api.utils.ClassToID;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LessonPlanManager {
    private static final List<LessonPlan> plans = new ArrayList<>();

    public static List<LessonPlan> getList() {
        return plans;
    }

    public void init(String className){
        plans.clear();
        try {
            Document Doc = Jsoup.connect(String.format("http://www.zstrzeszow.pl/plan/plany/%s.html", ClassToID.parse(className))).get();
            Elements elements = Doc.select(".tabela > tbody:nth-child(1) > tr");
            for (int index = 0; index <= 4; index++){
                LessonPlan plan = new LessonPlan(elements, className, index);
                plans.add(plan);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}