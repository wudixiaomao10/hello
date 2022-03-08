package com.carrysu.eatfood.mapper;
import com.carrysu.eatfood.entity.Eatfood;
public interface EatfoodMapper {
    Eatfood selectFood(String food);

    int addFood(Eatfood rf);

    int deleteFood(String food);

    int updateFood(Eatfood rf);

}
