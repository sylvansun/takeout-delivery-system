package com.sky.service;

import com.sky.dto.SetmealDTO;

public interface SetmealService {
    /**
     * create new setmeal and save relationship of setmeal with dishes
     * @param setmealDTO
     */
    void saveWithDish(SetmealDTO setmealDTO);
}
