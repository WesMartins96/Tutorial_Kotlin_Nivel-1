fun main() {
    println("Hello World") // Essa é a forma básica de escrever um 'olá mundo!' em kotlin.
    print("Meu nome é Wesley") // Escrevendo dessa forma o programa não quebra a linha.
    //Exemplo
    print("Tenho 25 anos")
    // A função 'print' não quebra a linha sendo assim é necessário usar /n

    //Exemplo
    print("Meu nome é Wesley \n" +
          "Tenho 25 anos") // O "\n" é utilizado para quebrar a linha

    //Outra forma de utilizar o "print" ou "println" é utilizando as """aspas triplas"""
    //Exemplo
    println("""
        Olá, Mundo!
        Me chamo Wesley Martins, e estou muito feliz de cursar Kotlin
        Tenho 25 anos!!!
    """)

    //É possivel escrever códigos dentro das "aspas"
    //Exemplo:
    val nome = "Wesley" //declarando a variável para o exemplo:
    println("Meu nome é ${nome.lowercase()}")
    println("Meu nome é ${nome.uppercase()}")
    println("Meu nome tem ${nome.length} letras")

    /** NOS EXEMPLOS ACIMA DA PRA VERIFICAR OS CÓDIGOS DENTRO DOS println CONCATENADOS */
}
