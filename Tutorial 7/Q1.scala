class Rational(x: Int, y: Int){
    def numer = x
    def denom = y
    def neg = new Rational(-this.numer, this.denom)

    override def toString(): String = numer + "/" + denom

}

@main
def Test():Unit ={
    val x = new Rational(2,5)
    println(x.neg)
}