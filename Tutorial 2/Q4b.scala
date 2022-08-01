@main
def Test() ={
    price(5)
    price(10)
    price(15)
    price(20)
}

def attendance(ticketpr:Int):Int ={
    if(ticketpr == 15){
        120
    }else if(ticketpr > 15){
        120 - (ticketpr-15) * 20/5
    }
    else{
        120 + (ticketpr-15) * 20/5
    }
}

def income(ticketpr:Int):Int ={
    attendance(ticketpr) * ticketpr
}

def cost(ticketpr:Int):Int ={
    500 + attendance(ticketpr) * 3
}

def profit(income:Int, cost:Int):Int ={
    income - cost
}

def price(ticketpr:Int) = println(profit(income(ticketpr),cost(ticketpr)))