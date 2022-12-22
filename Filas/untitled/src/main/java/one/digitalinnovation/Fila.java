        package one.digitalinnovation;

        public class Fila <T> {

            private No<T> refNoEntrandaFila;

            public Fila(){
                this.refNoEntrandaFila =null;
            }

            public void enqueue(T object){
                No novoNo = new No(object);
                novoNo.setRefNO(refNoEntrandaFila);
                refNoEntrandaFila = novoNo;
            }

            public T dequeue(){
                if (!this.isEmpty()){
                    No primeiroNo = refNoEntrandaFila;
                    No noAuxiliar = refNoEntrandaFila;
                    while(true){
                        if (primeiroNo.getRefNO() != null){
                            noAuxiliar = primeiroNo;
                            primeiroNo = primeiroNo.getRefNO();
                        }else{
                            noAuxiliar.setRefNO(null);
                            break;
                        }
                    }
                    return(T) primeiroNo;
                }
                return null;
            }

            public T first(){
                if (!this.isEmpty()){
                    No primeiroNo = refNoEntrandaFila;
                    while(true){
                        if (primeiroNo.getRefNO() != null){
                            primeiroNo = primeiroNo.getRefNO();
                        }else{
                            break;
                        }
                    }
                    return(T) primeiroNo.getObject();
                }
                return null;
            }
            public boolean isEmpty(){
                return refNoEntrandaFila == null? true : false;
            }

            @Override
            public String toString() {
                String stringRetorno = "";
                No noAuxuliar = refNoEntrandaFila;
                if (refNoEntrandaFila != null){
        while (true){
            stringRetorno += "[No{objeto=" + noAuxuliar.getObject() + "}]--->";
            if (noAuxuliar.getRefNO() != null){
            noAuxuliar = noAuxuliar.getRefNO();

            }else {
                stringRetorno += "null";
                break;
            }

        }
                }else {
                    stringRetorno = "null";
                }

                return  stringRetorno;
            }
        }
