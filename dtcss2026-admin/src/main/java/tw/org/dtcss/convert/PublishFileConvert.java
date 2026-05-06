package tw.org.dtcss.convert;

import org.mapstruct.Mapper;

import tw.org.dtcss.pojo.DTO.addEntityDTO.AddPublishFileDTO;
import tw.org.dtcss.pojo.DTO.putEntityDTO.PutPublishFileDTO;
import tw.org.dtcss.pojo.entity.PublishFile;

@Mapper(componentModel = "spring")
public interface PublishFileConvert {

	PublishFile addDTOToEntity(AddPublishFileDTO addPublishFileDTO);

	PublishFile putDTOToEntity(PutPublishFileDTO putPublishFileDTO);

}
