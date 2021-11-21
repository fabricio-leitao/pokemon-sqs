package com.fabricio.pokemonsqsconsumer.messaging;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)
@Component
@Service
public @interface ConsumerSqs {
}
