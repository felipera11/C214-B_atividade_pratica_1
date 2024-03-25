package inatel.c214;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class RequestHorarios {

    public void requestHorarios(String json) {
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        String nomeDoProfessor = jsonObject.get("nomeDoProfessor").getAsString();
        String horarioDeAtendimento = jsonObject.get("horarioDeAtendimento").getAsString();
        String periodo = jsonObject.get("periodo").getAsString();
        int sala = jsonObject.get("sala").getAsInt();
        int predio = jsonObject.get("predio").getAsInt();
        Horarios horario = new Horarios(nomeDoProfessor, horarioDeAtendimento, periodo, sala, predio);

        if (sala <= 0) {
            throw new IllegalArgumentException("Sala number must be greater than 0");
        }
    }

    public int calculatePredio(int sala) {
        if (sala <= 0) {
            throw new IllegalArgumentException("Sala number must be greater than 0");
        }
        return (sala - 1) / 5;
    }
}
