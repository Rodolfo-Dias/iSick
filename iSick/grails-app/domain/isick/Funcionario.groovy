package isick

class Funcionario extends Pessoa{
    private Date dataAdmissao;
    private String ctps;
    private String cargo;
    private Date dataDemissao;
    
    static constraints = {
    dataAdmissao blank: false
    ctps blank: false, unique: true
    cargo blank: false
    dataDemissao blank: false
    }
    
}
