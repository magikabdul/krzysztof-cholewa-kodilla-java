package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> list = new ArrayList<>();

        for (Integer l : numbers) {
            if (l % 2 == 0) {
                list.add(l);
            }
        }

        return list;
    }
}
