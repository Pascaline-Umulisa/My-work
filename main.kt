fun main (){
    var word= "akirachix"
    var newword=word[0].toString() +word[2] +word[3]
    println(newword)
    var results=description("Pascaline", 20)
    println(results)
    var result=assign("Pascaline")
    println(result)
    knowme("liliane")

}
fun description(name:String, age:Int):String{
    var sentence="Hi, my name is $name and i'm $age years old."
    return sentence
}
fun assign(word:String):Int{
    var find=word.length
    return find
}
fun knowme(name:String){
    if(name=="Pascaline")
        println("That's me!")
    else
        println("I don't know who that is!")

}

