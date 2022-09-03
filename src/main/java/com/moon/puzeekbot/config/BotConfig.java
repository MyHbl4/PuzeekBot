package com.moon.puzeekbot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("application.properties")
@Data
@Configuration
public class BotConfig {

    @Value("${bot.name}")
    String botName;

    @Value("${bot.key}")
    String botToken;
}
