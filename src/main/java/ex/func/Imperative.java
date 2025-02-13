package ex.func;

import java.time.LocalDate;

import static ex.func.Transaction.Currency.USD;
import static ex.func.Transaction.State.VALID;

public class Imperative {

  private static final double SUB_CHARGE = 0.03;
  private static final LocalDate TOP_OF_YEAR = LocalDate.of(2025, 1, 1);

  public static void main(String[] args) {
    var samples = Transaction.samples();
    var chargedTopOfYear = 0d;
    // using enhanced for loop instead of 'fori'
    for (Transaction transaction : samples) {

      // possible to merge into one long clause with && operators
      if (TOP_OF_YEAR.equals(transaction.date())) {
        if (USD.equals(transaction.currency())) {
          if (VALID.equals(transaction.state())) {
            chargedTopOfYear += transaction.amount() * SUB_CHARGE;
          }
        }
      }
    }

    System.out.printf("Charged %s USD on %s", chargedTopOfYear, TOP_OF_YEAR);
  }
}
