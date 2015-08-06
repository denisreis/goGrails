package gograils

class Link {

	String nome
	String url
	String descricao
	Integer votosPositivos
	Integer votosNegativos
	Integer visualizacoes
	Integer cliques
	Categoria categoria
	Usuario autor
	String objeto
	
	String toString (){
		"${this.nome}"
	}
	
	static belongsTo = [Categoria,Usuario]
	static hasMany = [comentarios:Comentario]
	
    static constraints = {
		nome()
		url()
		descricao()
		votosPositivos()
		votosNegativos()
		visualizacoes()
		cliques()		
    }
}
