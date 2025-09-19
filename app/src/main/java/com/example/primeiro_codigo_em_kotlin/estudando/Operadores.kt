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

fun operadoresMatematicos (){

    /*

    +   // adição
    -   // subtração
    *   // multiplicação
    /   // divisão
    %   // módulo (resto da divisão)
    ++  // adicionar o valor 1
    --  // diminuir o valor 1

    */

    var a = 10
    var b = 3

    // + adição
    println("Adição: $a + $b = ${a + b}")   // 10 + 3 = 13

    // - subtração
    println("Subtração: $a - $b = ${a - b}") // 10 - 3 = 7

    // * multiplicação
    println("Multiplicação: $a * $b = ${a * b}") // 10 * 3 = 30

    // / divisão
    println("Divisão: $a / $b = ${a / b}")   // 10 / 3 = 3 (inteiro, sem casas decimais)

    // % módulo (resto da divisão)
    println("Módulo: $a % $b = ${a % b}")   // 10 % 3 = 1

    // ++ adicionar o valor 1
    var c = 5
    println("Antes do incremento: c = $c")
    c++
    println("Depois do incremento: c = $c")  // c = 6

    // -- diminuir o valor 1
    var d = 8
    println("Antes do decremento: d = $d")
    d--
    println("Depois do decremento: d = $d")  // d = 7

}
fun operadoresDeAtribuicao(){

    /*

    =    // atribuição simples
    +=   // soma e atribui
    -=   // subtrai e atribui
    *=   // multiplica e atribui
    /=   // divide e atribui
    %=   // resto e atribui

     */

    var a = 10
    var b = 3

    // = atribuição simples
    var x = 5
    println("Atribuição simples: x = $x")  // x = 5

    // += soma e atribui
    a += b   // equivale a: a = a + b
    println("a += b → a = $a")  // 10 + 3 = 13

    // -= subtrai e atribui
    a -= b   // equivale a: a = a - b
    println("a -= b → a = $a")  // 13 - 3 = 10

    // *= multiplica e atribui
    a *= b   // equivale a: a = a * b
    println("a *= b → a = $a")  // 10 * 3 = 30

    // /= divide e atribui
    a /= b   // equivale a: a = a / b
    println("a /= b → a = $a")  // 30 / 3 = 10

    // %= resto e atribui
    a %= b   // equivale a: a = a % b
    println("a %= b → a = $a")  // 10 % 3 = 1
}
fun operadoresRelacionais(){
    /*

    ==   // igual
    !=   // diferente
    >    // maior que
    <    // menor que
    >=   // maior ou igual
    <=   // menor ou igual

     */

    val a = 10
    val b = 5
    val c = 10

    // == igual
    println("a == b: ${a == b}")  // false
    println("a == c: ${a == c}")  // true

    // != diferente
    println("a != b: ${a != b}")  // true
    println("a != c: ${a != c}")  // false

    // > maior que
    println("a > b: ${a > b}")    // true
    println("b > a: ${b > a}")    // false

    // < menor que
    println("a < b: ${a < b}")    // false
    println("b < a: ${b < a}")    // true

    // >= maior ou igual
    println("a >= b: ${a >= b}")  // true
    println("a >= c: ${a >= c}")  // true

    // <= menor ou igual
    println("a <= b: ${a <= b}")  // false
    println("b <= a: ${b <= a}")  // true
    println("a <= c: ${a <= c}")  // true
}

fun main() {
    calculadora()
}
