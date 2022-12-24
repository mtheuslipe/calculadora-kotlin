import java.util.Scanner

fun main(){
    println("Vamos à calculadora!")// iniciando a calculadora
    // inicio do loop.
    do {
        println("Digite um número: ") //perguntando o primeiro núnmero
        val input = Scanner(System.`in`) // lendo o input do console
        val number1 = input.nextInt() // armazenando o input na primeira variável
        println("Digite mais um número: ") //perguntando o segundo núnmero
        val number2 = input.nextInt() // armazenando o input na segunda variável

        println("1- Soma, 2- Subtração, 3- Multiplicação, 4- Divisão") // dando um norte sobre a escolha da operação
        println("Para escolher a operação realizada, digite um número de 1 até 4:") // pedindo o número referente a operação
        val operationCode= input.nextInt()//armazenando em uma variável para fazer a verificação no objeto

        //chamando a função única com todas as operações em um único objeto
        mathOperations(number1, number2, operationCode )

        //criando estrutura para verificar se o usuário quer permanecer na calculadora ou finalizar o processo
        println("1- Recomeçar, 2- Terminar") //legenda sobre o que precisa ser digitado
        println("Segundo a legenda acima, digite um número para terminar ou começar de novo a calculadora: ")// comando ao usuário
        val verificationCode: Int = input.nextInt()//armazenando em variável se o usuário quer fazer outra conta ou encerrar
        if(verificationCode ==2) return //verificação para a função finalizar
    }while (verificationCode == 1 ) // verificação do loop
    println("Obrigado!")
}
//função única utilizando objeto deixando o código menos verboso e todas as instâncias e funções em apenas uma
fun mathOperations(number1: Int, number2: Int, operationCode: Int){
    //armazenando o objeto em uma variável
    var operations = object {
        //realizando a verificação de qual operação realizar de acordo com o que o usuário pediu
         val result: Any = when(operationCode) {
            1 -> number1 + number2
            2 -> number1 - number2
            3 -> number1 * number2
            4 -> number1 / number2.toDouble()
            else -> error("error 01: digite um número válido entre 1 e 4! (Operation Code: $operationCode)")
        }
    }
    //mostrando o resultado
    println("o resultado é: ${operations.result}")
}
