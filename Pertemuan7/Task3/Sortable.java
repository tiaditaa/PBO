package Pertemuan7.Task3;

public abstract class Sortable {
    public abstract int compare(Sortable b);

    public static void shell_sort(Sortable[] a) {
        int n = a.length;
        for (int interval = n / 2; interval > 0; interval /=2) {
            for (int i = interval; i < n; i += 1) {
                Sortable temp = a[i];
                int j;

                for (j = i; j >= interval; j -= interval){
                    a[j] = a[j - interval];
                }

                a[j] = temp;
            }
        }
    }
}
