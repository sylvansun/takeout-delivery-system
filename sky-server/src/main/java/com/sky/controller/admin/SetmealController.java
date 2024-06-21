package com.sky.controller.admin;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.entity.Setmeal;
import com.sky.result.PageResult;
import com.sky.result.Result;
import com.sky.service.SetmealService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Setmeal Management
 */
@RestController
@RequestMapping("/admin/setmeal")
@Api(tags = "setmeal operations")
@Slf4j
public class SetmealController {

    @Autowired
    SetmealService setmealService;

    /**
     * create new setmeal
     */
    @PostMapping
    @ApiOperation("create new setmeal")
    public Result save(@RequestBody SetmealDTO setmealDTO) {
        setmealService.saveWithDish(setmealDTO);
        return Result.success();
    }

    /**
     * query setmeal by page
     * @param setmealPageQueryDTO
     * @return
     */
    @GetMapping("/page")
    @ApiOperation("query setmeal by page")
    public Result<PageResult> page(SetmealPageQueryDTO setmealPageQueryDTO) {
        PageResult pageResult = setmealService.pageQuery(setmealPageQueryDTO);
        return Result.success(pageResult);
    }

    @DeleteMapping
    @ApiOperation("delete setmeals in batch")
    public Result delete(@RequestParam List<Long> ids){
        setmealService.deleteBatch(ids);
        return Result.success();
    }
}
