package com.whirlpool.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Body {
    private String type;
    private int msg_id;
    private String node_id;
    private List<String> node_ids;

    private int in_reply_to;

    private String echo;

    @Override
    public String toString() {
        return "Body{" +
                "type='" + type + '\'' +
                ", msg_id=" + msg_id +
                ", node_id='" + node_id + '\'' +
                ", node_ids=" + node_ids +
                '}';
    }
}

