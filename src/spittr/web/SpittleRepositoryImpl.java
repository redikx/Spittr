package spittr.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SpittleRepositoryImpl implements SpittleRepository {

    @Override
    public List<Spittle> findSpittles(Long max, int count) {
	List<Spittle> listspittle = new ArrayList<Spittle>();
	
	for (int i=0; i<count; i++) {
	    listspittle.add(new Spittle("Spittle init " + i ,new Date()));
	}
	return listspittle;
    }

}
