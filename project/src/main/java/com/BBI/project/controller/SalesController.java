package com.BBI.project.controller;

import com.BBI.project.model.ViewSales;
import com.BBI.project.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
@CrossOrigin
public class SalesController {

    @Autowired
    private SalesService salesService;

    @GetMapping("/get-all")
    public List<ViewSales> getAllTransaction(){
        return salesService.getAllTransaction();
    }
}
