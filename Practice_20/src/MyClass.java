public class MyClass<T,V,K> {
    T t;
    V v;
    K k;
    public MyClass(T t, V v, K k){
        this.t = t;
        this.v = v;
        this.k = k;
    }
    public void printTypes(){
        System.out.println(
                t.getClass().toString() +
                v.getClass().toString() +
                k.getClass().toString());
    }
}
