import java.util.*;

/**
 * @author (Eirik Karlsen)
 * @version (1.0)
 */
public class Person
{
    // VARIABLER
    private String name;
    private boolean isOnline;
    /**
     * Konstruktør for Person klassen
     */
    public Person(String playerName)
    {
        isOnline = false;
        name = playerName;
    }
    // GETTERS!
    public String getName () {
        return name;
    }
    public boolean getIsOnline() {
        return this.isOnline;
    }
    // isOnline SETTER!
    public void setIsOnline () {
        if (!isOnline) {
            isOnline = true;
        }
        else {
            isOnline = false;
        }
        
        this.isOnline = isOnline;
    }
    // Metode for å motta meldinger
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
