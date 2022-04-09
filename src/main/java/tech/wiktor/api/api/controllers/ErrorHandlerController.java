package tech.wiktor.api.api.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wiktor.api.api.objects.Error;
import javax.servlet.http.HttpServletRequest;

@RestController
public class ErrorHandlerController implements ErrorController {
    @RequestMapping("/error")
    public Error handleError(HttpServletRequest httpRequest) {
        int httpErrorCode = (int) httpRequest.getAttribute("javax.servlet.error.status_code");
        String errorMsg;
        switch (httpErrorCode){
            case 404:
                errorMsg = "Page not found!";
                break;
            case 500:
                errorMsg = "Internal Server Error!";
                break;
            default:
                errorMsg = "Page error!";
        }
        return new Error(httpErrorCode, errorMsg, httpRequest.getMethod());
    }
}