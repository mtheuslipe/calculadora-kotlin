import java.util.Scanner

fun main(){
    println("Vamos à calculadora!")// iniciando a calculadora

    println("Digite um número: ")//perguntando o primeiro núnmero
    val input = Scanner(System.`in`)// lendo o input do console
    val a = input.nextInt()// armazenando o input na primeira variável
    println("Digite mais um número: ")//perguntando o segundo núnmero
    val b= input.nextInt()// armazenando o input na segunda variável

    println("1- Soma, 2- Subtração, 3- Multiplicação, 4- Divisão")// dando um norte sobre a escolha da operação
    println("Para escolher a operação realizada, digite um número de 1 até 4:")// pedindo o número referente a operação
    val case = input.nextInt()// armazenando o digito da operação

    //estrutura de caso que correlaciona o digito da operação com a operação específica
    when(case){
        1 -> sum(a, b)
        2 -> sub(a,b)
        3 -> multi(a,b)
        4 -> division(a,b)
    }
}

fun sum(number1: Int, number2: Int) {
    val sum = number1+number2
    println(sum)
}

fun sub(number1: Int, number2: Int){
    val sub = number1 - number2
    println(sub)
}

fun multi(number1: Int, number2: Int){
    val multi = number1 * number1
    println(multi)
}

fun division(number1: Int, number2: Int){
    val div = number1 / number2
    println(div)
}
