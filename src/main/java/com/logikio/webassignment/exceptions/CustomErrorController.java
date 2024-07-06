package com.logikio.webassignment.exceptions;

import java.util.Map;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import static com.logikio.webassignment.constants.HtmlTemplates.EXCEPTION_HTML_TEMPLATE;
import static com.logikio.webassignment.constants.HtmlTemplates.NOT_FOUND_HTML_TEMPLATE;

@Controller
public class CustomErrorController implements ErrorController {
    private final ErrorAttributes errorAttributes;

    public CustomErrorController(ErrorAttributes errorAttributes) {
        this.errorAttributes = errorAttributes;
    }

    @RequestMapping("/error")
    public ResponseEntity<String> handleError(WebRequest webRequest) {
        Map<String, Object> errorAttributes = this.errorAttributes.getErrorAttributes(webRequest, ErrorAttributeOptions.defaults());
        int status = (int) errorAttributes.getOrDefault("status", 500);
        HttpStatus httpStatus = HttpStatus.valueOf(status);
        String message = getErrorMessage(status);

        return new ResponseEntity<>(message, httpStatus);
    }

    private String getErrorMessage(int status) {
        switch (status) {
        case 404:
            return NOT_FOUND_HTML_TEMPLATE;
        default:
            return EXCEPTION_HTML_TEMPLATE;
        }
    }

}

