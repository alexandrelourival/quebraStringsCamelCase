package com.ita.stringcamelcase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class StringCamelCaseTest {

    @Test
    public void iniciaComNumero() {
        StringCamelCase stringCamelCase = new StringCamelCase();
        String s = "10Primeiros";
        Assertions.assertThrows(IniciaComNumeroException.class, () -> stringCamelCase.iniciaComNumero(s));
    }

    @Test
    public void temCaractereEspecial() {
        StringCamelCase stringCamelCase = new StringCamelCase();
        String s = "nome#Composto";
        Assertions.assertThrows(TemCaractereEspecialException.class, () -> stringCamelCase.temCaractereEspecial(s));
    }

    @Test
    public void separarCamelCase() {
        StringCamelCase stringCamelCase = new StringCamelCase();

        String teste1 = "nomeComposto";
        List<String> listaTeste1 = List.of("nome", "Composto");

        String teste2 = "recupera10Primeiros";
        List<String> listaTeste2 = List.of("recupera", "10", "Primeiros");

        String teste3 = "numeroCPFContribuinte";
        List<String> listaTeste3 = List.of("numero", "CPF", "Contribuinte");

        Assertions.assertEquals(listaTeste1, stringCamelCase.separarCamelCase(teste1));
        Assertions.assertEquals(listaTeste2, stringCamelCase.separarCamelCase(teste2));
        Assertions.assertEquals(listaTeste3, stringCamelCase.separarCamelCase(teste3));

    }

    @Test
    public void stringToLowerCase() {
        StringCamelCase stringCamelCase = new StringCamelCase();

        String teste1 = "nome";
        String teste2 = "Nome";
        String teste3 = "CPF";
        String teste4 = "10";

        Assertions.assertEquals("nome", stringCamelCase.firstCharToLowerCase(teste1));
        Assertions.assertEquals("nome", stringCamelCase.firstCharToLowerCase(teste2));
        Assertions.assertEquals("CPF", stringCamelCase.firstCharToLowerCase(teste3));
        Assertions.assertEquals("10", stringCamelCase.firstCharToLowerCase(teste4));
    }

    @Test
    public void converterCamelCase() {
        StringCamelCase stringCamelCase = new StringCamelCase();

        String teste1 = "nomeComposto";
        List<String> listaTeste1 = List.of("nome", "composto");

        String teste2 = "recupera10Primeiros";
        List<String> listaTeste2 = List.of("recupera", "10", "primeiros");

        String teste3 = "numeroCPFContribuinte";
        List<String> listaTeste3 = List.of("numero", "CPF", "contribuinte");

        String teste4 = "10Primeiros";
        String teste5 = "nome#Composto";

        Assertions.assertEquals(listaTeste1, stringCamelCase.converterCamelCase(teste1));
        Assertions.assertEquals(listaTeste2, stringCamelCase.converterCamelCase(teste2));
        Assertions.assertEquals(listaTeste3, stringCamelCase.converterCamelCase(teste3));
        Assertions.assertThrows(IniciaComNumeroException.class, () -> stringCamelCase.converterCamelCase(teste4));
        Assertions.assertThrows(TemCaractereEspecialException.class, () -> stringCamelCase.converterCamelCase(teste5));
    }
}