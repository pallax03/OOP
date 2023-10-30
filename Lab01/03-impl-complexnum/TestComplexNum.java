class TestComplexNum {
    public static void main(String[] args) {
      // punto 1)
      ComplexNum c1 = new ComplexNum();
      c1.build(3.0, 5.0);

      // punto 2)
      ComplexNum c2 = new ComplexNum();
      c2.build(7.0, -4.0);

      // punto 3)
      ComplexNum c3 = new ComplexNum();
      c3.build(-2.0, 3.0);

      // punto 4)
      ComplexNum c4 = new ComplexNum();
      c4.build(-2.0, 3.0);
      
      // punto 5)
      System.out.printf("\nc1: %s\nc2: %s\nc3: %s\nc4: %s\n", c1.toStringRep(), c2.toStringRep(), c3.toStringRep(), c4.toStringRep());
      
      //punto 6)
      c1.add(c2);
      //punto 7)
      c2.add(c4);

      //punto 8)
      System.out.printf("\nc1: %s\nc2: %s\nc3: %s\nc4: %s\n\n", c1.toStringRep(), c2.toStringRep(), c3.toStringRep(), c4.toStringRep());
      
      //punto 10)
      System.out.println("c3 == c1: " + c3.equal(c1));
      System.out.println("c3 == c2: " + c3.equal(c2));
      System.out.println("c3 == c4: " + c3.equal(c4));

      /*
      * Additional test for toStringRep()
      */
      ComplexNum toPrint = new ComplexNum();
      toPrint.build(0, 0);
      System.out.println(toPrint.toStringRep());
      toPrint.build(2, 2);
      System.out.println(toPrint.toStringRep());
      toPrint.build(2, -2);
      System.out.println(toPrint.toStringRep());
      toPrint.build(-2, 2);
      System.out.println(toPrint.toStringRep());
      toPrint.build(-2, -2);
      System.out.println(toPrint.toStringRep());
      toPrint.build(0, -2);
      System.out.println(toPrint.toStringRep());
      toPrint.build(0, 2);
      System.out.println(toPrint.toStringRep());
      toPrint.build(0, -1);
      System.out.println(toPrint.toStringRep());
      toPrint.build(0, 1);
      System.out.println(toPrint.toStringRep());
      toPrint.build(2, 1);
      System.out.println(toPrint.toStringRep());
      toPrint.build(2, -1);
      System.out.println(toPrint.toStringRep());
      toPrint.build(-2, 1);
      System.out.println(toPrint.toStringRep());
      toPrint.build(-2, -1);
      System.out.println(toPrint.toStringRep());
      toPrint.build(2, 0);
      System.out.println(toPrint.toStringRep());
      toPrint.build(-2, 0);
      System.out.println(toPrint.toStringRep());
    }
}
