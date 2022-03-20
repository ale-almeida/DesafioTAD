package tads;

public class ProfessorUcsal implements InterfaceDesafioTad{

//	Implemente um TAD do tipo professoresUcsal em que contenha as operações:
//		-Consulta
//		-Inclusão
//		-Remoção
//		-Retorno da quantidade de professores
//		-Limpar lista	
	
	private String []nomeProfessor;
	private String email;
	private String disciplina;

	public ProfessorUcsal(String[] nomeProfessor, String email, String disciplina) {
		this.nomeProfessor = nomeProfessor;
		this.email = email;
		this.disciplina = disciplina;
	}
	
	
	public void limpaListaProfessor(String[] nomeProfessor) {
	}
	public void removerProfessor(String[] nomeProfessor) {
	}
	public String addProfessor(String nomeProfessor) {
		return nomeProfessor;
	}
	public String addEmail(String email) {
		return email;
	}
	public String disciplina(String disciplina) {
		return disciplina;
	}
	public int quantudadeProfessor( String[] nomeprofessor) {
		this.nomeProfessor = nomeprofessor;
		int quantidade = 0;
		return quantidade;
	}
	public String[] getNomeprofessor() {
		return nomeProfessor;
	}
	
	public void setNomeprofessor(String[] nomeprofessor) {
		this.nomeProfessor = nomeprofessor;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
	
	
}
