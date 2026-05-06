package tw.org.dtcss.convert;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import tw.org.dtcss.enums.MemberCategoryEnum;
import tw.org.dtcss.enums.OrderStatusEnum;
import tw.org.dtcss.pojo.BO.MemberExcelRaw;
import tw.org.dtcss.pojo.DTO.AddGroupMemberDTO;
import tw.org.dtcss.pojo.DTO.AddMemberForAdminDTO;
import tw.org.dtcss.pojo.DTO.addEntityDTO.AddMemberDTO;
import tw.org.dtcss.pojo.DTO.putEntityDTO.PutMemberDTO;
import tw.org.dtcss.pojo.DTO.putEntityDTO.PutMemberForAdminDTO;
import tw.org.dtcss.pojo.VO.MemberOrderVO;
import tw.org.dtcss.pojo.VO.MemberTagVO;
import tw.org.dtcss.pojo.VO.MemberVO;
import tw.org.dtcss.pojo.entity.Member;
import tw.org.dtcss.pojo.excelPojo.MemberExcel;

@Mapper(componentModel = "spring")
public interface MemberConvert {

	Member addDTOToEntity(AddMemberDTO addMemberDTO);

	Member addGroupDTOToEntity(AddGroupMemberDTO addGroupMemberDTO);

	Member forAdminAddDTOToEntity(AddMemberForAdminDTO addMemberForAdminDTO);

	Member putDTOToEntity(PutMemberDTO putMemberDTO);
	
	Member putForAdminDTOToEntity(PutMemberForAdminDTO putMemberForAdminDTO);

	MemberVO entityToVO(Member member);

	List<MemberVO> entityListToVOList(List<Member> memberList);

	MemberTagVO entityToMemberTagVO(Member member);

	MemberOrderVO entityToMemberOrderVO(Member member);

	//實體類先轉成BO，這個BO之後要setStatus 手動塞入訂單狀態的
	MemberExcelRaw entityToExcelRaw(Member member);

	// BO對象轉成真正的Excel 對象
	@Mapping(target = "status", source = "status", qualifiedByName = "convertStatus")
	@Mapping(target = "category", source = "category", qualifiedByName = "convertCategory")
	MemberExcel memberExcelRawToExcel(MemberExcelRaw memberExcelRaw);

	@Named("convertStatus")
	default String convertStatus(Integer status) {
		return OrderStatusEnum.fromValue(status).getLabelZh();
	}

	@Named("convertCategory")
	default String convertCategory(Integer category) {
		return MemberCategoryEnum.fromValue(category).getLabelZh();
	}

}
