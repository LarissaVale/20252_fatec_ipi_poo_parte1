public class LivroDeNotas{
    //variavel de referencia e instancia
    //classe é uma descriçao 
    
    private String disciplina; //encapsulamento

    //construtor
    //"método construtor" n existe
    public LivroDeNotas(String d){
        this.setDisciplina(disciplina); //atributo
    }

    public void setDisciplina(String disciplina){
        if(disciplina.length() >= 3)
        this.disciplina = disciplina;
    }

    public String getDisciplina(){
        return disciplina;
    }
    
    //primitivas: int, long, double. Começa com letra minuscula 
    public void exibirMensagem(){ //metodo
        System.out.println("Bem vindo ao livro de " + disciplina);

    }


}