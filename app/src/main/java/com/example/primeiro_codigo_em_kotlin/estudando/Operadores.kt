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
fun operadoresLogicos(){
    /*

    &&   // E lógico (AND)
    ||   // OU lógico (OR)
    !    // NÃO lógico (NOT)

     */

    val a = true
    val b = false

    // && E lógico (AND)
    println("a && b: ${a && b}")   // false, só é true se ambos forem true
    println("a && a: ${a && a}")   // true

    // || OU lógico (OR)
    println("a || b: ${a || b}")   // true, é true se pelo menos um for true
    println("b || b: ${b || b}")   // false

    // ! NÃO lógico (NOT)
    println("!a: ${!a}")           // false, inverte o valor
    println("!b: ${!b}")           // true
}
fun operadoresDeIntevalos(){
    /*

    ..       // cria um intervalo inclusivo (1..5 → 1,2,3,4,5)
    downTo   // intervalo decrescente (5 downTo 1 → 5,4,3,2,1)
    step     // define o passo (1..10 step 2 → 1,3,5,7,9)
    until    // cria intervalo exclusivo do último número (1 until 5 → 1,2,3,4)
    in       // verifica se está dentro de um intervalo (x in 1..5)
    !in      // verifica se NÃO está dentro


     */

    // .. intervalo inclusivo
    println("Intervalo inclusivo 1..5:")
    for (i in 1..5) {
        print("$i ")  // 1 2 3 4 5
    }
    println()

    // downTo intervalo decrescente
    println("Intervalo decrescente 5 downTo 1:")
    for (i in 5 downTo 1) {
        print("$i ")  // 5 4 3 2 1
    }
    println()

    // step define o passo
    println("Intervalo com passo 2 de 1..10 step 2:")
    for (i in 1..10 step 2) {
        print("$i ")  // 1 3 5 7 9
    }
    println()

    // until cria intervalo exclusivo do último número
    println("Intervalo exclusivo 1 until 5:")
    for (i in 1 until 5) {
        print("$i ")  // 1 2 3 4
    }
    println()

    // in verifica se está dentro do intervalo
    val x = 3
    if (x in 1..5) {
        println("$x está dentro do intervalo 1..5")  // será exibido
    }

    // !in verifica se NÃO está dentro
    val y = 10
    if (y !in 1..5) {
        println("$y NÃO está dentro do intervalo 1..5")  // será exibido
    }
}
fun operadoresDeIgualdadeEIdentidade(){
    /*

    ==    // compara valores
    !=    // compara valores diferentes
    ===   // compara referências (se apontam para o mesmo objeto)
    !==   // compara se são objetos diferentes

     */

    // Comparando valores
    val a = 10
    val b = 10
    val c = 5

    println("a == b: ${a == b}")  // true, valores iguais
    println("a == c: ${a == c}")  // false, valores diferentes

    println("a != b: ${a != b}")  // false, valores iguais
    println("a != c: ${a != c}")  // true, valores diferentes

    // Comparando referências (objetos)
    val str1 = "Kotlin"
    val str2 = "Kotlin"
    val str3 = String("Kotlin".toCharArray())

    println("str1 === str2: ${str1 === str2}") // true, mesmos objetos (string pool)
    println("str1 === str3: ${str1 === str3}") // false, objetos diferentes
    println("str1 !== str3: ${str1 !== str3}") // true, não são o mesmo objeto
    println("str1 == str3: ${str1 == str3}")   // true, valores iguais
}

fun main() {
    calculadora()
}
