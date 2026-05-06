package tw.org.dtcss.convert;

import org.mapstruct.Mapper;

import tw.org.dtcss.pojo.DTO.addEntityDTO.AddFormResponseDTO;
import tw.org.dtcss.pojo.VO.FormResponseVO;
import tw.org.dtcss.pojo.entity.FormResponse;

@Mapper(componentModel = "spring")
public interface FormResponseConvert {

    // 宣告默認映射 , 告訴 MapStruct 如何把 CommonStatusEnum → Integer
//    default Integer commonStatusEnumMapToInteger(CommonStatusEnum status) {
//        return status == null ? null : status.getValue();
//    }
	
	FormResponse addDTOToEntity(AddFormResponseDTO formResponseDTO);
	
	FormResponseVO entityToVO(FormResponse formResponse);
	
}
