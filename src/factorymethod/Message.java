package factorymethod;

public abstract class Message {

    public abstract String getContent();

    public void addDefaultHeaders() {
        //adds some default header
    }

    public void encrypt() {
        //has some code to encrypt the content
    }
}
