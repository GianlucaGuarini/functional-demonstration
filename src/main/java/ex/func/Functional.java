package ex.func;

import java.time.LocalDate;

import static ex.func.Transaction.Currency.USD;
import static ex.func.Transaction.State.VALID;

public class Functional {

  private static final double SUB_CHARGE = 0.03;
  private static final LocalDate TOP_OF_YEAR = LocalDate.of(2025, 1, 1);

  public static void main(String[] args) {
    var chargedTopOfYear = Transaction.samples().stream()
            .filter(transaction -> TOP_OF_YEAR.equals(transaction.date()))
            .filter(transaction -> USD.equals(transaction.currency()))
            .filter(transaction -> VALID.equals(transaction.state()))
            .mapToDouble(Transaction::amount)
            .map(amount -> amount * SUB_CHARGE)
            .sum();

    System.out.printf("Charged %s USD on %s", chargedTopOfYear, TOP_OF_YEAR);
  }
}
