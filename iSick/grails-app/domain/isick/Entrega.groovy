package isick

class Entrega {
    String logradouro;
    int cep;
    String bairro;
    String municipio;
    String referencia;
    Date dataSaida;
    Date horaSaida;
    Date horaEntrega;
    String entregador;
    
    static constraints = {
    logradouro blank: false
    cep blank: false
    bairro blank: false
    municipio blank: false
    dataSaida blank: false
    horaSaida blank: false
    entregador blank: false
    }
}
