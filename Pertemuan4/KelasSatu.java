package Pertemuan4;

class KelasSatu {
        {
            System.out.println(11); //otomatis muncul diawal dan tidak akan muncul lg
        }

        static { //instance baru dibuat
            System.out.println(2);
        }

        public KelasSatu(int i) { //dengan parmeter, nilainya 3
            System.out.println(3);
        }

        public KelasSatu() { //tanpa parameter
            System.out.println(4);
        }
    }