package com.ita.stringcamelcase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
}