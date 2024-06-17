package com.shoppingwebapp.Dao;

import com.shoppingwebapp.DTO.OrderInfoDTO;

import com.shoppingwebapp.Model.Orderitem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
//oi.order_item_id ,m.username,od.contact_name ,od.payment_date ,od.payment_method , pd.price , p.name
public interface OrderItemRepository extends JpaRepository<Orderitem,Integer> {
    @Query( "SELECT new com.shoppingwebapp.DTO.OrderInfoDTO" +
            "(m.id, m.username,oi.date,od.payment_method, od.total_amount, oi.order_item_id, pd.price, pd.product_detail_id, pd.name, p.name)" +
            " FROM Member m " +
            " JOIN  m.order_detail od " +
            " JOIN  od.orderitem oi " +
            " JOIN  oi.productdetail pd " +
            " JOIN  pd.product p " +
//            "WHERE m.id = :memberId and od.payment_status = '已付款'" +
            "WHERE m.id = :memberId " +
            "ORDER BY oi.order_item_id  ")
    List<OrderInfoDTO> getOrderInfos(@Param("memberId") int id);
}
