package unq.api.filter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import unq.api.controller.SurveyController;

/**
 * Created by mrivero on 17/9/16.
 */
public class ApiService {

   public static Logger LOGGER = LoggerFactory.getLogger(ApiService.class);

    public static void main(String[] args) {
        LOGGER.info("Starting services configuration");
        SurveyController.initSurveyEndopints();
        LOGGER.info("Finish services configuration");
    }


}