package cardtest.dto;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class UserOpenId {

	@JSONField(name = "openid")
	private List<String> openIdList;

	public List<String> getOpenIdList() {
		return openIdList;
	}

	public void setOpenIdList(List<String> openIdList) {
		this.openIdList = openIdList;
	}
	
	
}
