package com.itschool.library.services;

import models.dtos.RequestBookDTO;
import models.dtos.ResponseBookDTO;

public interface BookService {
    ResponseBookDTO createBook(RequestBookDTO requestBookDTO);
}
