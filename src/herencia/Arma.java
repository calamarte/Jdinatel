package herencia;

public interface Arma {

    void golpear();

    default Integer cosa(){
        return null;
    }
}
