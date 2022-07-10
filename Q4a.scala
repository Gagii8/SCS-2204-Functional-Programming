import scala.io.StdIn.readInt
@main
def Test():Unit ={
    println("Enter normal working hours: ")
    val normal_hrs = readInt();
    println("Enter OT hours: ")
    val OT_hrs = readInt();
    val salary = salaryWOTax(normal_hrs,OT_hrs);
    val tax = taxperWk(normal_hrs,OT_hrs);
    println(netSalary(salary,tax));
}

def salaryWOTax(NormalHours:Int , OTHours:Int):Int ={
    NormalHours * 250 + OTHours * 85
}

def taxperWk(NormalHours:Int , OTHours:Int):Float ={
    if(NormalHours >= 40 && OTHours >= 30){
        12/100
    }
    else{
        0
    }
}

def netSalary(salaryWOTax:Int, tax:Float):Float ={
    salaryWOTax - salaryWOTax * tax
}