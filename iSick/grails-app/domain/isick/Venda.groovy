package isick

class Venda {
    int numeroDaNota;
    int serieDaNota;
    Date dataEmissao;
    Date dataSaida;
    float descontoTotal;
    float valorTotal;
    List<ItemVenda> itensVenda;
    
    static constraints = {
        numeroDaNota blank: false, unique: true
        serieDaNota blank: false
        dataEmissao blank:false
        dataSaida blank: false
    }
}
