package tw.org.dtcss.convert;

import org.mapstruct.Mapper;

import tw.org.dtcss.pojo.DTO.addEntityDTO.AddTagDTO;
import tw.org.dtcss.pojo.DTO.putEntityDTO.PutTagDTO;
import tw.org.dtcss.pojo.entity.Tag;

@Mapper(componentModel = "spring")
public interface TagConvert {

	Tag addDTOToEntity(AddTagDTO addTagDTO);
	
	Tag putDTOToEntity(PutTagDTO updateTagDTO);
	
}
