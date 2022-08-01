import scala.io.StdIn.readInt

def interest(deposit:Int):Double ={
    if(deposit <= 20000){
        deposit * 2 / 100;
    }
    else if(deposit <= 200000){
        deposit * 4 / 100;
    }
    else if(deposit <= 2000000){
        deposit * 3.5 / 100;
    }
    else{
        deposit * 6.5 / 100;
    }
}

@main
def Test():Unit ={
    println("Enter the deposit money: ");
    var deposit = readInt();
    println("Interest for " + deposit + " is: " + interest(deposit));
}