package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ApplicationTests {
    @Autowired
    private MockMvc mvc;

    @Test
    void contextLoads() {
        Assertions.assertNotNull(mvc);
    }

    @Test
    void serverUp() throws Exception {
//        ConsoleIOContext.AllSuggestionsCompletionTask mvc;
        mvc.perform(MockMvcRequestBuilders
                        .get("/").
                        accept(MediaType.APPLICATION_JSON))
                .andExpect(status()
                        .isOk())
                .andExpect(content()
                        .string(equalTo("{\"status\":\"server up 0.1!\"}")));
    }
}
