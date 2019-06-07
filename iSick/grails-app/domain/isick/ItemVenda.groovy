package isick

class ItemVenda {
    String nome;
    int quantidade;
    float precoVenda;
    float desconto;
    String tributacao;
    int tarja;
    int lote;
    Produto p;
    
    static constraints = {
        quantidade blank:false
        nome blank:false
        precoVenda blank:false
        tarja blank:false
        lote blank:false
    }
}
