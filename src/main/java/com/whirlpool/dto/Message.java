package com.whirlpool.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Message {

    private Integer id;
    private String src;
    private String dest;
    private Body body;

    @Override
    public String toString() {
        return "Message{" +
                "src='" + src + '\'' +
                ", dest='" + dest + '\'' +
                ", body=" + body +
                '}';
    }
}
