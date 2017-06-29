package ro.vborcea.was.ws;

import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/topic/message")
    public Content message(final PublicMessage message, final @Header("simpSessionId") String sessionId) {
        return new Content(Application.WS_MAPPING.get(sessionId) + ": " + message.getMessage());
    }
}
