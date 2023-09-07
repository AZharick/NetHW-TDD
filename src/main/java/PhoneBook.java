import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
   private Map<String, String> map = new HashMap<>();

   public String findByNumber(String number) {
      return null;
   }

   public int add(String name, String phoneNumber) {
      map.putIfAbsent(name, phoneNumber);
      return this.getListSize();
   }

   public int getListSize() {
      return map.size();
   }

}