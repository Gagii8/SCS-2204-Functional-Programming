trait operators {
    def +(p: Point):Point
    def move(x: Int,y: Int):Point
    def distance(p: Point): Double
    def invert(): Point
}

case class Point(a: Int, b: Int) extends operators{
    override def +(p: Point): Point = Point(a+p.a,b+p.b)

    override def move(x: Int, y: Int): Point = Point(a+x,b+y)

    override def distance(p: Point): Double = {
        val d = Math.pow((a - p.a),2) + Math.pow((b-p.b),2)
        Math.pow(d,0.5);
    }

    override def invert(): Point = Point(b,a)
}

object  p {
    def main(args: Array[String]) : Unit = {
        var p = Point(2,4)
        var q = Point(6,5)

        println("\nAddition of p and q : " + (p+q))
        q = q.move(4,5)
        println("\nMove q by (4,5) : " + q)
        println("\nDistance between p and q : " + p.distance(q));
        println("\nInvertion of p : " + p.invert());
        println("\nInvertion of q : " + q.invert());
    }
}