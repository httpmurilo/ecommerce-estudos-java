import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.hamcrest.MatcherAssert.*;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

public class HealthCheckController {


    @Test(timeout = 3000)
    public void DadoQueAAplicacaoEstaNoArDeveSerRetornadoStatusCodeOk(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8089/actuator/health", String.class);
        int statusCode = response.getStatusCodeValue();
        Assert.assertEquals(200,statusCode);
        Assert.assertNotNull(response);
    }
}
