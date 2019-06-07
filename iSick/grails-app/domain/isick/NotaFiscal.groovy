package isick

class NotaFiscal {
    int chave
    Date dataEmissao
    Date dataAutorizacao
    Date dataEnvio
    int situacao
    int protocoloAutorizacao
    int protocoloCancelamento
    int numero
    int serie
    int destino
    
    static constraints = {
        chave blank:false; unique:true
        dataEmissao blank:false
        situacao blank:false
        numero blank:false
        serie blank:false
        destino blank:false
    }
}
