package spittr.web;

import java.util.List;

public interface SpittleRepository {

   List<Spittle> findSpittles(Long max, int count);
   Spittle findOne(Long id);
    
}
