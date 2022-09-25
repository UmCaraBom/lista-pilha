package pilha;

public class ListaLigada{
    private Ponto primeiro;
    private Ponto ultimo;
    private int tamanho;

    //criando construtor 
    public ListaLigada(){
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }
    //criando inserir no topo da pilha
    public void inserirTopo(inscritos inscrito){
        Ponto novoPonto = new Ponto(inscrito);
        if(tamanho == 0){
            primeiro = novoPonto;
            ultimo = novoPonto;
        }
        else{
            novoPonto.setProximo(primeiro);
            primeiro = novoPonto;
        }
        tamanho++;
    }
    //criando método para mostrar inscrito no topo da pilha
    public inscritos mostrarTopo(){
        if(tamanho == 0){
            System.out.println("Pilha vazia");
            return null;
        }
        else{
            return primeiro.getValor();
        }
    }
    //criando método para remover inscrito do topo da pilha
    public void removerTopo(){
        if(tamanho == 0){
            System.out.println("Pilha vazia");
        }
        else{
            primeiro = primeiro.getProximo();
            tamanho--;
        }
    }
    
   
}