package Pertemuan7.Task3;

public class ManagerTest {
    public static void main(String[] args) {
        Employee[] staf = new Employee[3];
        staf[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staf[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staf[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        Sortable.shell_sort(staf);

        int i;
        for (i = 0; i < 3; i++)
            staf[i].naikGaji(5);

        for (i = 0; i < 3; i++)
            staf[i].cetak();
    }
}
