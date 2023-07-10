package ru.yandex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sandbox {


    public void enterUits(Map<String, String> itemSerialsToSortingCellsMapping) {

        Map<String, List<String>> map = itemSerialsToSortingCellsMapping.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getValue,
                        e -> {
                            List<String> list = new ArrayList<>();
                            list.add(e.getKey());
                            return list;
                        },
                        (value, key) -> {
                            value.addAll(key);
                            return value;
                        })
                );

        var serialsGroupedBySortCell = new HashMap<String, List<String>>();
        for (var entry : itemSerialsToSortingCellsMapping.entrySet()) {
            String itemSerial = entry.getKey();
            String cell = entry.getValue();
            if (serialsGroupedBySortCell.containsKey(cell)) {
                serialsGroupedBySortCell.put(cell, new ArrayList<>());
            }
            serialsGroupedBySortCell.get(cell).add(itemSerial);
        }

        var i = 0;

//        for (Map.Entry<String, String> entry : itemSerialsToSortingCellsMapping.entrySet()) {
//            String sortCell = sortCellName.getText();
//            List<String> serials = serialsGroupedBySortCell.get(sortCell);
//
//            for (String serial : serials) {
//                Allure.step("Entering sn: " + sn + " cell: " + sortCell);
//                performInputInActiveElement(input, sn);
//            }
//
//            enterSuggestedPackType();
//        }
//        findNoTaskTextOrCancelledContainerInput();
//
//        while (i < itemSerialsToSortingCellsMapping.size()) {
//            var sortCell = sortCellName.getText();
//            var itemSerials = serialsGroupedBySortCell.get(sortCell);
//
//            for (var sn : itemSerials) {
//                Allure.step("Entering sn: " + sn + " cell: " + sortCell);
//                performInputInActiveElement(input, sn);
//                i++;
//            }
//
//            enterSuggestedPackType();
//        }
//
//        findNoTaskTextOrCancelledContainerInput();
    }
}
