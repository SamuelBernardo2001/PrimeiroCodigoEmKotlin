import kotlin.random.Random

/*

                                  Primeiros Codigos


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

/*
            Segundo codigos

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


        // fazer a verificação para ver qual o tipo o valor caiu
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


 */

fun main() {

    /*
        tipos de ponto flutuantes

        o tipo de dados de ponto flutuante representa numeros com uma cada decimal

         exemplo

        9,99 ou 3,14515.

        os tipos de dados flutuantes sao Float e Double e Podem Armazenar Numeros fracionarios.

        exemplo de Float : Observação o Float Precisa Termina com o valor do Flutuante e te um "F" no final.
        Float: N° De Bits = 32, BITS Significativos = 24, BITS De Expoente = 8, Digitos Decimais = 6-7.

    val numfloat: Float = 5.75F
    println(numfloat)

        exemplo de Double
        Double: N° De Bits = 64, BITS Significativos = 53, BITS De Expoente = 11, Digitos Decimais = 15-16.

    val numDouble: Double = 19.99
     */

    //Float com precisão típica (dígitos decimais ~6-7)

    val numeroDecimal2: Float = 123.4567f
    println("Float com dígitos decimais: $numeroDecimal2")

    //Float grande para mostrar a influência do expoente (8 bits do expoente)

    val numeroExpoente2: Float = 1.23e10f   // 1.23 × 10^10
    println("Float com expoente: $numeroExpoente2")

    //Float pequeno para mostrar a influência da mantissa (bits significativos = 24)

    val numeroPequeno2: Float = 0.00001234567f
    println("Float com mantissa detalhada: $numeroPequeno2")

    //Float.SIZE_BITS → mostra que o tipo ocupa 32 bits no total.
    println("N° de bits: ${Float.SIZE_BITS}")              // 32 bits


    //Double com precisão típica (dígitos decimais ~15-16)
    val numeroDecimal: Double = 123.456789012345
    println("Double com dígitos decimais: $numeroDecimal")

    //Double grande para mostrar a influência do expoente (11 bits do expoente)
    val numeroExpoente: Double = 1.23e100   // 1.23 × 10^100
    println("Double com expoente: $numeroExpoente")

    //Double pequeno para mostrar a influência da mantissa (bits significativos = 53)
    val numeroPequeno: Double = 0.0000000001234567890123
    println("Double com mantissa detalhada: $numeroPequeno")

    //Informações gerais sobre Double
    println("N° de bits: ${Double.SIZE_BITS}")              // 64 bits


}