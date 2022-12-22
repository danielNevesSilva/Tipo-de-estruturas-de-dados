package Dio.DigitalInovation;

public class ListaCircular<T> {

    private No<T> Cabeca;
    private No<T> Cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.Cauda = null;
        this.Cabeca = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if (this.tamanhoLista == 0){
            this.Cabeca = novoNo;
            this.Cauda = this.Cabeca;
            this.Cabeca.setNoProximo(Cauda);
        }else{
            novoNo.setNoProximo(this.Cauda);
            this.Cabeca.setNoProximo(novoNo);
            this.Cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    private No<T> getNo(int index){
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");
        if (index == 0 ){
            return this.Cauda;
        }

        No<T> noAuxiliar = this.Cauda;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public void remove(int index) {
        if (index >= this.tamanhoLista)
        throw new IndexOutOfBoundsException("O Index é maior que o tamanho da lista");

        No<T> noAuxiliar = this.Cauda;
        if (index == 0 ){
            this.Cauda = this.Cauda.getNoProximo();
            this.Cabeca.setNoProximo(this.Cauda);
        }else if (index == 1){
            this.Cauda.setNoProximo(this.Cauda.getNoProximo().getNoProximo());
        }else{
            for (int i = 0; i < index; i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }

        this.tamanhoLista--;

    }
    public T get(int index){
        return this.getNo(index).getConteudo();
    }
    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;

    }
    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
      String strRetorno = "";

      No<T> noAuxuliar = this.Cauda;
      for (int i = 0; i< this.size(); i++){
          strRetorno += "[No{conteudo=" + noAuxuliar.getConteudo() + "}]--->";
          noAuxuliar = noAuxuliar.getNoProximo();
      }
      strRetorno += this.size() != 0 ? "(retorna ao inicio)" : "[]";

      return strRetorno;
    }
}
