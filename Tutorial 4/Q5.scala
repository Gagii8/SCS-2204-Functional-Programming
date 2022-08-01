def toUpper(text : String): String ={
    text.toUpperCase();
}

def toLower(text : String): String ={
    text.toLowerCase();
}

def formatNames(name : String, func : String=>String): String ={
    func(name);
}

@main
def Test(): Unit ={
    println(toUpper("Benny"));
    println("N" + formatNames("i",toUpper) + "roshan");
    println(toLower("Saman"));
    println("Kumar" + formatNames("a",toUpper));
}