package chat.server;

import chat.common.*;

/**
 * @author EKPARK
 */

public class ChatServer {
	// chat server class 
	ChatCommon com = null;
	ChatUtil util = null;
	public ChatServer() {
		com = new ChatCommon();
		util = new ChatUtil();
		System.out.println("Chat Server created");
	}
}
