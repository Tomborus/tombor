package org.kr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Sample {

    private String INITIAL_VALUE;

    public Sample(String initialValue) {
        INITIAL_VALUE = initialValue;
    }

    public String sampleValue(String key) {
        List<String> names = createList();
        modifyList(names);
        Map<String, String> namesMap = createMap();

        List<String> newNameList = names.stream()
                .filter(n -> n.contains(key))
                .collect(Collectors.toList()); // przekształca tablicę w listę

        if (newNameList.size() != 1) {
            throw new RuntimeException("Error, to many results");
        }

        return extractValue(namesMap, newNameList);//zwrot wyodrebnionej wartosci
    }

    private static List<String> createList() {
        List<String> names = new ArrayList<>();// zaimplementowana lista jako tablica
        names.add("Tomasz");
        names.add("Lucyna");
        names.add("Krystian");
        names.add("Piotr");
        return names;
    }

    private static Map<String, String> createMap() {
        Map<String, String> namesMap = new HashMap(); // kolekcja danych hm -nieposortowane elementy
        namesMap.put("Dad", "Piotr");
        namesMap.put("Kid", "Tomasz");
        namesMap.put("Mom", "Lucyna");
        namesMap.put("Kid", "Krystian");
        return namesMap;
    }

    private static String extractValue(Map<String, String> namesMap, List<String> newNameList) {
        return namesMap.entrySet().stream()
                .filter(x -> x.getValue().equals(newNameList.get(0)))
                .map(Map.Entry::getKey)
                .findFirst().orElseThrow(NoSuchElementException::new);
    }

    private void modifyList(List<String> names) {
        for (String name : names) {
            name = INITIAL_VALUE + ":" + name;
        }
    }
}
