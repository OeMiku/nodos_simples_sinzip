import static java.awt.SystemColor.info;

public class FIFO {
    private nodo inicio;

    public FIFO() {
        this.inicio = null;
    }

    public void push(String dato){
        if(this.inicio== null){ // caso solo el primer nodo
            this.inicio = new nodo(dato);
        }
        else{ //caso de almenos un nodo en la lista
            nodo temp = this.inicio;
            while(temp.getSig() != null){
                temp = temp.getSig();
            }
            temp.setSig(new nodo(dato));
        }
    }

    public String pop(){
        if(this.inicio == null){
            System.out.println("la lista esta vacia");
            return null;
        }
        else{
            nodo temp = this.inicio;
            this.inicio = temp.getSig();
            return (temp.getInfo());
        }
    }

    public void imprimeFIFO(){
        nodo temp = this.inicio;
        while (temp != null){
            System.out.println(temp.getInfo());
            temp = temp.getSig();
        }
    }


}
