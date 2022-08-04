package br.com.estudo.vinculamedico.serialize;

import br.com.estudo.vinculamedico.model.Profissional;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class ProfissionalSerializer extends JsonSerializer {

    @Override
    public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        Profissional profissional = (Profissional) value;
        gen.writeStartObject();
        gen.writeNumberField("id", profissional.getId());
        gen.writeStringField("nome", profissional.getNome());
        gen.writeStringField("funcao", profissional.getFuncao());
        gen.writeEndObject();
    }
}
