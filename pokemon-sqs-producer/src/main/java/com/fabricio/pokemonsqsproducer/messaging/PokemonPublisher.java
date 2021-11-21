package com.fabricio.pokemonsqsproducer.messaging;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.fabricio.pokemonsqsproducer.domain.Pokemon;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PokemonPublisher {

    private final AmazonSQS amazonSQS;
    private final ObjectMapper objectMapper;

    @SneakyThrows
    public void publish(final Pokemon pokemon){
        String queueUrl = amazonSQS.getQueueUrl("data_queue").getQueueUrl();

        SendMessageRequest sendMessageRequest = new SendMessageRequest()
                .withQueueUrl(queueUrl)
                .withMessageBody(objectMapper.writeValueAsString(pokemon))
                .withDelaySeconds(5);

        amazonSQS.sendMessage(sendMessageRequest);
    }
}
