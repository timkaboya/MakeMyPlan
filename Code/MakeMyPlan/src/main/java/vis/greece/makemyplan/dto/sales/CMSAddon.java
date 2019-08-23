package vis.greece.makemyplan.dto.sales;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@Document(collection="CMSAddons")
@JsonInclude(Include.NON_NULL)
public class CMSAddon implements Serializable{

	private String internalTitle;
	private String type;
	private String aiosCode;
	private String status;
	private String step;
	private String speed;
	private String greekDesc;
	private String enDesc;
	private String color;
	private String percentage;
	private String cpe;
	private String stb;


	/**
	 * 
	 */
	private static final long serialVersionUID = -8541816797250984902L;
}
