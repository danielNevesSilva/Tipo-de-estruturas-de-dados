package Dio.DigitalInovation;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index) {
        return this.getno(index).getConteudo();
    }

    public void add(T elemento) {
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPreivio(ultimoNo);
        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }
        if (ultimoNo != null) {
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento) {
        NoDuplo<T> noAuxiliar = getno(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(noAuxiliar);

        if (novoNo.getNoProximo() != null) {
            novoNo.setNoPreivio(noAuxiliar.getNoPreivio());
            novoNo.getNoProximo().setNoPreivio(novoNo);
        } else {
            novoNo.setNoPreivio(ultimoNo);
            ultimoNo = novoNo;
        }
        if (index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getNoPreivio().setNoProximo(novoNo);
        }
        tamanhoLista++;

    }

    public void remove(int index) {
        if (index == 0) {
            primeiroNo = primeiroNo.getNoProximo();
            if (primeiroNo != null) {
                primeiroNo.setNoPreivio(null);
            }
        } else {
            NoDuplo<T> noAuxiliar = getno(index);
            noAuxiliar.getNoPreivio().setNoProximo(noAuxiliar.getNoProximo());
            if (noAuxiliar != ultimoNo) {
                noAuxiliar.getNoProximo().setNoPreivio(noAuxiliar.getNoProximo());
            } else {
                ultimoNo = noAuxiliar;
            }

        }
        this.tamanhoLista--;

    }

    private NoDuplo<T> getno(int index) {

        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public int size() {
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAxuliar = primeiroNo;

        for (int i = 0; i < size(); i++){
            strRetorno += "[No{ conteudo=" + noAxuliar.getConteudo() + "}]--->";
            noAxuliar = noAxuliar.getNoProximo();
        }
         strRetorno += "null";

        return strRetorno;
    }
}
