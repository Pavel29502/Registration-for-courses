package ru.english.registration_for_courses.service;

import java.util.List;
import java.util.UUID;

public interface BaseCrudService<T> {
    T save(T entity);

    List<T> findAll();

    T findById(UUID id);
    public T update(T entity);
    public void delete(UUID id);
}


