package it.unibo.arrays;

class MyCircularArray {

    int[] array;
    int count;

    MyCircularArray() {
        this(10);
    }

    MyCircularArray(int size) {
        this.array = new int[size];
        this.count=0;
    }

    void add(final int elem) {
        if(this.count>this.array.length-1) this.count=0;
        this.array[count] = elem;
        this.count++;
    }

    void reset() {
        for(int i=0; i<array.length; i++) this.array[i] = 0;
        this.count=0;
    }

    void printArray() {
        System.out.print("[");
        for (int i = 0; i < this.array.length - 1; i++) {
            System.out.print(this.array[i] + ",");
        }
        System.out.print(this.array[this.array.length - 1] + "]");
        System.out.println("");
    }

    //aggiunge i numeri consecutivi da i a n (non c'e' il problema index of bounds perchè l'array e circolare).
    void addRange(int i, int n) {
        for(;i<=n;i++) {
            add(i);
        }
    }

    public static void main(final String[] args) {

        // 1) Creare un array circolare di dieci elementi
        MyCircularArray array_defualt = new MyCircularArray();

        // 2) Aggiungere gli elementi da 1 a 10 e stampare il contenuto
        // dell'array circolare
        array_defualt.addRange(1, 10);
        array_defualt.printArray();

        // 3) Aggiungere gli elementi da 11 a 15 e stampare il contenuto
        // dell'array circolare
        array_defualt.addRange(11, 15);
        array_defualt.printArray();

        // 4) Invocare il metodo reset
        array_defualt.reset();

        // 5) Stampare il contenuto dell'array circolare
        array_defualt.printArray();

        // 6) Aggiungere altri elementi a piacere e stampare il contenuto
        // dell'array circolare
        array_defualt.add(20);
        array_defualt.add(50);
        array_defualt.printArray();
        array_defualt.addRange(0, 7);
        array_defualt.printArray();

        array_defualt.add(20);
        array_defualt.add(50);
        array_defualt.printArray();
        array_defualt.addRange(0, 8);
        array_defualt.printArray();
    }
}
