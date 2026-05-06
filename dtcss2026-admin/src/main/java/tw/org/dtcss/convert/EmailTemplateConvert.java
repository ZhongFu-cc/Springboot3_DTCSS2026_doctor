package tw.org.dtcss.convert;

import org.mapstruct.Mapper;

import tw.org.dtcss.pojo.DTO.addEntityDTO.AddEmailTemplateDTO;
import tw.org.dtcss.pojo.DTO.putEntityDTO.PutEmailTemplateDTO;
import tw.org.dtcss.pojo.entity.EmailTemplate;

@Mapper(componentModel = "spring")
public interface EmailTemplateConvert {

	EmailTemplate insertDTOToEntity(AddEmailTemplateDTO addArticleDTO);

	EmailTemplate updateDTOToEntity(PutEmailTemplateDTO updateArticleDTO);
	
}
