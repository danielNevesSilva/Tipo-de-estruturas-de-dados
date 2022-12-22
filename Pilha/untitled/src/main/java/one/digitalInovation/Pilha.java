package one.digitalInovation;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha(){
        this.refNoEntradaPilha = null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    //Referenciando topo da pilha

    public void Push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }


    //excluindo da pilha
    public No Pop() {
        if (!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
        }
        return null;
    }

    public boolean isEmpty(){
//
//        if (refNoEntradaPilha == null) {
//            return true;
//        }
// return false
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {

        String stringRetorno = "*---------\n";
        stringRetorno += " Pilha \n";
        stringRetorno += "--------*\n";

        No noAuxiliar = refNoEntradaPilha;

        while(true){
            if (noAuxiliar != null){
                stringRetorno +="[no{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar =noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "*===========\n";

        return stringRetorno;
    }
}
