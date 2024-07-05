package com.logikio.webassignment.controller;

import com.logikio.webassignment.exceptions.CustomValidationException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static com.logikio.webassignment.constants.HtmlTemplates.BAD_REQUEST_HTML_TEMPLATE;
import static com.logikio.webassignment.constants.HtmlTemplates.SUCCESS_HTML_TEMPLATE;

@RestController
public class ArithmeticController {

    private static final Logger logger = LoggerFactory.getLogger(ArithmeticController.class);

    /*
    NOTE: Since + is considered as space encoder in URL interpreter in query parameter part. User has to send addition expression using %2B in place of +
    i.e, 1+1 => 1%2B1
    Example: http://localhost:8085/calculate?expression=1%2B1

    Also, we cannot use path parameter directly because / will be considered as URI separator so and division expression will create a problem.
     */
    @Operation(summary = "Evaluate a simple arithmetic expression")
    @ApiResponses(value = {
                    @ApiResponse(responseCode = "200", description = "Successful evaluation",
                                 content = {@Content(mediaType = "text/plain",
                                                     schema = @Schema(implementation = String.class))}),
                    @ApiResponse(responseCode = "400", description = "Invalid input or operation",
                                 content = @Content)
    })
    @GetMapping("/calculate")
    public String calculate(
                    @Parameter(description = "Arithmetic expression to be evaluated, e.g., 1+1, 2/2", required = true)
                    @RequestParam String expression) {
        try {
            expression = expression.replaceAll("%2B", "+");
            logger.info("expression: "+expression);
            double result = evaluateExpression(expression);
            logger.info("Result: "+result);
            return String.format(SUCCESS_HTML_TEMPLATE,
                                 result);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return String.format(BAD_REQUEST_HTML_TEMPLATE, e.getMessage() );
        }
    }

    private static double evaluateExpression (String expression)
    {
        expression = expression.replaceAll(" ", "");
        String[] tokens = expression.split("(?<=[-+*/])|(?=[-+*/])");

        if (tokens.length != 3) {
            logger.error("Invalid expression");
            throw new CustomValidationException("Invalid expression");
        }

        double num1 = Double.parseDouble(tokens[0]);
        char operator = tokens[1].charAt(0);
        double num2 = Double.parseDouble(tokens[2]);

        return applyOperation(num1, num2, operator);
    }

    private static double applyOperation (double a,
                                          double b,
                                          char operator) {
        switch (operator) {
        case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        case '/':
            if (b == 0) {
                logger.error("Cannot divide by zero");
                throw new CustomValidationException("Cannot divide by zero");
            }
            return a / b;
        default:
            logger.error("Invalid operator");
            throw new CustomValidationException("Invalid operator");
        }
    }
}
