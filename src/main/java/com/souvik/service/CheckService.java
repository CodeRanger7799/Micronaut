package com.souvik.service;

import com.souvik.model.CheckRequest;
import org.springframework.stereotype.Service;

@Service
public class CheckService {

    public CheckRequest getStatus(CheckRequest checkRequest){
         return new CheckRequest("UP",checkRequest.getLevel());
    }
}
