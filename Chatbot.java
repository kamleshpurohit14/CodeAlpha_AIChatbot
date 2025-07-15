import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // FAQs - Questions and Answers
        Map<String, String> faq = new HashMap<>();
        faq.put("hi", "Hello! How can I help you?");
        faq.put("hello", "Hi there! How can I assist you?");
        faq.put("what is your name", "I am CodeAlpha Chatbot.");
        faq.put("how can you help me", "I can answer your queries about our services.");
        faq.put("bye", "Goodbye! Have a nice day.");

        System.out.println("---------------------------------");
        System.out.println(" Welcome to CodeAlpha Chatbot!");
        System.out.println(" Type 'bye' to exit.");
        System.out.println("---------------------------------");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase().trim();

            if (input.equals("bye")) {
                System.out.println("Bot: " + faq.get("bye"));
                break;
            }

            boolean found = false;
            for (String question : faq.keySet()) {
                if (input.contains(question)) {
                    System.out.println("Bot: " + faq.get(question));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Bot: Sorry, I don't understand that.");
            }
        }

        scanner.close();
    }
}
