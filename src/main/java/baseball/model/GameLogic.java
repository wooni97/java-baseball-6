package baseball.model;

import java.util.*;

public class GameLogic {
    private Map<String, Integer> compareResult = new HashMap<>();
    /**
     * Player와 Computer의 숫자와 자리를 비교하고, 비교 결과를 Map에 반환하는 메서드
     *
     * @param playerNumbers
     * @param computerNumbers
     * @return 비교 결과를 담은 Map
     */
    public Map compareNumbers(List<Integer> playerNumbers, List<Integer> computerNumbers) {
        compareResult.put("strike", 0);
        compareResult.put("balls", 0);

        for (int i = 0; i < playerNumbers.size(); i++) {
            if (Objects.equals(playerNumbers.get(i), computerNumbers.get(i))) {
                compareResult.put("strike", compareResult.get("strike") + 1);
            } else if (computerNumbers.contains(playerNumbers.get(i))) {
                compareResult.put("balls", compareResult.get("balls") + 1);
            }
        }

        return compareResult;
    }
}
