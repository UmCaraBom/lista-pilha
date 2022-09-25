package pilha;

public class inscritos{
    private String sexo;
    private int idade;

    //criando construtor
    public inscritos(){
        this.sexo = sexo;
        this.idade = idade;
    }
    //criando getters e setters
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    //criando método para gerar 50 inscritos, 30 Masculino e 20  com sexo e idade entre 19 e 40 anos
    public void gerarInscritos(){
        for(int i = 0; i < 50; i++){
            if(i < 30){
                this.sexo = "Masculino";
                this.idade = (int)(Math.random() * 40 + 1);
            }
            else{
                this.sexo = "Feminino";
                this.idade = (int)(Math.random() * 40 + 1);
            }
        }
    }
}