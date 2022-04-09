package tech.wiktor.api.api.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Error {
    private int code;
    private String message;
    private String method;
}