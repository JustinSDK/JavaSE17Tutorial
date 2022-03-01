package cc.openhome;

import java.util.ArrayList;

public class ClientQueue {
    private ArrayList clients = new ArrayList();
    private ArrayList listeners = new ArrayList();
            
    public void addClientListener(ClientListener listener) {
        listeners.add(listener);
    }
    
    public void add(Client client) {
        clients.add(client);
        var event = new ClientEvent(client);
        for(var i = 0; i < listeners.size(); i++) {
            var listener = (ClientListener) listeners.get(i);
            listener.clientAdded(event);
        }
    }
    
    public void remove(Client client) {
        clients.remove(client);
        var event = new ClientEvent(client);
        for(var i = 0; i < listeners.size(); i++) {
            var listener = (ClientListener) listeners.get(i);
            listener.clientRemoved(event);
        }
    }
}