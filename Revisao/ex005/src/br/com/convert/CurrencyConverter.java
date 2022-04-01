package br.com.convert;

import java.math.BigDecimal;

public class CurrencyConverter {

  private static final double IOF = 0.06;

  public static BigDecimal convert(BigDecimal cambio, BigDecimal dolar) {
     BigDecimal taxa = dolar.multiply(BigDecimal.valueOf(IOF));
     BigDecimal taxaIOF = taxa.multiply(cambio);
    return dolar.multiply(cambio).add(taxaIOF);
  }
}
