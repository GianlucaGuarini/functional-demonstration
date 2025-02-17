package ex.func;

import java.time.LocalDate;
import java.util.List;

public record FancyTransaction(LocalDate date, Integer amount, Currency currency, State state) {

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

  public static List<FancyTransaction> samples() {
    return List.of(
        new FancyTransaction(LocalDate.of(2025, 1, 1), null, Currency.USD, State.VALID),
        new FancyTransaction(LocalDate.of(2025, 1, 2), null, Currency.USD, State.VALID),
        new FancyTransaction(LocalDate.of(2025, 1, 3), 100, Currency.USD, State.INVALID),
        new FancyTransaction(LocalDate.of(2025, 1, 1), 90, Currency.EUR, State.VALID),
        new FancyTransaction(LocalDate.of(2025, 1, 1), 90, Currency.USD, State.VALID));
  }
}
