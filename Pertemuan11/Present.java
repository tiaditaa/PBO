package Pertemuan11;

public class Present {
    private Uncle giver;
    private Niece recipient;
    private String description;

    public Present(Uncle giver, Niece recipient, String description) {
        this.giver = giver;
        this.recipient = recipient;
        this.description = description;
    }

    public Uncle getGiver() {
        return giver;
    }

    public Niece getRecipient() {
        return recipient;
    }

    public String getDescription() {
        return description;
    }

    public void displayPresent() {
        System.out.println("Giver: " + giver.getName());
        System.out.println("Recipient: " + recipient.getName());
        System.out.println("Description: " + description);
    }
}