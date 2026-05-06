package tw.org.dtcss.convert;

import java.util.List;

import org.mapstruct.Mapper;

import tw.org.dtcss.pojo.DTO.addEntityDTO.AddCheckinRecordDTO;
import tw.org.dtcss.pojo.DTO.putEntityDTO.PutCheckinRecordDTO;
import tw.org.dtcss.pojo.VO.CheckinRecordVO;
import tw.org.dtcss.pojo.entity.CheckinRecord;
import tw.org.dtcss.pojo.excelPojo.AttendeesExcel;
import tw.org.dtcss.pojo.excelPojo.CheckinRecordExcel;

@Mapper(componentModel = "spring")
public interface CheckinRecordConvert {

	CheckinRecord addDTOToEntity(AddCheckinRecordDTO addCheckinRecordDTO);

	CheckinRecord putDTOToEntity(PutCheckinRecordDTO putCheckinRecordDTO);

	CheckinRecordVO entityToVO(CheckinRecord checkinRecord);

	List<CheckinRecordVO> entityListToVOList(List<CheckinRecord> checkinRecordList);

	CheckinRecordExcel attendeesExcelToCheckinRecordExcel(AttendeesExcel attendeesExcel);
	
}
