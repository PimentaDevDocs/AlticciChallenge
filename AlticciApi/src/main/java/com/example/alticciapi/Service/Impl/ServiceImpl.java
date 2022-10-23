package com.example.alticciapi.Service.Impl;

import com.example.alticciapi.Service.IService;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements IService {
    @Override
    public Long alticciSequence(Long index) {

        if (index < 0) return null;
        else if (index == 0) return 0L;
        if (index == 1 || index == 2) return 1L;
        else return alticciSequence(index - 3) + alticciSequence(index - 2);
    }
}
