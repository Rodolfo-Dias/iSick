package isick

class Pessoa {
    String nome
    String cpf
    String logradouro
    String complemento
    String cep
    String bairro
    String municipio
    String telefone1
    String telefone2
    
    static constraints = {
        nome blank: false
        cpf size:11..12, blank: false, unique: true
        logradouro blank: false
        complemento blank: true, nullable: true
        cep size:8..9, blank: false
        bairro blank: false
        municipio blank: false
        telefone1 blank: false
        telefone2 blank: true, nullable: true
    }
}
