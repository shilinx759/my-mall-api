package com.my.mall.api.admin.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.my.mall.api.mall.vo.OrderItemVO;
import com.my.mall.entity.NewBeeMallOrderAddress;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author slx
 * @time 15:43
 */
@Data
public class UpdateOrderDetailParam {
    @ApiModelProperty("订单ID")
    private Long orderId;

    @ApiModelProperty("订单号")
    private String orderNo;

    @ApiModelProperty("订单价格")
    private Integer totalPrice;

    @ApiModelProperty("订单支付状态码")
    private Byte payStatus;

    @ApiModelProperty("订单支付方式")
    private Byte payType;

    @ApiModelProperty("订单状态码")
    private Byte orderStatus;

    @ApiModelProperty("订单状态")
    private String orderStatusString;

    @ApiModelProperty("订单项列表")
    private List<OrderItemVO> newBeeMallOrderItemVOS;

    @ApiModelProperty("订单地址对象")
    private NewBeeMallOrderAddress orderAddress;

}
