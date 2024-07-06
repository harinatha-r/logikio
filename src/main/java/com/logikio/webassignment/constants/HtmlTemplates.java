package com.logikio.webassignment.constants;

public class HtmlTemplates
{
    public static final String NOT_FOUND_HTML_TEMPLATE = "<!DOCTYPE html>\n"
                    + "<html lang=\"en\">\n" + "<head>\n" + "<meta charset=\"UTF-8\">\n"
                    + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "<title>Resource Not Found</title>\n" + "<style>\n" + "  body {\n"
                    + "    font-family: 'Arial', sans-serif;\n" + "    display: flex;\n"
                    + "    justify-content: center;\n" + "    align-items: center;\n"
                    + "    height: 100vh;\n" + "    margin: 0;\n"
                    + "    background-color: #f7f7f7;\n" + "  }\n" + "  .container {\n"
                    + "    text-align: center;\n" + "    padding: 20px;\n"
                    + "    border: 2px solid #ff9800;\n" + "    background-color: #fff;\n"
                    + "    border-radius: 10px;\n"
                    + "    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n"
                    + "    animation: fadeIn 2s ease-in-out infinite alternate;\n" + "  }\n"
                    + "  @keyframes fadeIn {\n" + "    from {\n" + "      opacity: 0;\n" + "    }\n"
                    + "    to {\n" + "      opacity: 1;\n" + "    }\n" + "  }\n" + "  h1 {\n"
                    + "    color: #ff9800;\n" + "    font-size: 32px;\n"
                    + "    margin-bottom: 10px;\n" + "  }\n" + "  p {\n" + "    color: #555;\n"
                    + "    font-size: 18px;\n" + "    margin: 5px 0;\n" + "  }\n" + "</style>\n"
                    + "</head>\n" + "<body>\n" + "<div class=\"container\">\n"
                    + "  <h1>Resource Not Found</h1>\n"
                    + "  <p>The requested resource could not be found.</p>\n" + "</div>\n"
                    + "</body>\n" + "</html>";

    public static final String EXCEPTION_HTML_TEMPLATE = "<!DOCTYPE html>" +
                    "<html lang=\"en\">" +
                    "<head>" +
                    "<meta charset=\"UTF-8\">" +
                    "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">" +
                    "<title>Error</title>" +
                    "<style>" +
                    "body { font-family: 'Arial', sans-serif; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; background-color: #f7f7f7; }" +
                    ".container { text-align: center; padding: 20px; border: 2px solid #ff4d4d; background-color: #fff; border-radius: 10px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); }" +
                    "h1 { color: #ff4d4d; font-size: 32px; margin-bottom: 10px; }" +
                    "p { color: #555; font-size: 18px; margin: 5px 0; }" +
                    "</style>" +
                    "</head>" +
                    "<body>" +
                    "<div class=\"container\">" +
                    "<h1>Error</h1>" +
                    "<p>An error occurred while processing your request.</p>" +
                    "<p>Please refresh the page or contact support if the problem persists.</p>" +
                    "</div>" +
                    "</body>" +
                    "</html>";

    public static final String SUCCESS_HTML_TEMPLATE = "<!DOCTYPE html>\n" + "<html lang=\"en\">\n"
                    + "<head>\n" + "<meta charset=\"UTF-8\">\n"
                    + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "<title>Success Message</title>\n" + "<style>\n" + "  body {\n"
                    + "    display: flex;\n" + "    justify-content: center;\n"
                    + "    align-items: center;\n" + "    height: 100vh;\n"
                    + "    background-color: #f0f0f0;\n" + "  }\n" + "  \n"
                    + "  .success-message {\n" + "    font-family: Arial, sans-serif;\n"
                    + "    background-color: #4CAF50;\n" + "    color: white;\n"
                    + "    padding: 20px;\n" + "    border-radius: 5px;\n"
                    + "    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n"
                    + "    animation-name: slideIn;\n" + "    animation-duration: 0.5s;\n"
                    + "    animation-timing-function: ease;\n"
                    + "    animation-fill-mode: forwards;\n" + "  }\n" + "  \n"
                    + "  @keyframes slideIn {\n" + "    from {\n" + "      opacity: 0;\n"
                    + "      transform: translateY(-20px);\n" + "    }\n" + "    to {\n"
                    + "      opacity: 1;\n" + "      transform: translateY(0);\n" + "    }\n"
                    + "  }\n" + "</style>\n" + "</head>\n" + "<body>\n"
                    + "  <div class=\"success-message\">\n"
                    + "    <strong>Success!</strong> Your action is completed successfully and the result is: %s\n"
                    + "  </div>\n" + "</body>\n" + "</html>\n";

    public static final String BAD_REQUEST_HTML_TEMPLATE = "<!DOCTYPE html>\n"
                    + "<html lang=\"en\">\n" + "<head>\n" + "    <meta charset=\"UTF-8\">\n"
                    + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "    <title>Bad Request with Animation</title>\n" + "    <style>\n"
                    + "        body {\n" + "            font-family: Arial, sans-serif;\n"
                    + "            background-color: #f0f0f0;\n" + "            display: flex;\n"
                    + "            justify-content: center;\n"
                    + "            align-items: center;\n" + "            height: 100vh;\n"
                    + "            margin: 0;\n" + "        }\n" + "        .error-box {\n"
                    + "            background-color: #f44336;\n" + "            color: white;\n"
                    + "            padding: 20px;\n" + "            border-radius: 5px;\n"
                    + "            box-shadow: 0 0 10px rgba(0,0,0,0.1);\n"
                    + "            text-align: center;\n" + "            max-width: 400px;\n"
                    + "            animation: fadeInOut 2s ease-in-out infinite;\n" + "        }\n"
                    + "        @keyframes fadeInOut {\n" + "            from {\n"
                    + "                opacity: 0;\n" + "            }\n" + "            to {\n"
                    + "                opacity: 1;\n" + "            }\n" + "        }\n"
                    + "        h1 {\n" + "            font-size: 24px;\n"
                    + "            margin: 0;\n" + "            text-transform: uppercase;\n"
                    + "        }\n" + "        p {\n" + "            font-size: 18px;\n"
                    + "            margin: 10px 0 0;\n" + "        }\n" + "    </style>\n"
                    + "</head>\n" + "<body>\n" + "    <div class=\"error-box\">\n"
                    + "        <h1>Bad Request</h1>\n"
                    + "        <p>%s.</p>\n"
                    + "    </div>\n" + "</body>\n" + "</html>\n";

    public static final String PORT_REDIRECT_HTML_TEMPLATE = "<!DOCTYPE html>\n"
                    + "<html lang=\"en\">\n" + "<head>\n" + "<meta charset=\"UTF-8\">\n"
                    + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "<title>Port Notification</title>\n" + "<style>\n" + "  body {\n"
                    + "    font-family: Arial, sans-serif;\n"
                    + "    background: linear-gradient(to right, #4ca1af, #c4e0e5); /* Background animation */\n"
                    + "    animation: gradientAnim 10s ease infinite alternate;\n"
                    + "    display: flex;\n" + "    justify-content: center;\n"
                    + "    align-items: center;\n" + "    height: 100vh;\n" + "    margin: 0;\n"
                    + "  }\n" + "\n" + "  @keyframes gradientAnim {\n" + "    0% {\n"
                    + "      background-position: 0% 50%;\n" + "    }\n" + "    100% {\n"
                    + "      background-position: 100% 50%;\n" + "    }\n" + "  }\n" + "\n"
                    + "  .message {\n" + "    background-color: #fff;\n" + "    padding: 20px;\n"
                    + "    border-radius: 10px;\n"
                    + "    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n"
                    + "    text-align: center;\n" + "    animation: fadeIn 1s ease;\n" + "  }\n"
                    + "\n" + "  @keyframes fadeIn {\n" + "    0% {\n" + "      opacity: 0;\n"
                    + "    }\n" + "    100% {\n" + "      opacity: 1;\n" + "    }\n" + "  }\n"
                    + "</style>\n" + "</head>\n" + "<body>\n" + "  <div class=\"message\">\n"
                    + "    <h2>Port 8080 is not used for this service.</h2>\n"
                    + "    <p>Please use port 8085.</p>\n" + "  </div>\n" + "</body>\n"
                    + "</html>\n";
}
