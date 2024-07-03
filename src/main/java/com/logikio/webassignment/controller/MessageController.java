package com.logikio.webassignment.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController
{
    private static final Logger logger = LoggerFactory.getLogger(MessageController.class);
    private static final String HI_MESSAGE = "Hi";

    @Operation(summary = "Greet the user", description = "Returns 'Hello' when the message is 'Hi'")
    @ApiResponses(value = {
                    @ApiResponse(responseCode = "200", description = "Successfully greeted the user"),
                    @ApiResponse(responseCode = "400", description = "Invalid input")
    })
    @GetMapping("/messenger")
    public String greet(
                    @Parameter(description = "Message to be sent", required = true)
                    @RequestParam(name = "message", required = false, defaultValue = "") String message) {
        logger.info("Handling messenger service...");

        if (HI_MESSAGE.equalsIgnoreCase(message)) {
            logger.debug("User is smart to utilise this service...");
            return "Hello";
        } else {
            logger.error("Invalid input. Send Hi to get response Hello...");
            return "Unknown message";
        }
    }
}
