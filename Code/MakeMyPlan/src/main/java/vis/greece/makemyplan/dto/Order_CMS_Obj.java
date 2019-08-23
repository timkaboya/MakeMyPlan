package vis.greece.makemyplan.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "order", namespace = "http://www.w3.org/1999/xml")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "order")
public class Order_CMS_Obj {

	private String title;
	private String type;
	private String aiosCode;
	private String greekText;
	private String englishText;
	private String step;
	private String percentage;
	private String speed;
	private String colour;
	private String status;
	private String cpe;
	private String stb;

	@XmlElement(name = "Internal_Title")
	public void setTitle(String title) {
		this.title = title;
	}

	@XmlElement(name = "Type")
	public void setType(String type) {
		this.type = type;
	}

	@XmlElement(name = "AIOS_code")
	public void setAiosCode(String aiosCode) {
		this.aiosCode = aiosCode;
	}

	@XmlElement(name = "Appweb_text")
	public void setGreekText(String greekText) {
		this.greekText = greekText;
	}

	@XmlElement(name = "Appweb_text_en")
	public void setEnglishText(String englishText) {
		this.englishText = englishText;
	}

	@XmlElement(name = "Step")
	public void setStep(String step) {
		this.step = step;
	}

	@XmlElement(name = "Percentage")
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	@XmlElement(name = "Speed")
	public void setSpeed(String speed) {
		this.speed = speed;
	}

	@XmlElement(name = "Colour")
	public void setColour(String colour) {
		this.colour = colour;
	}

	@XmlElement(name = "Order_status")
	public void setStatus(String status) {
		this.status = status;
	}

	@XmlElement(name = "CPE")
	public void setCpe(String cpe) {
		this.cpe = cpe;
	}

	@XmlElement(name = "STB")
	public void setStb(String stb) {
		this.stb = stb;
	}

	public String getTitle() {
		return title;
	}

	public String getType() {
		return type;
	}

	public String getAiosCode() {
		return aiosCode;
	}

	public String getGreekText() {
		return greekText;
	}

	public String getEnglishText() {
		return englishText;
	}

	public String getStep() {
		return step;
	}

	public String getPercentage() {
		return percentage;
	}

	public String getSpeed() {
		return speed;
	}

	public String getColour() {
		return colour;
	}

	public String getStatus() {
		return status;
	}

	public String getCpe() {
		return cpe;
	}

	public String getStb() {
		return stb;
	}

}