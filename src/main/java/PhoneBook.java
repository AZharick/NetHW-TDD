import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {
   private Map<String, String> map = new HashMap<>();

   public String printAllNames() {
      Set<String> names = map.keySet();
      List<String> list = names.stream()
              .sorted(Comparator.naturalOrder())
              .collect(Collectors.toList());
      return list.toString();
   }

   public String findByNumber(String value) {
      return map.entrySet().stream()
              .filter(entry -> value.equals(entry.getValue()))
              .findFirst().map(Map.Entry::getKey)
              .orElse(null);
   }

   public String findByName(String name) {
      return map.get(name);
   }

   public int add(String name, String phoneNumber) {
      map.putIfAbsent(name, phoneNumber);
      return this.getListSize();
   }

   public int getListSize() {
      return map.size();
   }

}