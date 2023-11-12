package Pertemuan11;

import java.util.*;

public class Uncle implements Comparable<Uncle> {
    private String name;
    private List<Present> presents;

    public Uncle(String name) {
        this.name = name;
        presents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addPresent(Niece recipient, String description) {
        for (Present present : presents) {
            if (present.getRecipient().equals(recipient)) {
                return false;
            }
        }
        presents.add(new Present(this, recipient, description));
        return true;
    }

    public void listPresents() {
        for (Present present : presents) {
            System.out.println(present.getGiver().getName() +
             " is giving a " + present.getDescription() +
              " to " + present.getRecipient().getName());
        }
    }

    @Override
    public int compareTo(Uncle other) {
        return name.compareTo(other.name);
    }
}