package inditex.indra.prices;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import inditex.indra.prices.aplicacion.service.TarifaService;
import inditex.indra.prices.infraestructura.config.PricesApplication;
import inditex.indra.prices.infraestructura.config.PricesApplicationConfig;
import inditex.indra.prices.infraestructura.db.repository.TarifaDboRepository;

@ContextConfiguration(classes = {PricesApplicationConfig.class, PricesApplication.class})
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PricesApplicationTests {
	private static final String END_POINT_PATH="/consultarTarifa";
	private final ObjectMapper objectMapper = new ObjectMapper();
	
	@LocalServerPort private int port;
	
	@Autowired private TestRestTemplate restTemplate;
	
	@Test
	void contextLoads() {
	}

	@Test
	@Sql({"/data.sql"})
	void test1() throws Exception {
		String json = "{\"idBrand\" : 1, \"idPoducto\":35455,\"fecha\":\"2020-06-14 10:00:00\"}";

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<String> request = new HttpEntity<String>(json, headers);
		
	    String res = restTemplate.postForObject("http://localhost:"+port+END_POINT_PATH, request, String.class);
	    JsonNode root = objectMapper.readTree(res);
	    assertThat(root.path("tipoPrecio").asInt()).isEqualTo(1);
	}

	@Test
	@Sql({"/data.sql"})
	void test2()  throws Exception {
		String json = "{\"idBrand\" : 1, \"idPoducto\":35455,\"fecha\":\"2020-06-14 16:00:00\"}";

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<String> request = new HttpEntity<String>(json, headers);
		
	    String res = restTemplate.postForObject("http://localhost:"+port+END_POINT_PATH, request, String.class);
	    JsonNode root = objectMapper.readTree(res);
	    assertThat(root.path("tipoPrecio").asInt()).isEqualTo(2);
	}
	
	@Test
	@Sql({"/data.sql"})
	void test3()  throws Exception {
		String json = "{\"idBrand\" : 1, \"idPoducto\":35455,\"fecha\":\"2020-06-14 21:00:00\"}";

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<String> request = new HttpEntity<String>(json, headers);
		
	    String res = restTemplate.postForObject("http://localhost:"+port+END_POINT_PATH, request, String.class);
	    JsonNode root = objectMapper.readTree(res);
	    assertThat(root.path("tipoPrecio").asInt()).isEqualTo(1);
	}
	
	@Test
	@Sql({"/data.sql"})
	void test4()  throws Exception {
		String json = "{\"idBrand\" : 1, \"idPoducto\":35455,\"fecha\":\"2020-06-15 10:00:00\"}";

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<String> request = new HttpEntity<String>(json, headers);
		
	    String res = restTemplate.postForObject("http://localhost:"+port+END_POINT_PATH, request, String.class);
	    JsonNode root = objectMapper.readTree(res);
	    assertThat(root.path("tipoPrecio").asInt()).isEqualTo(3);
	}
	
	@Test
	@Sql({"/data.sql"})
	void test5()  throws Exception {
		String json = "{\"idBrand\" : 1, \"idPoducto\":35455,\"fecha\":\"2020-06-16 21:00:00\"}";

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<String> request = new HttpEntity<String>(json, headers);
		
	    String res = restTemplate.postForObject("http://localhost:"+port+END_POINT_PATH, request, String.class);
	    JsonNode root = objectMapper.readTree(res);
	    assertThat(root.path("tipoPrecio").asInt()).isEqualTo(4);
	}
	
}
