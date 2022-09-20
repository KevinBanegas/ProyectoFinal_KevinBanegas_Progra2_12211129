package Correo;

import java.io.FileOutputStream;
import java.io.InputStream;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;

public class TodosFolders {
    private Folder inbox;
    private Folder spam;
    private Folder eliminados;
    private Folder enviados;
    private String vacio;

    public TodosFolders(Folder inbox, Folder spam, Folder eliminados, Folder enviados) {
        this.inbox = inbox;
        this.spam = spam;
        this.eliminados = eliminados;
        this.enviados = enviados;
    }

    public Folder getInbox() {
        return inbox;
    }

    public void setInbox(Folder inbox) {
        this.inbox = inbox;
    }

    public Folder getSpam() {
        return spam;
    }

    public void setSpam(Folder spam) {
        this.spam = spam;
    }

    public Folder getEliminados() {
        return eliminados;
    }

    public void setEliminados(Folder eliminados) {
        this.eliminados = eliminados;
    }

    public Folder getEnviados() {
        return enviados;
    }

    public void setEnviados(Folder enviados) {
        this.enviados = enviados;
    }

    public Message[] getMensajesInbox() throws MessagingException{
        return inbox.getMessages();
    }
    
    public Message[] getMensajesSpam() throws MessagingException{
        return spam.getMessages();
    }
    
    public Message[] getMensajesEliminados() throws MessagingException{
        return eliminados.getMessages();
    }
    
    public Message[] getMensajesEnviados() throws MessagingException{
        return enviados.getMessages();
    }

    @Override
    public String toString() {
        return "TodosFolders{" + "inbox=" + inbox + ", spam=" + spam + ", eliminados=" + eliminados + ", enviados=" + enviados + '}';
    }
    
    public void partesCorreo(Part parte) {
        try {
            if (parte.isMimeType("multipart/*")) {
                Multipart mult;
                mult = (Multipart) parte.getContent();
                for (int i = 0; i < mult.getCount(); i++) {
                    partesCorreo(mult.getBodyPart(i));
                }
            } else {
                if (parte.isMimeType("text/tml")) {
                    guardarHTML(parte);
                } else {
                    vacio = (String) parte.getContent();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void guardarHTML(Part parte) {
        try {
            FileOutputStream fos = new FileOutputStream("./correo.html");
            InputStream is = parte.getInputStream();
            byte[] bytes = new byte[10 * 1000];
            int leido = 0;
            while ((leido = is.read(bytes)) > 0) {
                fos.write(bytes, 0, leido);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}