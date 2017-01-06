package com.betaben.server;

import java.io.IOException;
import java.net.Socket;

import org.duckdns.crackedcrafters.zaneoblaneo.clientServerAPI.Client;

public class UserClient extends Client {

	private Main chat = null;

    public UserClient(Socket s, Main chat) throws IOException, NoSuchMethodException, SecurityException {
        super(s);
        this.chat = chat;
    }

    @Override
    public void onClientRecievedData(Object data) {
    	chat.write((String)data + "\n");
    }

    @Override
    public void onClientSentData(Object data) {

    }
	
}
