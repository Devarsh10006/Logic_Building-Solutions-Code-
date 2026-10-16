import java.util.HashMap;
import java.util.Map;

class CustomStore {
    private Map<String, String> map = new HashMap<>();

    public void put(String key, String value) {
        map.put(key, value);
    }

    public String get(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        return "Key Not Found";
    }
}

public class P57_CustomKeyValueStore {
    public static void main(String[] args) {
        CustomStore store = new CustomStore();
        store.put("Language", "C#");
        store.put("Database", "SQL Server");

        System.out.println(store.get("Language"));
        System.out.println(store.get("Database"));
        System.out.println(store.get("Python"));
    }
}
