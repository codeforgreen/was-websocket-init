package ro.vborcea.was.ws;

import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class DisconnectController {

    @MessageMapping("/disconnect")
    @SendTo("/topic/disconnect")
    public Content disconnect(@Header("simpSessionId") String sessionId) {
        return new Content("Disconnected:" + Application.WS_MAPPING.get(sessionId));
    }
}
