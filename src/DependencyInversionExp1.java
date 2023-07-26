
/**
 *SOLID Principles
 * SOLID is an acronym for the first five object-oriented design (ODD)
 * principles by Robert C. Martin
 *-----
 * S ->
 * O ->
 * L ->
 * I ->
 * D -> Dependency Inversion Principle -
 *              High level modules should not directly depend on low level modules,instead they should depend on abstraction.
 */

public class DependencyInversionExp1 {
    public static void main(String[] args) {

        MyMessenger myMessenger = new MyMessenger("TCP");
        myMessenger.send("XYZ","SOLID is easy");

    }
}

//Application Layer -- High level
class MyMessenger{

    ProtocolHandler handler;

    MyMessenger(String protocol){
        handler = ProtocolHandlerFactory.getProtocolHandler(protocol);
    }

    public void send(String to, String message){
        handler.sendMessage("message to - "+to+" , message - "+message);
    }
}

interface ProtocolHandler{
    void sendMessage(String message);
}

class TCPProtocolHandler implements ProtocolHandler{
    @Override
    public void sendMessage(String message) {
        System.out.println("TCPProtocolHandler sending message - "+message);
    }
}
class UDPProtocolHandler implements ProtocolHandler{
    @Override
    public void sendMessage(String message) {
        System.out.println("UDPProtocolHandler sending message - "+message);
    }
}

class ProtocolHandlerFactory{
    public static ProtocolHandler getProtocolHandler(String protocol){

        if ("TCP".equalsIgnoreCase(protocol)){
            return new TCPProtocolHandler();
        }

        if ("UDP".equalsIgnoreCase(protocol)){
            return new UDPProtocolHandler();
        }
        return null;
    }
}
