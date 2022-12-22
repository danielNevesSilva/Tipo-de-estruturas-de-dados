import one.digitalInovation.No;
import one.digitalInovation.Pilha;

public class Main {

    public static void main(String[] args) {
        Pilha minhaPinha = new Pilha();

        minhaPinha.Push(new No( 1));
        minhaPinha.Push(new No( 2));
        minhaPinha.Push(new No( 3));
        minhaPinha.Push(new No( 4));
        minhaPinha.Push(new No( 5));
        minhaPinha.Push(new No( 6));

        System.out.println(minhaPinha);
        System.out.println(minhaPinha.Pop());
        System.out.println(minhaPinha);
        System.out.println(minhaPinha.Pop());
        System.out.println(minhaPinha);

        minhaPinha.Push(new No( 66));
        System.out.println(minhaPinha);
    }

}
