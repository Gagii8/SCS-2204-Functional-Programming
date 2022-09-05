object Q1{
    def main(args: Array[String]): Unit ={
        var alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

        var encrypt = (c:Char, key:Int, text:String) =>
            text((text.indexOf(c.toUpper) + key) % text.size)
        
        var decrypt = (c:Char, key:Int, text:String) =>
            text((text.indexOf(c.toUpper) - key) % text.size)

        val cipher = (algo: (Char, Int, String) => 
            Char, s:String, key:Int, text:String) =>
                s.map(algo(_, key, text))

        var ct = cipher (encrypt, "gagi", 5, alphabet)
        println(ct)

        var pt = cipher(decrypt, ct, 5, alphabet)
        println(pt)
    }
}
