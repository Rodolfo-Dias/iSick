package isick

class Produto {
    
    int codProduto
    String nomeProduto
    int quantidadeEstoque
    String tributacaoPisCofins
    String tributacaoIcms
    Date dataCadastro
    Double precoVenda
    Double precoCusto
    String tarja
        
    static constraints = {
        codProduto blank: false, unique: true
        nomeProduto blank: false
        quantidadeEstoque blank: false
        tributacaoPisCofins blank: false
        tributacaoIcms blank: false
        dataCadastro blank: false
        precoVenda blank: false
        precoCusto blank: false
        tarja blank: false
    }
}
