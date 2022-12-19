import java.util.Scanner

fun main(){
    println("Vamos à calculadora!")// iniciando a calculadora
    // inicio do loop.
    do {
        println("Digite um número: ") //perguntando o primeiro núnmero
        val input = Scanner(System.`in`) // lendo o input do console
        val a = input.nextInt( ) // armazenando o input na primeira variável
        println("Digite mais um número: ") //perguntando o segundo núnmero
        val b = input.nextInt() // armazenando o input na segunda variável

        println("1- Soma, 2- Subtração, 3- Multiplicação, 4- Divisão") // dando um norte sobre a escolha da operação
        println("Para escolher a operação realizada, digite um número de 1 até 4:") // pedindo o número referente a operação

        //estrutura de caso que correlaciona o digito da operação com a operação específica
        when (input.nextInt()) {
            1 -> sum(a, b)
            2 -> sub(a, b)
            3 -> multi(a, b)
            4 -> division(a, b)
            else -> error("Digite apenas números de 1 até 4!!!")
        }

        //criando estrutura para verificar se o usuário quer permanecer na calculadora ou finalizar o processo
        println("1- Recomeçar, 2- Terminar") //legenda sobre o que precisa ser digitado
        println("Segundo a legenda acima, digite um número para terminar ou começar de novo a calculadora: ")// comando ao usuário
        if(input.nextInt() ==2) return //verificação para a função finalizar
    }while (input.nextInt() == 1 ) // verificação do loop
    println("Obrigado!")
}
// as funções especifícas da calculadora com as 4 operações básicas
fun sum(number1: Int, number2: Int) {
    val sum = number1+number2
    println(sum)
}

fun sub(number1: Int, number2: Int){
    val sub = number1 - number2
    println(sub)
}

fun multi(number1: Int, number2: Int){
    val multi = number1 * number2
    println(multi)
}

fun division(number1: Int, number2: Int) {
    val div: Double = number1.toDouble() / number2.toDouble()
    println(div)
}
