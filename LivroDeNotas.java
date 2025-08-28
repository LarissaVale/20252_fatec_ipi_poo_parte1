public class LivroDeNotas{
    //variavel de referencia e instancia
    private String disciplina;

    public void setDisciplina(String d){
        disciplina = d;
    }
    
    //primitivas: int, long, double. Começa com letra minuscula 
    public void exibirMensagem(){
        System.out.println("Bem vindo ao livro de " + disciplina);

    }

}