package tw.org.dtcss.convert;

import java.util.List;

import org.mapstruct.Mapper;

import tw.org.dtcss.pojo.DTO.addEntityDTO.AddOrdersDTO;
import tw.org.dtcss.pojo.DTO.putEntityDTO.PutOrdersDTO;
import tw.org.dtcss.pojo.VO.OrdersVO;
import tw.org.dtcss.pojo.entity.Orders;

@Mapper(componentModel = "spring")
public interface OrdersConvert {

	Orders addDTOToEntity(AddOrdersDTO addOrdersDTO);

	Orders putDTOToEntity(PutOrdersDTO putOrdersDTO);
	
	OrdersVO entityToVO(Orders orders);
	
	List<OrdersVO> entityListToVOList(List<Orders> ordersList);
	
}
