package ex.func;

import java.time.LocalDate;
import java.util.List;

public record Transaction(LocalDate date, double amount, Currency currency, State state) {

  /**
   * Implicating state of transaction.
   */
  public enum State {
    VALID,
    INVALID
  }

  /**
   * Currency of transaction.
   */
  public enum Currency {
    USD,
    EUR
  }

  public static List<Transaction> samples() {
    return List.of(
        new Transaction(LocalDate.of(2025, 1, 1), 100, Currency.USD, State.VALID),
        new Transaction(LocalDate.of(2025, 1, 2), 50, Currency.USD, State.VALID),
        new Transaction(LocalDate.of(2025, 1, 3), 100, Currency.USD, State.INVALID),
        new Transaction(LocalDate.of(2025, 1, 1), 90, Currency.EUR, State.VALID),
        new Transaction(LocalDate.of(2025, 1, 1), 90, Currency.USD, State.VALID));
  }
}
