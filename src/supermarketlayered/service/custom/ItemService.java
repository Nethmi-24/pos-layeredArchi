/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


package supermarketlayered.service.custom;

import java.util.List;
import supermarketlayered.dto.ItemDto;

/**
 *
 * @author Nethmi
 */
public interface ItemService {
       
    String addItem(ItemDto dto) throws Exception;
    String updateItem(ItemDto dto) throws Exception;
    String deleteItem(String id) throws Exception;
    ItemDto getItem(String id) throws Exception;
    List<ItemDto> getAllItem() throws Exception;
}
