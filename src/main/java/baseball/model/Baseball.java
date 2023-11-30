package baseball.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Baseball {

    public static final int MINIMUM_RANGE = 1;
    public static final int MAXIMUM_RANGE = 9;
    public static final int THREE_DIGIT_VALUE = 3;
    private final List<Integer> baseballNumbers;

    public Baseball(List<Integer> baseballNumbers) {
        validate(baseballNumbers);
        this.baseballNumbers = baseballNumbers;
    }

    private void validate(List<Integer> baseballNumbers) {
        validateLength(baseballNumbers);
        validateNotDuplicated(baseballNumbers);
        baseballNumbers.forEach(this::validateIsNaturalNumberInRange);
    }

    private void validateLength(List<Integer> baseballNumbers) {
        if (baseballNumbers.size() != THREE_DIGIT_VALUE) {
            throw new IllegalArgumentException("유효하지 않은 입력 : 3자리 숫자 입력 필요합니다.");
        }
    }

    private void validateIsNaturalNumberInRange(int number) {
        if (number < MINIMUM_RANGE || number > MAXIMUM_RANGE) {
            throw new IllegalArgumentException("유효하지 않은 입력 : 1부터 9까지의 자연수만 입력해야 합니다.");
        }
    }

    private void validateNotDuplicated(List<Integer> baseballNumbers) {
        Set<Integer> uniqueNumbers = new HashSet<>(baseballNumbers);

        if (uniqueNumbers.size() != THREE_DIGIT_VALUE) {
            throw new IllegalArgumentException("유효하지 않은 입력 : 중복된 숫자 입력은 불가합니다.");
        }
    }


}
