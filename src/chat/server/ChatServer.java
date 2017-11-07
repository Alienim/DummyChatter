package chat.server;

import chat.common.*;

public class ChatServer {
	ChatCommon com = null;
	ChatUtil util = null;
	public ChatServer() {
		com = new ChatCommon();
		util = new ChatUtil();
		System.out.println("Chat Server created");
	}
}
