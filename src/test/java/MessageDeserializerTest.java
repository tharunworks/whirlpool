import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.whirlpool.dto.Message;
import org.junit.jupiter.api.Test;

class MessageDeserializerTest {
    @Test
    public void whenDeserializingUsingJsonAnySetter_thenCorrect() throws JsonProcessingException {

        String json = "{\"src\":\"c1\",\"dest\":\"n0\",\"body\":{\"type\":\"init\",\"msg_id\":1,\"node_id\":\"n0\",\"node_ids\":[\"n0\"]}}";
        ObjectMapper mapper = new ObjectMapper();
        mapper .configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, false);
        Message message = mapper.readValue(json, Message.class);
        System.out.println(message);
    }
}