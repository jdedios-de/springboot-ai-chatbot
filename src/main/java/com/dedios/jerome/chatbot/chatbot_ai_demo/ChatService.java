package com.dedios.jerome.chatbot.chatbot_ai_demo;

import java.util.Map;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
	
	@Autowired
    private ChatClient.Builder builder;
	
    @Autowired
    private PromptTemplate promptTemplate;


    public String getResponse(String userInput) {
    	
        ChatClient chatClient = builder.build();
        
        Prompt prompt = promptTemplate.create(Map.of("input", userInput));
        
		return chatClient.prompt(prompt).user(userInput).call().content();	
    }
}
