import dio.padroes.gof.SingletonEager;
import dio.padroes.gof.SingletonLazy;
import dio.padroes.gof.SingletonLazyHolder;

public class App {
    public static void main(String[] args) throws Exception {

        //Testes relacionados ao Desging Pattern Singleton:

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
    
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        lazy = SingletonLazy.getInstancia();
        System.out.println(eager);
    
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazyHolder);
    }
}
