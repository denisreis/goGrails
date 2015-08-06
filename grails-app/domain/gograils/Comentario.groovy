package gograils

class Comentario {

	String nomeVisitante
	String email
	Date data
	Link link
	String mensagem
	
	String toString (){
		"${this.nomeVisitante}"
	}
	
	static belongsTo = Link
	
    static constraints = {
		nomeVisitante(nullable:false,blank:false)
		email(nullable:false,blank:false,email:true)
		data(nullable:false,blank:false)
		link(nullable:false,blank:false)
		mensagem(nullable:false,blank:false)
    }
}
