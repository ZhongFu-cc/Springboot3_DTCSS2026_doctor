package tw.org.dtcss.convert;

import java.util.List;

import org.mapstruct.Mapper;

import tw.org.dtcss.pojo.DTO.addEntityDTO.AddSettingDTO;
import tw.org.dtcss.pojo.DTO.putEntityDTO.PutSettingDTO;
import tw.org.dtcss.pojo.VO.SettingVO;
import tw.org.dtcss.pojo.entity.Setting;

@Mapper(componentModel = "spring")
public interface SettingConvert {

	Setting addDTOToEntity(AddSettingDTO addSettingDTO);

	Setting putDTOToEntity(PutSettingDTO putSettingDTO);
	
	SettingVO entityToVO(Setting setting);
	
	List<SettingVO> entityListToVOList(List<Setting> settingList);
	
}
