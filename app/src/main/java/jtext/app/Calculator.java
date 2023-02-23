package jtext.app;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Calculator {

  public int add(int i, int j) {
    return i + j;
  }

  public String Annuity(String R, int t, String r, int n) {
    BigDecimal a = new BigDecimal(r).divide(new BigDecimal(n));
    BigDecimal b = BigDecimal.ONE.add(a);
    BigDecimal c = b.pow(n * t);
    BigDecimal d = c.subtract(BigDecimal.ONE);
    BigDecimal e = d.divide(a);
    BigDecimal result = e.multiply(new BigDecimal(R));
    NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.US);
    return currencyInstance.format(result);
  }
}
