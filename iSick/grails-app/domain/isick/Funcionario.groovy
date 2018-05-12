package isick

class Funcionario extends Pessoa{
    private Date dataAdmissao;
    private String ctps;
    private String cargo;
    private Date dataDemissao;
    String loginEmail
    String senha
    
    static constraints = {
    dataAdmissao blank: false
    ctps blank: false, unique: true
    cargo blank: false
    dataDemissao blank: false
    loginEmail blank: false, unique: true, email: true
    senha blank: false, password: true, size:4..8
    }
    
}
