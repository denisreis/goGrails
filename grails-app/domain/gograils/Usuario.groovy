package gograils

class Usuario {

	String nome
	String login
	String hashSenha
	String email
	
	String toString (){
		"${this.nome}"
	}
	
	static hasMany = [links:Link]
	
    static constraints = {
		nome(nullable:false,blank:false,unique:true)
		login(nullable:false,blank:false,unique:true)
		hashSenha(nullable:false,blank:false)
		email(nullable:false,blank:false,email:true)
    }
}
