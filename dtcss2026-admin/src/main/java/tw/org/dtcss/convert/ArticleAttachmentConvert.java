package tw.org.dtcss.convert;

import org.mapstruct.Mapper;

import tw.org.dtcss.pojo.DTO.addEntityDTO.AddArticleAttachmentDTO;
import tw.org.dtcss.pojo.entity.ArticleAttachment;

@Mapper(componentModel = "spring")
public interface ArticleAttachmentConvert {
	ArticleAttachment addDTOToEntity(AddArticleAttachmentDTO addArticleAttachmentDTO);
}
