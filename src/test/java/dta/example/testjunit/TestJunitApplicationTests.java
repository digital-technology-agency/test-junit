package dta.example.testjunit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TestJunitApplicationTests {

    @LocalServerPort
    private Integer port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void contextLoads() throws Exception {
        final String url = format("http://localhost:%s", port);
        final String forObject = restTemplate.getForObject(url, String.class);
        assertThat(forObject).contains("Hi");
        Log("Test [contextLoads] - completed!");
    }

    private void Log(String msg, Object... args) {
        System.out.println(format(msg, args));
    }

}
