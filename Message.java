
/**
 * @author (Eirik Karlsen)
 * Class for the message and the sender of message.
 */
public class Message
{
    // Fields
    public String messageBody;
    public Person sender;
    /**
     * Constructor for Message class, takes sender and messageBody as paremeter
     * @param The sender, and message
     */
    public Message(Person sender, String messageBody)
    {
        this.sender = sender;
        this.messageBody = messageBody;
    }
    /**
     * Getter for message
     * @return message content
     */
    public String getMessage () {
        return this.messageBody;
    }
    /**
     * Getter for sender
     * @return sender of message
     */
    public Person getSender () {
        return sender;
    }
}
