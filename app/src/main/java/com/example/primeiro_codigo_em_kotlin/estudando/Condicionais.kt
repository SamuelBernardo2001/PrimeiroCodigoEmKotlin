

fun condicionais (){
/*
        Exemplo de Condições
Menor que: a < b
Menor o Igual a: a <= b
Maior que: a > b
Maior ou Igual a: a >= b
igual a: a == b
Diferente de: a != b

essas condiçoes sao utilizadas de acordo com a logica do sistema
 */

    var a = 15
    var b = 10
    var c = 15

    if (a > b){ // verifica ser a é maior que b, ser a repostar for verdadeiro ele retorna informando que é maior
        println("Sim ${a} é Maior que ${b}")
    }else if (a >= b){ // verifica ser ele é maior ou igual
        println(" Sim ${a} é Maior ou Igual que ${b}")
    }

    if (a < c) { // verifica ser a é menor que c Ser a resposta for sim retorna o menor ser a resposta de baixo for sim retorna a de baixo
        println("Sim ${a} é Menor que ${c}")
    }else if (a <= c) { // verifica ser ele é menor ou iqual
        println("Sim ${a} é Menor Ou Igual que ${c}")
    }

    if (c == a){ // verifica ser c é igual a
        println("Sim ${c} é Igual ${a}")
    }else if (c != a) { // verifica ser c é diferente que a
        println("Sim ${c} é Diferente que ${a}")
    }

    if (c != b) { // verifica ser c é diferente que b
        println("Sim ${c} é Diferente que ${b}")
    }else if (c == b){
        println("Sim ${c} é Igual ${b}")
    }
}

fun condicionais2 () {
    val semaforo = "Verde"

    when (semaforo) {
        "Vermelho" -> {
            println("Pare")
        }
        "Amarelo" -> {
            println("Aviso")
        }
        "Verde" -> {
            println("Livre")
        }
        else -> {
            println("Opção invalida.")
        }
    }
}