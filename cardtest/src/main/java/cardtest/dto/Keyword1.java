package cardtest.dto;

import com.alibaba.fastjson.annotation.JSONField;

public class Keyword1 {

	@JSONField(name = "value")
	private String value;
	
	@JSONField(name = "color")
	private String color;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
