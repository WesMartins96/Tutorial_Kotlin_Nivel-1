/**
  Funções são criadas para deixar os nossos códigos menos complexos.
 com as funções pode-se evitar que a mesma linha de código se repita varias vezes.
 */
// A Sintaxe para definir uma função é:
/** fun + nome da função + parenteses para atribuir os parametros + as chaves para finalizar.

  pode-se dar um retorno a função, caso não colocado.
  por baixo dos panos Kotlin assume que a
  função retorna como unit.

 EXEMPLO:
 fun calculoBonus(a: Int): unit {}
 fun calculoBonus(a: Int): Int {}
 fun calculoBonus(a: Int): Double {}
 fun calculoBonus(a: Int): Float{}
 etc...
 */
//Exemplo:

fun calculaBonus(a: Int, b: Int, c: Int){
    println("BONUS: ${a + b * c }")  //qualquer alteração se for necessária basta apenas ser feita na função.
}

fun hello(nome: String, idade: Int){
    println("NOME: $nome IDADE: $idade")
}

//Abaixo dois exemplos de uma função que retorna algo:
fun cardId(id: Double) : Double {
    return 25.558
}
fun password(num: Int): Int{
    return 426899
}

fun main() {
    val a = 10
    val b = 20
    val c = 30
    calculaBonus(a, b ,c)
    hello("Wesley Martins", 25)
    println(cardId(25.558)) //Assim é a sintaxe de uma função que retorna algo.
    println(password(426899))
    println(passwordId(10 + 10))
    println(soma(10, 10))
}

//Exite tambêm a possibilidade de fazer uma função em uma unica linha.
// para funcionar é necessário que ela tenha apenas uma unica instrução
//EXEMPLO 1:
fun passwordId(id: Int) = 10 + 10

//EXEMPLO 2:
fun soma(a: Int,b: Int) = a + b




