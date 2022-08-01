package br.com.estudo.vinculamedico.controller;

import br.com.estudo.vinculamedico.model.Profissional;
import br.com.estudo.vinculamedico.repository.ProfissionalRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ProfissionalControllerTest {

    @Autowired
    ProfissionalRepository profissionalRepository;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void contextLoads() throws Exception {
        assertThat(profissionalRepository).isNotNull();
    }

    @Test
    public void ProfissionalControllerTest() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
    }

    @Test
    public void getAllProfissionais() throws Exception {
        this.mockMvc.perform(get("/profissional/"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void createProfissional() throws Exception {
        Profissional profissional = Profissional.builder()
                .nome("José")
                .build();

        String json = objectMapper.writeValueAsString(profissional);

        this.mockMvc.perform(post("/profissional/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andDo(print())
                .andExpect(status().isOk());

    }


}