package tech.wiktor.api.api.serialize;

import java.util.HashSet;
import java.util.Set;

public class Serializer {
    public static Set<String> deserialize(String string) {
        Set<String> set = new HashSet();
        String[] split = string.split(" ");

        for(int index = 0; index < split.length; ++index) {
            if(split[index] != null){
                String element = split[index];
                set.add(element);
            }
        }
        return set;
    }
}
