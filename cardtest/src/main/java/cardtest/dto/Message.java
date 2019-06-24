package cardtest.dto;

import com.alibaba.fastjson.annotation.JSONField;

public class Message {
	
	@JSONField(name = "touser")
	private String touser;
	
	@JSONField(name = "template_id")
	private String template_id;
	
	@JSONField(name = "url")
	private String url;
	
	@JSONField(name = "miniprogram")
	private MiniProgram miniprogram;
	
	@JSONField(name = "data")
	private Data data;

	public String getTouser() {
		return touser;
	}

	public void setTouser(String touser) {
		this.touser = touser;
	}

	public String getTemplate_id() {
		return template_id;
	}

	public void setTemplate_id(String template_id) {
		this.template_id = template_id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public MiniProgram getMiniprogram() {
		return miniprogram;
	}

	public void setMiniprogram(MiniProgram miniprogram) {
		this.miniprogram = miniprogram;
	}
	
}
