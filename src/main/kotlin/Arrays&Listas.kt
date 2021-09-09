
fun main() {
    //mutableList tem como sua função a manipulação dos itens de dentro dela.
    //na mutableList é possivel adicionar(.add) quanto remover(.remove) itens da lista.
    val listaDeCarros = mutableListOf("Fiesta 1.0", "Golf GTI", "BMW MK6")
    println(listaDeCarros)

//para verificar a quantidade de itens na lista basta colocar .size dentro do println.
 //Exemplo:
    println("${listaDeCarros.size}")

//para selecionar um item expecifico da lista, basta colocar entre [] a unidade selecionada.
 //Exemplo:
    println(listaDeCarros[1]) //Lembrando que toda contagem de itens se inicia com 0.

    /** PARA ADICIONAR UM ITEM NA LISTA*/
 //Basta fazer igual abaixo:
 listaDeCarros.add("Fusca Turbo 2.5")
    //para testar basta busca-lo como um novo item atribuido.
    //EXEMPLO:
    println(listaDeCarros[3])
}