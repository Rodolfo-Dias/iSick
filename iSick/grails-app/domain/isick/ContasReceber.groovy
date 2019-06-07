package isick

class ContasReceber {
    int numeroDaNota;
    String cliente;
    Date dataEmissao;
    Date dataRecebimento;
    Date dataPagamento;
    float valorPago;
    float valorTotal;
    int formaRecebimento;
    int numParcela;
    
    static constraints = {
        numeroDaNota blank: false, unique: true
        dataEmissao blank:false
        dataPagamento blank: false
        valorPago blank: false
        valorTotal blank:false
        formaRecebimento blank:false
    }
}
