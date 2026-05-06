package tw.org.dtcss.convert;

import org.mapstruct.Mapper;

import tw.org.dtcss.pojo.DTO.addEntityDTO.AddPaperFileUploadDTO;
import tw.org.dtcss.pojo.DTO.putEntityDTO.PutPaperFileUploadDTO;
import tw.org.dtcss.pojo.entity.PaperFileUpload;

@Mapper(componentModel = "spring")
public interface PaperFileUploadConvert {

	PaperFileUpload addDTOToEntity(AddPaperFileUploadDTO addPaperFileUploadDTO);

	PaperFileUpload putDTOToEntity(PutPaperFileUploadDTO putPaperFileUploadDTO);
	
	
	
}
