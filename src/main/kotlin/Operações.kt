fun main() {
    //Essas são as operações básicas do Kotlin
    println("2 + 2 = ${2 + 2}")
    println("2 - 2 = ${2 - 2}")
    println("2 / 2 = ${2 / 2}")
    println("2 * 2 = ${2 * 2}")
    println("10 % 4 = ${10 % 4}")
    println("10 % 2 = ${10 % 2}")

    var numero = 10

    println("numero++ = ${numero++}") //Esta é a operação para acrescimo
    println("numero-- = ${numero--}") //Está é a operação para decrescimo

    println("++numero = ${++numero}") //Outra forma de realizar o acrescimo
    println("--numero = ${--numero}") //Outra forma de realizar o decrescimo

    numero += 2 //este é o codigo para adicionar mais numeros ao da variável, ou seja esse numero é somado ao 10 da variável. Resultando em 12.
    println("numero+= 2 = $numero") //Desta forma acrescemos 2 numeros ao numero 10 da variavél.
//ABAIXO ALGUMAS VARIAÇOES DO CÓDIGO ACIMA.
    numero -= 2
    println("numero-= 2 = $numero")

    numero /= 2
    println("numero/= 2 = $numero")

    numero *= 2
    println("numero*= 2 = $numero")

    numero %= 3
    println("numero%= 3 = $numero")
}