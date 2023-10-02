class ComplexNum {
    double re;
    double im;

    void build(double re, double im) {
        this.re = re;
        this.im = im;
    }

    boolean equal(ComplexNum num) {
        return (this.re == num.re && this.im == num.im);
    }

    void add(ComplexNum num) {
        this.re += num.re;
        this.im += num.im;
    }

    String toStringRep() {
        String output="";

        if(this.re>0)
            output += "+" + this.re + " ";
        else if(this.re < 0)
            output += "" + this.re + "";
        
        if(this.im > 0)
            output += " +" + this.im + "i";
        else if(this.im < 0)
            output += this.im+"i";

        return output;
    }
}