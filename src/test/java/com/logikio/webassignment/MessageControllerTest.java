package com.logikio.webassignment;

import com.logikio.webassignment.controller.MessageController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MessageController.class)
public class MessageControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testMessageWithHi () throws Exception
    {
        this.mockMvc.perform(get("/messenger").param("message",
                                                 "Hi")).andExpect(status().isOk())
                        .andExpect(content().string("Hello"));
    }

    @Test
    public void testMessageWithUnknownMessage () throws Exception
    {
        this.mockMvc.perform(get("/messenger").param("message",
                                                 "Hello")).andExpect(status().isOk())
                        .andExpect(content().string("Unknown message"));
    }

    @Test
    public void testWithoutMessage () throws Exception
    {
        this.mockMvc.perform(get("/messenger")).andExpect(status().isOk())
                        .andExpect(content().string("Unknown message"));
    }
}
