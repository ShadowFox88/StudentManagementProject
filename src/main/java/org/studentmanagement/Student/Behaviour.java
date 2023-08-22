package org.studentmanagement.Student;

import java.util.UUID;
import java.util.HashMap;

public class Behaviour {
    HashMap<String, String> praises = new HashMap<>();
    HashMap<String, String> behaviourPoints = new HashMap<>();
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

    public String addBehaviourPoint(String reason) {
        String uuid = UUID.randomUUID().toString();
        behaviourPoints.put(uuid, reason);
        return uuid;
    }

    public boolean removeBehaviourPoint(String id) {
        if (behaviourPoints.containsKey(id)) {
            behaviourPoints.remove(id);
            return true;
        }
        return false;
    }
}
