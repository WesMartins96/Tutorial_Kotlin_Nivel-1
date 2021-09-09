/**Esses são todos os Tipos de Váriáveis e a quantidade de bits.
type       bit
Double      64
Float       32
Long        64
Int         32
Short       16
Byte        8
Boolean     ?
String      ?
Char        ?
*/
/**
 Lembrando sobre as unidades de medidas de cada tipo de variável.
 1 Byte = 8 bites
 1 Kilobyte (KB) = 1024 bites
 1 Megabyte (MB) = 1024 Kilobytes
 1 Gigabyte (GB) = 1024 Megabytes
 */
fun main() {
    val nome:String = "Wesley Martins Lopes"
    val idade:Int = 25
    val sexo:Char = 'H'
//Esses são exemplos de variáveis aplicadas em Kotlin.
//Exemplo da utilização:
    println(nome)
    println(idade)
    println(sexo)

//Outro exemplo de como utilizar:
    println(nome + idade + sexo)

// Outro exemplo de como utilizar:
    //Aqui vemos pela primeira vez a utilização do '$' para concatenar de forma simples e objetiva.
    println("Eu sou $nome, Tenho $idade anos, e sou $sexo")

}
