fun main(args: Array<String>) {
    println("Hello World!")

    println("MANIPULANDO STRING")

    var maçã = "maçã"
    var banana = "banana"

    println("${maçã}, ${banana.capitalize()}")

    //_______________________________________________________
    println("BLANK VS EMPTY")

    var s = "  "

    println(s.isEmpty())
    println(s.isBlank())

    //_______________________________________________________
    println("HIGH LEVEL FUNCTIONS")

    val z: Int

    //z = calculate(34,90,::sum)
    //z = calculate(34,90){a,b -> a+b}
    z = calculate(34, 90) { a, b ->
        println("calculando $a + $b")
        a + b
    }

    println(z)

    //_______________________________________________________
    println("FUNÇÃO EXTENSÃO")

    fun String.randomCapitalizedLetter() = this[(0..this.length - 1).random()].uppercaseChar()

    val frase: String = "granada"

    frase.randomCapitalizedLetter()
    println(frase)


    //_______________________________________________________
    println("ELVIS OPERATOR")

    val grade = (0..10).random()
    println(grade.getStudentStatus())



    //_______________________________________________________
    println("ATRIBUIÇÃO CORRETA")
    val t:Int
    val ba:Int? = null
    val sd:Int? = 22

    t = ba?:sd?: -1
    println(t)


    val t2:String = ba?.getStudentStatus()?:"" //não aceitar nulo
    val t3:String? = ba?.getStudentStatus() //passa a aceitar nulo
    //val t4:String? = ba!!.getStudentStatus() //forçando a chamada de um valor nulo NULL EXCEPTION
    println(t2)
    println(t3)
    //println(t4)


}
//FUNÇÕES

fun sum(a1:Int, a2:Int) = a1.plus(a2)

fun calculate(n1:Int, n2:Int, operation: (Int, Int) -> Int):Int{
    val result = operation(n1,n2)
    return result
}

fun Int.getStudentStatus():String {
    println("nota $this")

    return when (this) {
        in 0..4 -> "Reprovado"
        in 5..7 -> "Médio"
        in 8..10 -> "Ótimo"
        else -> "Indefinido"
    }
}

