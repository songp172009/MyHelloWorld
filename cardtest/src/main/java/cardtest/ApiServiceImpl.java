package cardtest;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSON;

import cardtest.dto.Data;
import cardtest.dto.First;
import cardtest.dto.Keyword1;
import cardtest.dto.Keyword2;
import cardtest.dto.Message;
import cardtest.dto.MiniProgram;
import cardtest.dto.Remark;
import cardtest.dto.UserListData;

public class ApiServiceImpl {

	private static final String ACCESS_TOKEN = "22_wz5b6yxOD1vq0cZMyczqhK2CXTGlRk7SfzuUG_K8sV6Z7HRAuE1CUP60img8vwcVUjly8MPGxLhex22_dfZOkUk8ZOA52lE_toIAa_eW59SSVep6Z3lLJhYgxPHEqC-iBrY9mF6-08CeQzJjQWPdAAAUAT";
	private static final String MESSAGE_SEND_URL = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=" + ACCESS_TOKEN;
	private static final String USER_LIST_URL = "https://api.weixin.qq.com/cgi-bin/user/get?access_token=" + ACCESS_TOKEN;
	private static final String TEMPLATE_ID = "YgB08WW2VNGWHs0GIbLNLeTPp99Qn_ktoC8xvcOuZoE";
	private static final String MINIPROGRAM_ID = "wx459b25fcf8046626";
//	private List<String> userList = Arrays.asList("ozAvs5owBaZNv2hDRAaTAed66hOs", "ozAvs5pufQ7IEnUF213sjWofn8mg",
//			"ozAvs5qIJu8Z4h1ZjLgQASDbyCDw", "ozAvs5jVcH1tid-cuWsHrL9cU2Xo", "ozAvs5vVPUjXey-aTHpkiK1QmmCs",
//			"ozAvs5k8vureVc3qgBMH7HaORH5I", "ozAvs5mDSX3qTrPxAdw-eqDVc7T4",	"ozAvs5sE1dwKPeLCa7UYdbZzHaCg", 
//			"ozAvs5pAzEpkHaYFHDvxmum3n5-A", "ozAvs5k_AtokQAEv_yKx1-jfvsng", "ozAvs5nv_RkzOKsooGD_ASoRysEc", 
//			"ozAvs5hY2qdHvxc8Q2uuHIUM6AYE", "ozAvs5kGF34iCcTccptojEcp3mW0", "ozAvs5sJ-eNw0dxBxtg4u6T5-Dq0",
//			"ozAvs5kRyNvsPC9GXyvYP0_pQ0t8", "ozAvs5tZ5yLLCRmAUguHWdTBWSAE", "ozAvs5uBXXqfDvYKqQIRk8jSzBoQ");
	
	private List<String> userList1 = Arrays.asList("ozAvs5owBaZNv2hDRAaTAed66hOs");
	
	public void callWechatSendMessages() throws IOException, InterruptedException {
		String jsonStr = null;
		String response = null;
		for (int i = 0; i < 1; i++) {
			for (String userId : userList1) {

				Message message = constructMessage(userId);
				jsonStr = JSON.toJSONString(message);
				response = HttpClientUtils.sendPostJsonStr(MESSAGE_SEND_URL, jsonStr);
				System.out.println("Send Message response ---->" + response);
				Thread.sleep(800);
			}
			System.out.println("Message send cycle number ----> " + i);
		}

	}
	
	private Message constructMessage(String userId) {
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Message message = new Message();
		message.setTouser(userId);
		message.setTemplate_id(TEMPLATE_ID);
		message.setUrl("");
		
		MiniProgram miniprogram = new MiniProgram();
		miniprogram.setAppid(MINIPROGRAM_ID);
		miniprogram.setPagepath("");
		
		First first = new First();
		first.setValue("Test Message!");
		first.setColor("#173177");
		
		Keyword1 keyword1 = new Keyword1();
		keyword1.setValue(df.format(new Date()).toString());
		keyword1.setColor("#173177");
		
		Keyword2 keyword2 = new Keyword2();
		keyword2.setValue("Welcome to XXXX shopping mall!");
		keyword2.setColor("#173177");
		
		Remark remark = new Remark();
		remark.setValue("Click here!");
		remark.setColor("#173177");
		
		Data data = new Data();
		data.setFirst(first);
		data.setKeyword1(keyword1);
		data.setKeyword2(keyword2);
		data.setRemark(remark);
		
		message.setData(data);
		message.setMiniprogram(miniprogram);
		
		return message;
	}
	
	public void callWeChatUserList() {
		String response = HttpClientUtils.sendGet(USER_LIST_URL);
		JSON json = JSON.parseObject(response);
		UserListData userListData = JSON.toJavaObject(json, UserListData.class);
		System.out.println(response);
		System.out.println(userListData);
	}
	
}
