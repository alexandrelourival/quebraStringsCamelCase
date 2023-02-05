import com.ita.stringcamelcase.StringCamelCase;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> palavrasCamelCase = List.of(
                "nome", "Nome", "nomeComposto", "NomeComposto", "CPF", "numeroCPF",
                "numeroCPFContribuinte", "recupera10Primeiros", "10Primeiros", "nome#Composto"
        );

        List<String> listPalavraCamelCase;

        for (int i = 0; i < palavrasCamelCase.size(); i++) {
            listPalavraCamelCase = StringCamelCase.converterCamelCase(palavrasCamelCase.get(i));
            System.out.println("Palavra: " + palavrasCamelCase.get(i) + "Resposta: " + listPalavraCamelCase);
        }
    }
}