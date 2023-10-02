class ComplexNumCalculator {
    static int nOpDone;
    ComplexNum lastRes;

    void build() {
        this.nOpDone=0;
        this.lastRes = new ComplexNum();
        this.lastRes.build(0.0, 0.0);
    }

    ComplexNum add(ComplexNum num1, ComplexNum num2) {
        System.out.print(num1.toStringRep()+" + "+ num2.toStringRep()+ " = ");
        this.lastRes.copyComplexNum(num1);
        this.lastRes.add(num2);
        this.nOpDone++;
        printRes();
        return this.lastRes;
    }

    ComplexNum sub(ComplexNum num1, ComplexNum num2) {
        System.out.print(num1.toStringRep()+" - "+ num2.toStringRep()+ " = ");
        this.lastRes.copyComplexNum(num1);
        this.lastRes.sub(num2);
        this.nOpDone++;
        printRes();
        return this.lastRes;
    }

    ComplexNum mul(ComplexNum num1, ComplexNum num2) {
        System.out.print(num1.toStringRep()+" * "+ num2.toStringRep()+ " = ");
        this.lastRes.copyComplexNum(num1);
        this.lastRes.mul(num2);
        this.nOpDone++;
        printRes();
        return this.lastRes;
    }

    ComplexNum div(ComplexNum num1, ComplexNum num2) {
        System.out.print(num1.toStringRep()+" / "+ num2.toStringRep()+ " = ");
        this.lastRes.copyComplexNum(num1);
        this.lastRes.div(num2);
        this.nOpDone++;
        printRes();
        return this.lastRes;
    }

    void printRes() {
        System.out.print(this.lastRes.toStringRep() + " ~ nOpDone: "+ this.nOpDone + "\n");
    }
}
