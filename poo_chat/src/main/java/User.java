import java.util.ArrayList;
import java.util.HashMap;
import java.net.*;

public class User {

    private static String pseudo;

    public static Integer getTaille_pseudo() {
        return pseudo.length();
    }

    public static void add_session(Session session) {
        sessions.put(session.getPseudo_cible(),session);
    }

    public static HashMap<String,Session> sessions = new HashMap<>();

    public static HashMap<String,Agent> agents_actifs = new HashMap<>();

    public static void add_agent(Agent agent) {
        agents_actifs.put(agent.getPseudo(),agent);
    }


    public static void setPseudo(String Pseudo) {
        pseudo = Pseudo;
    }

    public static String getPseudo() {
        return pseudo;
    }

    private static int port ;

    public static int getPort() {
        return port;
    }

    public static void setPort(int port) {
        User.port = port;
    }
}
