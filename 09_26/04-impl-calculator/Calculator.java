class Calculator {
    int nOpDone;
    double lastRes;

    void build()
    {
        this.nOpDone = 0;
        this.lastRes = 0;
    }

    double add(double a, double b) {
        this.nOpDone++;
        lastRes = a + b;
        return this.lastRes;
    }
    
    double sub(double a, double b) {
        this.nOpDone++;
        lastRes = a - b;
        return this.lastRes;
    }
    
    double mul(double a, double b) {
        this.nOpDone++;
        lastRes = a * b;
        return this.lastRes;
    }
    
    double div(double a, double b) {
        this.nOpDone++;
        lastRes = a / b;
        return this.lastRes;
    }
}
