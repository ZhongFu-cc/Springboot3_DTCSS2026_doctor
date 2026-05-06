package tw.org.dtcss.validation.constraint;

import tw.org.dtcss.enums.FormFieldTypeEnum;
import tw.org.dtcss.pojo.DTO.FormFieldOptionDTO;

public interface HasFieldOptions {

	public FormFieldTypeEnum getFieldType();
	
	public FormFieldOptionDTO getOptions();
	
}
