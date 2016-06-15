package mvc;



import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class RestaurnatController {
	
	@Autowired
	private RestaurantDao restaurantDao;

	@RequestMapping(value = "/api/searchRestaurant", method = RequestMethod.POST)
	@ResponseBody
	public String find(@RequestParam String query) throws Exception {

		RestaurantModel restaurant = restaurantDao.findByQuery(query);
		System.out.println(restaurant);
		String result = restaurant.toString();
		System.out.println(result);
		return result;
	}

}
