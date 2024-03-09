package com.programmingtechie.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import lombok.Getter;

import lombok.Setter;

import java.util.List;

import com.programmingtechie.orderservice.model.OrderLineItems;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OrderResponse {
   
    private Long id;
    private String orderNumber;
    private List<OrderLineItems> orderLineItemsList;
}
