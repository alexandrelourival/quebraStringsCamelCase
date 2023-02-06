import com.ita.stringcamelcase.StringCamelCase;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> palavrasCamelCase = List.of("nome", "Nome", "nomeComposto", "NomeComposto", "CPF", "numeroCPF", "numeroCPFContribuinte", "recupera10Primeiros", "nome#Composto", "10Primeiros");

        StringCamelCase stringCamelCase = new StringCamelCase();

        for (String palavraCamelCase: palavrasCamelCase) {
            try {
                System.out.println("Palavra: " + palavraCamelCase + " | Resposta: " + stringCamelCase.converterCamelCase(palavraCamelCase));
            } catch (Exception e) {
                System.out.println("Palavra: " + palavraCamelCase + " | Error Message: " + e.getMessage());
            }
        }
    }
}