package com.lakers.http;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;

/**
 * Created on 2023/2/21 09:52
 *
 * @author lakers
 */
public class HttpClientTest {

    public static void main(String[] args) throws Exception {
        HttpClient httpClient = HttpClient.newHttpClient();
        httpClientGet(httpClient);
        httpClientPost(httpClient);
    }

    public static void httpClientGet(HttpClient httpClient) throws URISyntaxException, IOException, InterruptedException {
        String url = "https://test-waka.api.waka2020.com/platform/areas/list/610300";
        HttpRequest request = HttpRequest.newBuilder(new URI(url))
                .header("User-Agent", "Java HttpClient")
                .header("Accept", "*/*")
                .timeout(Duration.ofSeconds(5L))
                .GET()
                .version(HttpClient.Version.HTTP_2).build();
        HttpResponse<String> httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        // HTTP允许重复的Header，因此一个Header可对应多个Value:
        //Map<String, List<String>> headers = httpResponse.headers().map();
        //for (String header : headers.keySet()) {
        //    System.out.println(header + ": " + headers.get(header).get(0));
        //}
        System.out.println(httpResponse.body());
    }

    public static void httpClientPost(HttpClient httpClient) throws URISyntaxException, IOException, InterruptedException {
        String url = "https://test-waka.api.waka2020.com/store/backstage/businessCat/statusUpdate";
        String body = """
                {
                    "id" : 55,
                    "status" : 0
                 }
                """;
        HttpRequest request = HttpRequest.newBuilder(new URI(url))
                // 设置Header:
                .header("Accept", "*/*").header("Content-Type", "application/json")
                // 设置token
                .header("Authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJtZWNoYSIsImV4cCI6MTY2ODQ3NzYyMSwidHlwZSI6IkFETUlOX1BMQVRGT1JNIiwiaWF0IjoxNjY4MzkxMjIxLCJ1c2VySWQiOjF9.ePYu42ZlTIfU0xRATDZUu-cSLlpqza0IsjSnwd-gkzQ")
                // 设置超时:
                .timeout(Duration.ofSeconds(5))
                // 设置版本:
                .version(HttpClient.Version.HTTP_2)
                // 使用POST并设置body
                .POST(HttpRequest.BodyPublishers.ofString(body, StandardCharsets.UTF_8))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
