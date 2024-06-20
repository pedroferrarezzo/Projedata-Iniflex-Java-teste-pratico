package br.com.iniflex.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public interface IFormataNumero {
    public static String retornaSalarioFormatadoPontoMilharVirgulaDecimal(BigDecimal number) {
        Locale locale = Locale.of("pt", "BR");
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
        symbols.setGroupingSeparator('.');
        symbols.setDecimalSeparator(',');

        DecimalFormat formatter = new DecimalFormat("#,##0.00", symbols);
        return formatter.format(number);
    }
}
