package com.winocencio.labelpropertietest;

import java.util.*;

public class MessagesResourceBundle {
    private static final String BASE_NAME = "messages.";
    private static final List<String> TEMPLATES = Arrays.asList("documento1-pf", "documento2-pf","documento1-pj");
    private Map<String, Map<String, String>> allMessages;

    public MessagesResourceBundle() {
        allMessages = new HashMap<>();
        TEMPLATES.stream().map(template -> ResourceBundle.getBundle(BASE_NAME+template, Locale.ROOT))
                .forEach(bundle -> {
                    System.out.println("Propertie:" + bundle.getBaseBundleName());
                    Map<String, String> messages = new HashMap<>();
                    Collections.list(bundle.getKeys()).forEach(key ->{
                        System.out.println("Key: " + key + " Value: " + bundle.getString(key));
                        messages.put(key, bundle.getString(key));
                    });
                    allMessages.put(bundle.getBaseBundleName(), messages);
                });
    }

    public Map<String, String> getMessagesByTemplateId(String templateId) {
        return Collections.unmodifiableMap(allMessages.get(templateId));
    }
}
