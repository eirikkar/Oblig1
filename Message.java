
/**
 * @author (Eirik Karlsen)
 * @version (1.0)
 */
public class Message
{
    // VARIABLER
    public String messageBody;
    public Person sender;
    /**
     * Konstruktør for Message klassen
     */
    public Message(Person sender, String messageBody)
    {
        this.sender = sender;
        this.messageBody = messageBody;
    }
    //GETTERS!
    public String getMessage () {
        return this.messageBody;
    }
    public Person getSender () {
        return sender;
    }
}
