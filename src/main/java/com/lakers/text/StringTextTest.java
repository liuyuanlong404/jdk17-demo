package com.lakers.text;

/**
 * Created on 2023/2/20 16:54
 *
 * @author lakers
 */
public class StringTextTest {
    public static void main(String[] args) {
        String comment = "{\n" +
                "  \"req_data\": {\n" +
                "    \"text\": \"111111\\n\",\n" +
                "    \"image_ids\": [],\n" +
                "    \"mentioned_user_ids\": []\n" +
                "  }\n" +
                "}";
        System.out.println(comment);

        String newComment = """
                {
                  "req_data": {
                    "text": "111111",
                    "image_ids": [],
                    "mentioned_user_ids": []
                  }
                }
                """;
        System.out.println(newComment);
    }
}

