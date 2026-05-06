package tw.org.dtcss.convert;

import java.util.List;

import org.mapstruct.Mapper;

import tw.org.dtcss.pojo.DTO.addEntityDTO.AddOrdersItemDTO;
import tw.org.dtcss.pojo.DTO.putEntityDTO.PutOrdersItemDTO;
import tw.org.dtcss.pojo.VO.OrdersItemVO;
import tw.org.dtcss.pojo.entity.OrdersItem;

@Mapper(componentModel = "spring")
public interface OrdersItemConvert {

	OrdersItem addDTOToEntity(AddOrdersItemDTO addOrdersItemDTO);

	OrdersItem putDTOToEntity(PutOrdersItemDTO putOrdersItemDTO);
	
	OrdersItemVO entityToVO(OrdersItem ordersItem);
	
	List<OrdersItemVO> entityListToVOList(List<OrdersItem> ordersItemList);
	
}
