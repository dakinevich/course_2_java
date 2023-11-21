public class MassiveBox<T>{
    T[] massive;

    public T[] getMassive() {
        return massive;
    }

    public void setMassive(T[] massive) {
        this.massive = massive;
    }
    public T getMassiveAt(int index) {
        return massive[index];
    }
}
