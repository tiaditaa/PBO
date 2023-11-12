package Pertemuan11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Family {
    private List<Uncle> uncles;
    private List<Niece> nieces;

    public Family() {
        uncles = new ArrayList<>();
        nieces = new ArrayList<>();
    }

    public boolean addUncle(String name) {
        if (findUncle(name) != null) {
            return false;
        }
        uncles.add(new Uncle(name));
        return true;
    }

    public boolean addNiece(String name, int day, int month) {
        if (findNiece(name) != null) {
            return false;
        }
        nieces.add(new Niece(name, day, month));
        return true;
    }

    public Uncle findUncle(String name) {
        for (Uncle uncle : uncles) {
            if (uncle.getName().equals(name)) {
                return uncle;
            }
        }
        return null;
    }

    public Niece findNiece(String name) {
        for (Niece niece : nieces) {
            if (niece.getName().equals(name)) {
                return niece;
            }
        }
        return null;
    }

    public void listUncles() {
        Collections.sort(uncles);
        for (Uncle uncle : uncles) {
            System.out.println(uncle.getName());
        }
    }

    public void listNieces() {
        Collections.sort(nieces);
        for (Niece niece : nieces) {
            System.out.println(niece.getName());
        }
    }

    public Uncle[] getUncles() {
        return uncles.toArray(new Uncle[0]);
    }
}
