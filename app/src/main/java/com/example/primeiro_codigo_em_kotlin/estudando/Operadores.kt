import java.util.Scanner

fun soma(x: Double, y: Double) = x + y
fun subtrair(x: Double, y: Double) = x - y
fun multiplicacao(x: Double, y: Double) = x * y
fun divisao(x: Double, y: Double): Double {
    return if (y != 0.0) x / y else Double.NaN // retorna NaN em caso de erro
}

fun calculadora() {
    val scanner = Scanner(System.`in`)
    var resultado: Double? = null
    var continuar = true

    println("====== CALCULADORA ======")
    println("Digite números e operações [+ - * /]. Use '=' para encerrar e mostrar o resultado.")

    while (continuar) {
        // Se não tem resultado ainda, pede o primeiro número
        if (resultado == null) {
            print("Digite o primeiro número: ")
            resultado = scanner.nextDouble()
        }

        // Pega a operação
        print("Digite a operação [+ - * / =]: ")
        val operacao = scanner.next()[0]

        if (operacao == '=') {
            continuar = false
            println("Resultado final = $resultado")
        } else {
            print("Digite o próximo número: ")
            val numero = scanner.nextDouble()

            resultado = when (operacao) {
                '+' -> soma(resultado, numero)
                '-' -> subtrair(resultado, numero)
                '*' -> multiplicacao(resultado, numero)
                '/' -> divisao(resultado, numero)
                else -> {
                    println("Operação inválida!")
                    resultado
                }
            }
        }
    }
}


fun main() {
    calculadora()
}
