package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.result.Result;
import org.springframework.web.bind.annotation.RequestBody;

public interface DishService {

    /**
     * 新增菜品和对应的口味
     * @param dishDTO
     * @return
     */
    void saveWithFlavor(DishDTO dishDTO);

}
