package cardtest;

import java.io.IOException;


public class CardTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ApiServiceImpl  service = new ApiServiceImpl();
		service.callWechatSendMessages();
//		service.callWeChatUserList();
	}
	

}

