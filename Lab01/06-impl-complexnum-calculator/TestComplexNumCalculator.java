class TestComplexNumCalculator {
  public static void main(String[] args) {

    /*
     * Usa l'oggetto calcolatrice che calcola le operazioni richieste 
     * N.B NON CAMBIA IL VALORE DEI NUMERI DATI COME ARGOMENTO
     * LastRes memorizza il risultato dell'operazione
     * ad ogni operazione effettuata cambia!
     * Ho modificato la classe ComplexNum
     */
    
    ComplexNumCalculator calc = new ComplexNumCalculator();
    calc.build();

    ComplexNum num1 = new ComplexNum();
    ComplexNum num2 = new ComplexNum();
    num1.build(1.0, 2.0);
    num2.build(3.0, 4.0);

    calc.add(num1, num2);
    calc.sub(num1, num2);
    calc.mul(num1, num2);
    calc.div(num1, num2);
    calc.mul(num1, num2);
    calc.div(num1, num2);
    calc.sub(num1, num2);
  }
}
