package br.com.iniflex.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface IFormataData {
    public static String retornaDataEmStringFormatoDdMmAaaa(LocalDate dataNascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataNascimento.format(formatter);
    }
}
