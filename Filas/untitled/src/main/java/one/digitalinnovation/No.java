package one.digitalinnovation;

public class No <T>{

    private T object;
    private No<T> refNO;

    public No(){

    }
    public No(T Object){
        this.refNO = null;
    this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object)
    {this.object = object;
    }

    public No getRefNO() {
        return refNO;
    }

    public void setRefNO(No refNO) {
        this.refNO = refNO;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
