import scala.io.StdIn.readInt

def patternMatching(x: Int):String = x match {
    case x if(x <= 0) => "Negative/Zero is input"
    case x if(x%2 == 0) => "Even number is given"
    case _ => "Odd number is given"
}

@main
def Test(): Unit ={
    print("Enter number: ");
    val a = readInt();
    println(patternMatching(a));
}
