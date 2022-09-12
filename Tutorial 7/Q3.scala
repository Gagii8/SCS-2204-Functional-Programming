var bank: List[Account] = List();

class Account(id: String, n: Int, b: Double) {
    val nic: String = id;
    val acnumber: Int = n;
    var balance: Double = b;

    def transfer(a: Account,d: Double): Account = {
      this.balance = this.balance - d;
      a.balance = a.balance + d;
      a;
    }

    override def toString(): String = "[ NIC  no - " + nic + " : Account No - " + acnumber + " : Balance - " + balance + "]";
}

object Q3 {
  @main
  def Test():Unit = {
    var x = Account("199913202841", 1111, 50000.00);
    var y = Account("199913215433", 1112, 30000.00);

    //a1 transfer 3000 to a2
    x.transfer(y,3000.0);

    bank = List(x,y);

    var iter = bank.iterator;

    while(iter.hasNext) 
      println(iter.next);
  }
}