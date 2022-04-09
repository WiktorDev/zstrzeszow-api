package tech.wiktor.api.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.wiktor.api.api.managers.LessonPlanManager;
import tech.wiktor.api.api.managers.PostsManager;
import tech.wiktor.api.api.managers.ProfilesManager;
import tech.wiktor.api.api.managers.TeachersManager;
import tech.wiktor.api.api.objects.LessonPlan;
import tech.wiktor.api.api.objects.Post;
import tech.wiktor.api.api.objects.Profile;
import tech.wiktor.api.api.objects.Teacher;
import tech.wiktor.api.api.utils.Scrap;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
public class IndexController {
    @GetMapping(path="/meme", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> sayHello() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("url", new Scrap().getImageURL());
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @GetMapping(path = "/posts", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Post>> posts(){
        new PostsManager().init();
        return new ResponseEntity<>(PostsManager.getPosts(), HttpStatus.OK);
    }

    @GetMapping(path = "/profiles", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Profile>> profiles(){
        new ProfilesManager().init();
        return new ResponseEntity<>(ProfilesManager.getProfiles(), HttpStatus.OK);
    }

    @GetMapping(path = "/teachers", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Teacher>> teachers(){
        new TeachersManager().init();
        return new ResponseEntity<>(TeachersManager.getTeachers(), HttpStatus.OK);
    }

    @GetMapping(path = "/plan/{class}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<LessonPlan>> plans(@PathVariable("class") String name){
        new LessonPlanManager().init(name);
        return new ResponseEntity<>(LessonPlanManager.getList(), HttpStatus.OK);
    }
}