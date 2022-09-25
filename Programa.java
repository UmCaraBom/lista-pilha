package pilha;

public class Programa{

   
    public static void main(String[] args){
        Pilha pilha = new Pilha();

        //inserindo inscritos na pilha
        for(int i = 0; i < 50; i++){
            inscritos inscrito = new inscritos();
            inscrito.gerarInscritos();
            pilha.inserirTopo(inscrito);
        }
        //mostrando topo dos inscritos na pilha
        System.out.println("Inscrito no topo da pilha:");
        System.out.println("Sexo: " + pilha.mostrarTopo().getSexo());
        System.out.println("Idade: " + pilha.mostrarTopo().getIdade());
    }
}
 