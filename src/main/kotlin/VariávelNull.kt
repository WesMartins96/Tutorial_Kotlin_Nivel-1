
/* é necessário evitar o erro "null pointer exception", que é muito recorrente quando se programa em Java.
Esse erro se da quando se tem uma variável com um valor null porém não é tratada. ou seja, Verificar se o valor é null ou não.
*/

/** A PRINCIPAL DIFERENÇA ENTRE A LINGUAGEM 'JAVA' & 'KOTLIN' É QUE KOTLIN É "NullSafe" ou seja,
   ela é segura contra o erro "null pointer exception" */

    //EXEMPLO//

//ao executar o programa abaixo, kotlin dará o erro:
// "Você atribuiu um valor Null ao tipo String"
//Para resolver é simples, basta colocar o sinal "?" no final do tipo, assim Koltin aceitará como um valor null
fun main() {
    var mensagem: String? = null
}
