package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.result.PageResult;

import java.util.List;

public interface SetmealService {
    /**
     * create new setmeal and save relationship of setmeal with dishes
     * @param setmealDTO
     */
    void saveWithDish(SetmealDTO setmealDTO);

    /**
     * query setmeal by page
     * @param setmealPageQueryDTO
     * @return
     */
    PageResult pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);

    /**
     * delete setmeal in batch
     * @param ids
     */
    void deleteBatch(List<Long> ids);
}
