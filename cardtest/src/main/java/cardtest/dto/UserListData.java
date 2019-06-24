package cardtest.dto;

import com.alibaba.fastjson.annotation.JSONField;

public class UserListData {
	
	@JSONField(name = "total")
	private String total;
	
	@JSONField(name = "count")
	private String count;
	
	@JSONField(name = "next_openid")
	private String next_openid;
	
	@JSONField(name = "openId")
	private String[] openId;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getNext_openid() {
		return next_openid;
	}

	public void setNext_openid(String next_openid) {
		this.next_openid = next_openid;
	}

	public String[] getOpenId() {
		return openId;
	}

	public void setOpenId(String[] openId) {
		this.openId = openId;
	}

	@Override
	public String toString() {
		return "UserListData [total=" + total + ", count=" + count + ", next_openid=" + next_openid + ", openId="
				+ openId + "]";
	}
	
	
	
}
