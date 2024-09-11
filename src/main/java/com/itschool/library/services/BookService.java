package com.itschool.library.services;

import models.dtos.BookDTO;

public interface BookService {

    BookDTO createBook(BookDTO bookDTO);
}
