package tw.org.dtcss.convert;

import org.mapstruct.Mapper;

import tw.org.dtcss.pojo.DTO.addEntityDTO.AddInvitedSpeakerDTO;
import tw.org.dtcss.pojo.DTO.putEntityDTO.PutInvitedSpeakerDTO;
import tw.org.dtcss.pojo.entity.InvitedSpeaker;

@Mapper(componentModel = "spring")
public interface InvitedSpeakerConvert {

	InvitedSpeaker addDTOToEntity(AddInvitedSpeakerDTO addInvitedSpeakerDTO);

	InvitedSpeaker putDTOToEntity(PutInvitedSpeakerDTO putInvitedSpeakerDTO);
	
	
}
