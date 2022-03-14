public class FILO {
    private nodo inicioF;

    public FILO() {
        this.inicioF = null;
    }

    public void pushFILO(String dato){
        nodo temp = this.inicioF;
        if(this.inicioF  == null){
            this.inicioF = new nodo(dato);
        }
        else{
            while(temp.getSig()!= null){
                temp = temp.getSig();
            }
            nodo nuevo = new nodo(dato);
            temp.setSig(nuevo);
        }
    }

    public String popFILO(){
        nodo temp = this.inicioF;
        while(temp.getSig()!=null){
            if(temp.getSig().getSig()==null){
                System.out.println("quitamos: "+temp.getSig().getInfo());
                temp.setSig(null);
                break;
            }
            temp = temp.getSig();
        }
        return (temp.getInfo());
    }

    public void imprimeFILO(){
        nodo temp = this.inicioF;
        while(temp!= null){
            System.out.println(temp.getInfo());
            temp = temp.getSig();
        }
    }

}
