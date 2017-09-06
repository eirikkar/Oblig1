/**
 * @author (Eirik Karlsen)
 * Class for a given person
 */
public class Person
{
    // Fields
    private String name;
    private boolean isOnline;
    /**
     * Constructor for Person class, takes name as parameter
     * @param The persons name
     */
    public Person(String name)
    {
        isOnline = false;
        this.name = name;
    }
    /**
     * Getter for name of person
     * @return Name of person
     */
    public String getName () {
        return name;
    }
    /**
     * Getter for state of person
     * isOnline true/false
     * @return state of person
     */
    public boolean getIsOnline() {
        return this.isOnline;
    }
    /**
     * setter for isOnline
     * sets isOnline true/false
     */
    public void setIsOnline () {
        if (!isOnline) {
            isOnline = true;
        }
        else {
            isOnline = false;
        }
        
        this.isOnline = isOnline;
    }
    /**
     * Method for receving messages and print message.
     * Checks online status and sets status.
     * @param message
     */
    public void receiveMessage(Message message) {
        String onlineStatus;
        if (message.getSender().getIsOnline()){
            onlineStatus = ("Online");
        }
        else {  
            onlineStatus = ("Offline");
        }
        System.out.println("From: " + message.getSender().getName() +" (" + onlineStatus + ")");
        System.out.println("To: " + name);
        System.out.println("Message:");
        System.out.println(message.getMessage());
    }
}
