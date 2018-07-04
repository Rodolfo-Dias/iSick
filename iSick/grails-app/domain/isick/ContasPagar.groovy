package isick

class ContasPagar {
    int numeroDaNota;
    Date dataEmissao;
    Date dataRecebimento;
    Date dataPagamento;
    float valorPago;
    float valorTotal;
    int fornecedor;
    int parcela;
    
    static constraints = {
        numeroDaNota blank: false, unique: true
        dataEmissao blank:false
        dataPagamento blank: false
        valorPago blank: false
        valorTotal blank:false
        fornecedor blank:false
    }
}
