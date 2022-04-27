package com.caloriasStarWars.caloriasStarWars.service;

import com.caloriasStarWars.caloriasStarWars.dto.DishDTO;
import com.caloriasStarWars.caloriasStarWars.dto.IngredientDTO;
import com.caloriasStarWars.caloriasStarWars.dto.ResponseDTO;
import com.caloriasStarWars.caloriasStarWars.repository.DAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class DishServiceImpl implements DishService{
    @Autowired
    private DAO repo;

    public ResponseDTO calculate(DishDTO dish){
        ResponseDTO res= new ResponseDTO(dish);
        dish.getIngredientes().forEach(i-> i.setCalorias((int) (i.getPeso()*(repo.getElemento(i.getNombre()).getCalories())/100)));
        res.setTotalCalorias(dish.getIngredientes().stream().mapToInt(i->i.getCalorias()).sum());
        res.setMost(dish.getIngredientes().stream().max(new Comparator<IngredientDTO>() {
            @Override
            public int compare(IngredientDTO o1, IngredientDTO o2) {
                return o1.getCalorias() - o2.getCalorias();
            }
        }).orElse(null));
        return res;
    }

    @Override
    public List<ResponseDTO> calculate(List<DishDTO> dishes) {
        ArrayList<ResponseDTO> responsesDTO=new ArrayList<>();
        for (DishDTO dish : dishes) {
            responsesDTO.add(calculate(dish));
        }
        return responsesDTO;
    }

}
