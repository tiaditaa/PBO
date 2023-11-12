package Pertemuan11;

import java.util.*;

public class Niece implements Comparable<Niece> {
    private String name;
    private int day;
    private int month;

    public Niece(String name, int day, int month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        return cal.getTime();
    }

    @Override
    public int compareTo(Niece other) {
        return getBirthday().compareTo(other.getBirthday());
    }
}
