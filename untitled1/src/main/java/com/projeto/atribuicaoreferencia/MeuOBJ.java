package com.projeto.atribuicaoreferencia;

public class MeuOBJ {

     Integer num;

    @Override
    public String toString() {
        return this.num.toString();
    }

    public MeuOBJ(Integer num) {
        this.num = num;
    }

    public void setnum(Integer num){
         this.num = num;


     }
}
