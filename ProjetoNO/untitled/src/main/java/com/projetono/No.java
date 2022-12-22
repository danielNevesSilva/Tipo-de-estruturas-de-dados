package com.projetono;

public class No<T>{

    private T conteudo;
    private No<T> proximonNo;

    public No(T conteudo) {
        this.proximonNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public No<T> getProximonNo() {
        return proximonNo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public void setProximonNo(No<T> proximonNo) {
        this.proximonNo = proximonNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
