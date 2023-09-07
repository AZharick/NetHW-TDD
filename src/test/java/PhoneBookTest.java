import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

   @Test
   public void testAdd_contactsCounter() {
      PhoneBook book = new PhoneBook();
      final String name = "Alex";
      final String number = "8-999-111-22-33";
      book.add(name, number);

      final int expected = 1;
      final int factResult = book.getListSize();
      Assertions.assertEquals(expected, factResult);
   }
}