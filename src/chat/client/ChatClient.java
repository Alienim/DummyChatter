package chat.client;

import chat.common.ChatCommon;
import chat.common.ChatUtil;
/**
 * Chat Client
 * 2017.11.09.
 * @author EKPARK
 */
public class ChatClient {
	// chat client class
	ChatCommon com = null; // common library
	ChatUtil util = null;  // utility
	/**
	 * create common lib object and utility object
	 * 생성
	 */
	public ChatClient() {
		com = new ChatCommon();
		util = new ChatUtil();
		System.out.println("ChatClient created");
	}
}
