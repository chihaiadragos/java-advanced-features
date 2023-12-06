package DesignPatternsAndGoodPractices.Coding.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServerConnection {
    private static ServerConnection INSTANCE;
    private List<String> servers;
    private ServerConnection() {
        this.servers = new ArrayList<>();
    }
    public static ServerConnection getINSTANCE(){
        if (INSTANCE == null) {
            INSTANCE = new ServerConnection();
        }
        return INSTANCE;
    }
    public boolean addServer(String server) {
        if (server != null && (server.startsWith("http.") || server.startsWith("https."))) {
            if (servers.contains(server)) {
                return false;
            }
            servers.add(server);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ServerConnection{" +
                "servers=" + servers +
                '}';
    }
    //downloading a list of servers, that names start from http.

    public List<String> getServersHttp() {
        List<String> serversHttp = new ArrayList<>();
        for (String server : servers) {
            if (server.startsWith("http.")) {
                serversHttp.add(server);
            }
        }
        return serversHttp;
    }

    //downloading a list of servers, that names start from https.
    public List<String> getServersHttps() {
        return servers.stream().filter(server -> server.startsWith("https.")).collect(Collectors.toList());
    }
}
