package com.example.demo.Service;

import com.example.demo.Mapper.HelloMapper;
import com.example.demo.Model.HelloModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HelloService {

    private final HelloMapper dao;

    @Autowired
    public HelloService(HelloMapper dao) {
        this.dao = dao;
    }


	@Transactional
    public boolean insert(HelloModel model) {
        return dao.insert(model) > 0;
    }

    public HelloModel select(int id) {
        return dao.select(id);
    }

    public List<HelloModel> selectAll() {
        List<HelloModel> modelList = dao.selectAll();
        return modelList;
    }

    public boolean updateValue(HelloModel model) {
        return dao.updateValue(model) > 0;
    }

    public boolean delete(Integer id) {
        return dao.delete(id) > 0;
    }
}