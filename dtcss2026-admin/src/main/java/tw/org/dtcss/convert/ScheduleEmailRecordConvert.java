package tw.org.dtcss.convert;

import org.mapstruct.Mapper;

import tw.org.dtcss.pojo.DTO.addEntityDTO.AddScheduleEmailRecordDTO;
import tw.org.dtcss.pojo.entity.ScheduleEmailRecord;

@Mapper(componentModel = "spring")
public interface ScheduleEmailRecordConvert {

	ScheduleEmailRecord addDTOToEntity(AddScheduleEmailRecordDTO addScheduleEmailRecordDTO);

	ScheduleEmailRecord copyEntity(ScheduleEmailRecord scheduleEmailRecord);
	
}
