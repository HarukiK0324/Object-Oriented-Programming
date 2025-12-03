package oop.ex4A3;

import java.util.Map;

public class IDTable {
  private final Map<Person, String> nameMap;
  private final Map<String, Person> idMap;

  public IDTable() {
    nameMap = new java.util.HashMap<>();
    idMap = new java.util.HashMap<>();
  }

  public String getID(Person p) {
    return nameMap.get(p);
  }

  public Person getName(String id) {
    return idMap.get(id);
  }

  public void register(Person p, String id) {
    if (nameMap.containsKey(p)) {
      String oldID = nameMap.get(p);
      nameMap.remove(p);
      idMap.remove(oldID);
    }

    if (idMap.containsKey(id)) {
      Person oldP = idMap.get(id);
      nameMap.remove(oldP);
      idMap.remove(id);
    }
    
    nameMap.put(p, id);
    idMap.put(id, p);
  }

  public boolean remove(Person p) {
    if (!nameMap.containsKey(p))
      return false;
    String id = nameMap.get(p);
    nameMap.remove(p);
    idMap.remove(id);
    return true;
  }

  public boolean remove(String id) {
    if (!idMap.containsKey(id))
      return false;
    Person p = idMap.get(id);
    idMap.remove(id);
    nameMap.remove(p);
    return true;
  }
}
