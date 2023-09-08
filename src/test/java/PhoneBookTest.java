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

   @Test
   public void testFindByNumber() {
      PhoneBook book = new PhoneBook();
      final String name = "Alex";
      final String number = "8-999-111-22-33";
      book.add(name, number);

      final String expected = "Alex";
      final String factResult = book.findByNumber("8-999-111-22-33");
      Assertions.assertEquals(expected, factResult);
   }

   @Test
   public void testFindByName() {
      PhoneBook book = new PhoneBook();
      final String name = "Alex";
      final String number = "123456";
      book.add(name, number);

      final String expected = "123456";
      final String factResult = book.findByName("Alex");
      Assertions.assertEquals(expected, factResult);
   }

   @Test
   public void testPrintAllNames() {
      PhoneBook book = new PhoneBook();
      final String name1 = "Alex";
      final String number1 = "111";
      book.add(name1, number1);

      final String name2 = "Mary";
      final String number2 = "111";
      book.add(name2, number2);

      final String expected = "[Alex, Mary]";
      final String factResult = book.printAllNames();
      Assertions.assertEquals(expected, factResult);
   }

}