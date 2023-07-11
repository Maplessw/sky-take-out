package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.result.Result;
import com.sky.vo.DishVO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface DishService {

    /**
     * 新增菜品和对应的口味
     * @param dishDTO
     * @return
     */
    void saveWithFlavor(DishDTO dishDTO);

    /**
     * 菜品分页查询
     * @param dishPageQueryDTO
     * @return
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 菜品批量删除
     * @param ids
     * @return
     */
    void deleteBatch(List<Long> ids);

    /**
     * 根据id查询菜品及口味数据
     * @return
     */
    DishVO getByIdWithFlavor(Long id);

    /**
     * 根据Id修改菜品基本信息和对应的口味信息
     * @param dishDTO
     */
    void updateWithFlavor(DishDTO dishDTO);

    /**
     * 启用禁用菜品
     * @param status
     * @param id
     */
    void startOrStop(int status, Long id);
}
