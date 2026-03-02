package br.com.domain.util;

public final class NumberToWordsConverter {

    private NumberToWordsConverter() {}

    private static final String[] UNITS_AND_TEENS = {
            "", "um", "dois", "três", "quatro", "cinco",
            "seis", "sete", "oito", "nove", "dez",
            "onze", "doze", "treze", "quatorze", "quinze",
            "dezesseis", "dezessete", "dezoito", "dezenove"
    };

    private static final String[] TENS = {
            "", "", "vinte", "trinta", "quarenta",
            "cinquenta", "sessenta", "setenta",
            "oitenta", "noventa"
    };

    private static final String[] HUNDREDS = {
            "", "cento", "duzentos", "trezentos",
            "quatrocentos", "quinhentos",
            "seiscentos", "setecentos",
            "oitocentos", "novecentos"
    };

    public static String convert(int number) {
        if (number == 0) return "zero";
        if (number == 100) return "cem";
        if (number == 1000) return "mil";
        return convertLessThanOneThousand(number);
    }

    private static String convertLessThanOneThousand(int number) {
        if (number < 20)
            return UNITS_AND_TEENS[number];

        if (number < 100) {
            int tensPart = number / 10;
            int remainder = number % 10;
            return TENS[tensPart] + (remainder != 0 ? " e " + UNITS_AND_TEENS[remainder] : "");
        }

        int hundredsPart = number / 100;
        int remainder = number % 100;
        return HUNDREDS[hundredsPart] + (remainder != 0 ? " e " + convertLessThanOneThousand(remainder) : "");
    }

    public static void main(String[] args) {
        System.out.println(convert(101)); //se mandar maior que mil vai falhar
    }
}