import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
   private Map<String, String> map = new HashMap<>();

   public String findByNumber(String value) {
      return map.entrySet().stream()
              .filter(entry -> value.equals(entry.getValue()))
              .findFirst().map(Map.Entry::getKey)
              .orElse(null);
   }

   public int add(String name, String phoneNumber) {
      map.putIfAbsent(name, phoneNumber);
      return this.getListSize();
   }

   public int getListSize() {
      return map.size();
   }

}