package tw.org.dtcss.convert;

import org.mapstruct.Mapper;

import tw.org.dtcss.pojo.DTO.addEntityDTO.AddArticleDTO;
import tw.org.dtcss.pojo.DTO.putEntityDTO.PutArticleDTO;
import tw.org.dtcss.pojo.entity.Article;

@Mapper(componentModel = "spring")
public interface ArticleConvert {

	Article addDTOToEntity(AddArticleDTO insertArticleDTO);

	Article putDTOToEntity(PutArticleDTO updateArticleDTO);
	
	Article copyEntity(Article article);
	
}
