package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishFlavorMapper {


    /**
     * 向口味表插入数据
     * @param flavorList
     */
    void insertBatch(List<DishFlavor> flavorList);
}
