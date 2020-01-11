package hello.controller;

import hello.domain.Chat;
import hello.domain.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.util.HtmlUtils;

public class ChatController {

    @MessageMapping("/chat")
    @SendTo("/topic/greetings")
    public Chat greeting(String name, String message, boolean read) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Chat(name, message, read);
    }
}
