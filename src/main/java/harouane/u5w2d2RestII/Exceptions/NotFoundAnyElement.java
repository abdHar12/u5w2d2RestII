package harouane.u5w2d2RestII.Exceptions;

public class NotFoundAnyElement extends RuntimeException{
    public NotFoundAnyElement(){
        super("Nessun elemento è stato trovato");
    }
}
