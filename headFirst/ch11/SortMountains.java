package ch11;

import java.util.*;

public class SortMountains {
  public static void main(String[] args) {
    new SortMountains().go();
  }

  public void go() {
    List<Mountain> mountains = new ArrayList<>();
    mountains.add(new Mountain("Longs", 14255));
    mountains.add(new Mountain("Elbert", 14433));
    mountains.add(new Mountain("Maroon", 14156));
    mountains.add(new Mountain("Castle", 14265));
    
    System.out.println("as entered:\n" + mountains);

    mountains.sort((mount1, mount2) -> mount1.name.compareTo(mount2.name));
    System.out.println("by name:\n" + mountains);

//sorted by height in descending order    
    mountains.sort((mount1, mount2) -> mount2.height - mount1.height);
    System.out.println("by height:\n" + mountains);
  }
}

class Mountain {
  final String name;
  final int height;

  Mountain(String name, int height) {
    this.name = name;
    this.height = height;
  }

  @Override
  public String toString() {
    return name + " " + height;
  }
}