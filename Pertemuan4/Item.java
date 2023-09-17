package Pertemuan4;

public class Item {
        private String name;
        private Item() {
            name = "Ipin";
    }

    public Item(String name) {
        this(); //nambahin ini
        //this.name = "rose"; ipin tertindih rose
        System.out.println(this.name);
    }
} 
