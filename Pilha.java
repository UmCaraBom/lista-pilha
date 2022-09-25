package pilha;

public class Pilha{
    private ListaLigada lista;

    //criando super construtor
    public Pilha(){
        this.lista = new ListaLigada();
    }
   //criar método para inserir inscritos no topo da pilha
    public void inserirTopo(inscritos inscrito){
        lista.inserirTopo(inscrito);
    }
    //criar método para mostrar inscrito no topo da pilha
    public inscritos mostrarTopo(){
        return lista.mostrarTopo();
    }
    //criar método para remover inscrito do topo da pilha
    public void removerTopo(){
        lista.removerTopo();
    }
}