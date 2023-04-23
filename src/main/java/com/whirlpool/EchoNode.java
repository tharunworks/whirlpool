package com.whirlpool;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.whirlpool.dto.Body;
import com.whirlpool.dto.Message;

import java.io.IOException;
import java.io.OutputStreamWriter;

class EchoNode {
    private String id;

    public void step(Message message, OutputStreamWriter output) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Message replyMessage = mapper.readValue(mapper.writeValueAsString(message), Message.class);
        Body responseBody = replyMessage.getBody();
        responseBody.setIn_reply_to(responseBody.getMsg_id());
        String src = message.getSrc();
        String dest = message.getDest();
        replyMessage.setSrc(dest);
        replyMessage.setDest(src);
        this.id = message.getSrc();
        if (message.getBody().getType().equals("init")) {
//            mapper.writeValue(output, replyMessage);
            responseBody.setType("init_ok");
            output.write(mapper.writeValueAsString(replyMessage));
            output.write("\n");
        } else if (message.getBody().getType().equals("echo")) {
            responseBody.setIn_reply_to(responseBody.getMsg_id());
            responseBody.setType("echo_ok");
            output.write(mapper.writeValueAsString(replyMessage));
            output.write("\n");
        }
    }
}
