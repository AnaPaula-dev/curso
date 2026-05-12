package Estudo.EstruturaDeDados.Fila;

public class NoFila {
    private Object object;
    private NoFila refNo = null;  // ✅ tipo NoFila

    public NoFila() {
    }

    public NoFila(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public NoFila getRefNo() {        // ✅ tipo NoFila
        return refNo;
    }

    public void setRefNo(NoFila refNo) {  // ✅ tipo NoFila
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + object +
                '}';
    }
}