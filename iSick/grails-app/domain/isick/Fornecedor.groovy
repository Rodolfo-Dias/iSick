package isick

class Fornecedor {
	String cnpj	 
	String razaoSocial
	String nomeFantasia
	String inscricaoEstadual	 
	String logradouro
	String municipio	 
	String bairro	 
	String cep	 
	String telefone	
        
    static constraints = {
        
        cnpj size: 11..14, blank:false, unique: true
        razaoSocial blank: false
	nomeFantasia blank: false
	inscricaoEstadual blank: false
	logradouro size: 1..30, blank:false
	municipio size: 1..30, blank:false
	bairro size: 1..30, blank:false
	cep size:8..9, blank: false
	telefone blank: false
    }
}
