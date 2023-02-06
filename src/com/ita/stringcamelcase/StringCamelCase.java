package com.ita.stringcamelcase;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCamelCase {

    public void iniciaComNumero(String s) {
        if (Character.isDigit(s.charAt(0)))
            throw new IniciaComNumeroException("Inválido → não deve começar com números");
    }

    public void temCaractereEspecial(String s) {
        Pattern p = Pattern.compile("[^a-zA-Z0-9]+", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);
        if (m.find())
            throw new TemCaractereEspecialException("Inválido → caracteres especiais não são permitidos, somente letras e números");
    }

    public List<String> separarCamelCase(String original) {
        return List.of(original.split("(?<=\\D)(?=\\d)|(?<=[a-z])(?=[A-Z])|(?=[A-Z])(?=[A-Z][a-z])"));
    }

    public String firstCharToLowerCase(String s) {
        if(!Character.isUpperCase(s.charAt(1)))
            return s.toLowerCase();
        else
            return s;
    }

    public List<String> converterCamelCase(String original) {
        iniciaComNumero(original);
        temCaractereEspecial(original);

        List<String> listaStringSeparada = separarCamelCase(original);
        List<String> listaStringSeparadaLowerCase = new ArrayList<>();
        for (String stringSeparada: listaStringSeparada) {
            listaStringSeparadaLowerCase.add(firstCharToLowerCase(stringSeparada));
        }

        return listaStringSeparadaLowerCase;
    }

}
