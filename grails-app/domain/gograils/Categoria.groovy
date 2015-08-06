package gograils

class Categoria {

	String nome
	
	String toString (){
		"${this.nome}"
	}
	
	static hasMany = [links:Link]
	
    static constraints = {
		nome(nullable:false,blank:false,unique:true)
    }
}
