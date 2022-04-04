package tech.wiktor.api.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wiktor.api.api.managers.PostsManager;
import tech.wiktor.api.api.managers.ProfilesManager;
import tech.wiktor.api.api.managers.TeachersManager;
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
    public List<Post> posts(){
        new PostsManager().init();
        return PostsManager.getPosts();
    }

    @GetMapping(path = "/profiles", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Profile> profiles(){
        new ProfilesManager().init();
        return ProfilesManager.getProfiles();
    }

    @GetMapping(path = "/teachers", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Teacher> teachers(){
        new TeachersManager().init();
        return TeachersManager.getTeachers();
    }
}