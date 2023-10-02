package it.unibo.cli.arguments.test;

class TestCommandLine {

    public static void main(final String[] args) {
        /*
         * Write the main method in such a way that it iterates through the
         * array of arguments, printing each one along with the length of the
         * string - the String class provides an
         *
         * int length()
         *
         * method that returns the length of the String.
         *
         * Example output:
         *
         * $ java oop.lab02.cli.TestCommandLine Welcome to the lab
         *
         * The provided arguments are:
         *  * Welcome, 7 characters long
         *  * to, 2 characters long
         *  * the, 3 characters long
         *  * lab, 3 characters long
         */
        for (String string : args) {
            System.out.println(string + ", " + string.length() + " characters long");
        }
    }
}
