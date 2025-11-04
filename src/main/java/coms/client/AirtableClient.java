package coms.client;

import coms.dto.AirtableResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AirtableClient {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String url = "http://localhost:3000/api/airtable/records/";

    public AirtableResponse getUser(String email) {
        return restTemplate.getForObject(url + "user?email=" + email, AirtableResponse.class);
    }
}
