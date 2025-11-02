package com.devassistant.ai;

import okhttp3.*;
import org.json.JSONObject;

public class OpenRouterClient {
    private static final String API_URL = "https://openrouter.ai/api/v1/chat/completions";
    private final String apiKey;

    public OpenRouterClient(String apiKey) {
        this.apiKey = apiKey;
    }

    public String askGPT(String prompt) throws Exception {
        OkHttpClient client = new OkHttpClient();

        JSONObject message = new JSONObject()
                .put("role", "user")
                .put("content", prompt);

        JSONObject body = new JSONObject()
                .put("model", "gpt-4o-mini")
                .put("messages", new org.json.JSONArray().put(message));

        Request request = new Request.Builder()
                .url(API_URL)
                .header("Authorization", "Bearer " + apiKey)
                .post(RequestBody.create(
                        body.toString(),
                        MediaType.parse("application/json")))
                .build();

        Response response = client.newCall(request).execute();
        String res = response.body().string();
        JSONObject jsonResponse = new JSONObject(res);

        return jsonResponse.getJSONArray("choices")
                .getJSONObject(0)
                .getJSONObject("message")
                .getString("content");
    }
}
