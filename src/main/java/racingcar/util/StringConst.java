package racingcar.util;

public enum StringConst {
	INPUT_CAR_NAME_MESSAGE("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)."),
	DELIMITER(","),
	INPUT_TURN_MESSAGE("시도할 회수는 몇회인가요?"),
	OUTPUT_DELIMITER(" : "),
	POSITION_DELEIMIER("-"),
	WINNER_DELIMITER(", "),
	WINNER_MESSAGE("가 최종 우승했습니다."),
	RESULT_MESSAGE("실행 결과"),
	ERROR_PREFIX("[ERROR]"),
	ERROR_NULL("[ERROR] 입력값은 NULL일 수 없습니다."),
	ERROR_BLANK("[ERROR] 입력값은 빈 입력일 수 없습니다."),
	ERROR_SIZE("[ERROR] 입력값의 크기는 5 초과일 수 없습니다."),
	ERROR_SPECIAL_CHAR("[ERROR] 입력값은 특수문자일 수 없습니다."),
	ERROR_DUPLICATE("[ERROR] 입력값은 중복될 수 없습니다."),
	ERROR_INT_NUM("[ERROR] 입력값은 문자일 수 없습니다."),
	ERROR_NEGATIVE("[ERROR] 입력값은 음수일 수 없습니다."),
	ERROR_NO_CAR("[ERROR] 쉼표를 기준으로 차가 한 대 이상 있어야 합니다."),
	REGEX_PATTERN("^[0-9|a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]+$"),
	ERROR_TURN_FLAG("-1");

	private final String value;

	StringConst(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}
