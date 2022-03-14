public class nodo {
    private String info;
    private nodo sig;

    public nodo( String info) {
        this.info = info;
        this.sig = null;
    }

    public String getInfo(){
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public nodo getSig() {
        return sig;
    }

    public void setSig(nodo sig) {
        this.sig = sig;
    }
}
