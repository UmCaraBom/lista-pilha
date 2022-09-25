package pilha;

public class Ponto{
    private inscritos valor;
    private Ponto proximo;

    //criando construtor para inserir valor ao ponto
    public Ponto(inscritos inscrito){
        this.valor = inscrito;
    }

    //criar getters e setters
    public inscritos getValor(){
        return valor;
    }
    public void setValor(inscritos valor){
        this.valor = valor;
    }
    public Ponto getProximo(){
        return proximo;
    }
    public void setProximo(Ponto proximo){
        this.proximo = proximo;
    }

    public inscritos getConteudo() {
        return null;
    } 
}