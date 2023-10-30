class ComplexNum {
    double re;
    double im;

    void build(double re, double im) {
        this.re = re;
        this.im = im;
    }

    boolean equal(ComplexNum num) {
        if(this.re == num.re && this.im == num.im)
        {
            return true;
        }
        return false;
    }

    void add(ComplexNum num) {
        this.re += num.re;
        this.im += num.im;
    }
    void sub(ComplexNum num) {
        this.re -= num.re;
        this.im -= num.im;
    }

    void mul(ComplexNum num) {
        double mulRe = this.re * num.re;    //ac
        double mulIm = this.im * num.im;    //bd 

        this.im = (this.im * num.re) + (this.re*num.im); //bc+ad 
        this.re = mulRe - mulIm;                         //ac-bd
    }

    void div(ComplexNum num) {
        double mulRe = this.re * num.re;    //ac
        double mulIm = this.im * num.im;    //bd 
        
        this.im = ((this.im * num.re) - (this.re*num.im))/(Math.pow(num.re, 2)+ Math.pow(num.im, 2));   //(bc-ad)/c^2+d^2
        this.re = (mulRe + mulIm)/(Math.pow(num.re, 2)+ Math.pow(num.im, 2));                           //(ac+bd)/c^2+d^2
    }

    void copyComplexNum(ComplexNum num) 
    {
        this.re = num.re;
        this.im = num.im;
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