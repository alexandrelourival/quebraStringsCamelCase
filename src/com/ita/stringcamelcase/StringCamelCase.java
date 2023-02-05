package com.ita.stringcamelcase;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCamelCase {
    public static List<String> converterCamelCase(String original) {
        return new ArrayList<String>();
    }

    public static void iniciaComNumero(String s) {
        if (Character.isDigit(s.charAt(0)))
            throw new IniciaComNumeroException("Inválido → não deve começar com números");
    }

    public void temCaractereEspecial(String s) {
        Pattern p = Pattern.compile("[^a-zA-Z0-9]+", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);
        if (m.find())
            throw new TemCaractereEspecialException("Inválido → caracteres especiais não são permitidos, somente letras e números");
    }
}
