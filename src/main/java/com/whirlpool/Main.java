package com.whirlpool;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.whirlpool.dto.Message;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String[] args) throws IOException {
        EchoNode node = new EchoNode();
        ObjectMapper mapper = new ObjectMapper();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        OutputStreamWriter output = new OutputStreamWriter(System.out);

        while (true) {
            String line = input.readLine();
            if (line == null) {
                break;
            }
            Message message = mapper.readValue(line, Message.class);
            node.step(message, output);
            output.flush();
        }
    }
}
