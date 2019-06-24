package cardtest.dto;

import com.alibaba.fastjson.annotation.JSONField;

public class MiniProgram {

	@JSONField(name = "appid")
	private String appid;
	
	@JSONField(name = "pagepath")
	private String pagepath;

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getPagepath() {
		return pagepath;
	}

	public void setPagepath(String pagepath) {
		this.pagepath = pagepath;
	}

}
