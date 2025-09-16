import kotlin.random.Random

/*
                              Primeiros codigos.
    println("Hello. world!")
                                  Constante global, definido na compilação   \/
    const val n = "Larissa"       Constante em tempo de compilação (o valor precisa ser conhecido ANTES de rodar).
    var nome: String              (Ja iniciando o tipo da variavel)
    var nome1 = "Samuel"          variável mutável
    val nome2 = "Bernardo"        variável imutável (constante)
    val ano = 2025                variável imutável (constante)
    var mes = 9                   variável mutável
    val dia = 14                  variável imutável (constante)

    println("Bem Vindo, " + nome1 + " " + nome2 + ", Estamos em " + ano + "/" + mes + "/" + dia)
    println("Primeiro Codigo Em Kotlin Iniciado, $nome1 $nome2 !")

                                Segundo Codigos
    val num1 = 15
    val num2 = 5

    val soma = num1 + num2
    val divisao = num1 / num2
    val subtracao = num1 - num2
    val multiplication = num1 * num2

    println("a soma do valor De $num1 + $num2 é $soma")
    println("a subtração do valor De $num1 + $num2 é $subtracao")
    println("a divisão do valor De $num1 + $num2 é $divisao")
    println("a multiplicação do valor De $num1 + $num2 é $multiplication")

    println("O Valor Total Da (Soma,Subtração,divisão e multiplicação) é ${soma+divisao+subtracao+multiplication}")

                                  Terceira Codigos


          Tipos Inteiros - Byte: 8 De BITS

  O tipo de dads Byte ele Pode armazenar Números inteiros de -128 a 127.
  Isso pode ser usado em vez de Int ou outros tipos Inteiros para economizar memoria quando
  tiver certeza de que o valor estara entre -128 e 127.
  val byteNum: Byte = -128
  val byteNum2: Byte = 127

  val soma = byteNum + byteNum2

  println(soma)

          Tipos inteiros - Short: 16 De BITS

O tipo de dados Short pode armazenar numeros interios de -32768 a 32767

          Tipos inteiros - Int:32 De BITS

O tipo de dados Int pode Srmazenar Numeros inteiros de -2147483648 a 2147483647.

          tipos inteiros - Long: 64 De BITS

O tipode dados Long pode armazenar Numeros interios de -9223372036854775807 a 9223372036854775807
pode terminar o valor com um "L".

      Exemplo

  val numLong: Long = 150000000000L
*/



    fun main() {

        val numByte: Byte = 127 // Máximo
        val numByte2: Byte = -128 // Mínimo
        val numShort: Short = 32767 // Máximo
        val numShort2: Short = -32768 // Mínimo
        val numInt: Int = 2147483647 // Máximo
        val numInt2: Int = -2147483648 // Mínimo
        val numLong: Long = 9223372036854775807 // Máximo
        val numLong2: Long = -9223372036854775807 // Mínimo

        val conferir = Random.nextInt(0, 4) // sorteia entre 0,1,2,3
        var valor: Number // agora é Number, não Any (aceita todos os tipos numéricos) // Any pode receber qualquer tipo

        // foi sorteado entre 0 a 3 para fazer o Random de tipos de valores aleatorios
        if (conferir == 0) {
            valor = Random.nextInt()
        } else if (conferir == 1) {
            valor = Random.nextLong()
        } else if (conferir == 2) {
            valor = Random.nextInt(Byte.MIN_VALUE.toInt(), Byte.MAX_VALUE.toInt()).toByte()
        } else {
            valor = Random.nextInt(Short.MIN_VALUE.toInt(), Short.MAX_VALUE.toInt()).toShort()
        }


        // faer a verificação para ver qual o tipo o valor caiu
        if (valor.toInt() >= numByte2 && valor.toInt() <= numByte) {
            println("Caiu em Byte: $valor")
        } else if (valor.toInt() >= numShort2 && valor.toInt() <= numShort) {
            println("Caiu em Short: $valor")
        } else if (valor.toLong() >= numInt2.toLong() && valor.toLong() <= numInt.toLong()) {
            println("Caiu em Int: $valor")
        } else if (valor.toLong() >= numLong2 && valor.toLong() <= numLong) {
            println("Caiu em Long: $valor")
        }



        // Agora verificamos o TIPO de valor
        when (valor) {
            is Int -> println("Caiu em Int: $valor")
            is Long -> println("Caiu em Long: $valor")
            is Byte -> println("Caiu em Byte: $valor")
            is Short -> println("Caiu em Short: $valor")
            else -> println("Tipo desconhecido")
        }


    }