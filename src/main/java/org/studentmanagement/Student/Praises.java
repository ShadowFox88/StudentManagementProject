package org.studentmanagement.Student;

import java.util.UUID;
import java.util.HashMap;

public class Praises {
    HashMap<String, String> praises = new HashMap<>();
    public String addPraise(String reason) {
        String uuid = UUID.randomUUID().toString();
        praises.put(uuid, reason);
        return uuid;
    }

    public boolean removePraise(String id) {
        if (praises.containsKey(id)) {
            praises.remove(id);
            return true;
        }
        return false;
    }
}
