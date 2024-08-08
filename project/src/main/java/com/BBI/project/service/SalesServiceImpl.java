package com.BBI.project.service;

import com.BBI.project.model.ViewSales;
import com.BBI.project.repository.ViewSalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesServiceImpl implements SalesService{

    @Autowired
    private ViewSalesRepository viewSalesRepository;

    @Override
    public List<ViewSales> getAllTransaction() {
        return viewSalesRepository.findAll();
    }
}
