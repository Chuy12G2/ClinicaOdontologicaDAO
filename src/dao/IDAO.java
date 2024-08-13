package dao;

import java.util.List;

public interface IDAO<T> {
   T save(T t);
   T findById(int id);
   void update(T t);
   void delete(T t);
   List<T> findAll();
}
