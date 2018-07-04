package isick

class RegistroDeEntrada {
    int numeroDaNota;
    int serieDaNota;
    Date dataEmissao;
    Date dataEntrada;
    int chaveNfe;
    String nomeItem;
    int quantidade;
    int precoUnitario;
    
    static constraints = {
        numeroDaNota blank: false, unique: true
        serieDaNota blank: false
        dataEmissao blank:false
        chaveNfe blank: false
        quantidade blank:false
        precoUnitario blank:false
    }
}
