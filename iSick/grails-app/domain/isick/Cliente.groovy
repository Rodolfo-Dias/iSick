package isick

class Cliente extends Pessoa{
    Date dataNascimento
    Date dataCadastro
    boolean situacao
    String loginEmail
    String senha
    
    static constraints = {
        dataNascimento blank: false
        dataCadastro blank: false
        situacao nullable: false
        loginEmail blank: false, unique: true, email: true
        senha blank: false, password: true, size:8..25
    }
    
}