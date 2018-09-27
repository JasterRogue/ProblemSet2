public class Message {

    private String sender;
    private String recipient;
    private String text;

    public void setSender(String sender)
    {
        this.sender = sender;
    }

    public String getSender()
    {
        return sender;
    }

    public void setRecipient(String recipient)
    {
        this.recipient = recipient;
    }

    public String getRecipient()
    {
        return recipient;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public String getText()
    {
        return text;
    }

    public Message ()
    {
        this.sender = "Unknown Sender";
        this.recipient = "Unknown Recipient";
        this.text = "?????????";
    }

    public Message(String sender, String recipient)
    {
        this.sender = sender;
        this.recipient = recipient;
    }

    public String toString()
    {
        return "\nFrom: " + getSender() +
                "\nTo: " + getRecipient() +
                "\n\n" +   getText();
    }


}
