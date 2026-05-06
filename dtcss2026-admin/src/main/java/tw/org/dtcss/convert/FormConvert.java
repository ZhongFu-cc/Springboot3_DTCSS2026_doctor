package tw.org.dtcss.convert;

import org.mapstruct.Mapper;

import tw.org.dtcss.enums.CommonStatusEnum;
import tw.org.dtcss.pojo.DTO.addEntityDTO.AddFormDTO;
import tw.org.dtcss.pojo.DTO.putEntityDTO.PutFormDTO;
import tw.org.dtcss.pojo.VO.FormVO;
import tw.org.dtcss.pojo.entity.Form;

@Mapper(componentModel = "spring")
public interface FormConvert {

    // 宣告默認映射 , 告訴 MapStruct 如何把 CommonStatusEnum → Integer
    default Integer commonStatusEnumMapToInteger(CommonStatusEnum status) {
        return status == null ? null : status.getValue();
    }
	
	Form addDTOToEntity(AddFormDTO addFormDTO);
	
	Form putDTOToEntity(PutFormDTO putFormDTO);
	
	FormVO entityToVO(Form form);
	
}
