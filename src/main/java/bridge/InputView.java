package bridge;

import camp.nextstep.edu.missionutils.Console;

import static bridge.ErrorMessage.*;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        try {
            int i = Integer.parseInt(Console.readLine());
            if(i < 3 || i > 20){
                throw new IllegalArgumentException(OUT_OF_RANGE.returnMessage());
            }
            return i;
        } catch (IllegalArgumentException e){
            if(e.getMessage().contains("[ERROR]")){
                throw e;
            }
            throw new IllegalArgumentException(IS_NOT_NUMBER.returnMessage());
        }
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        try {
            String s = Console.readLine();
            if(!(s.equals("U") || s.equals("D"))){
                throw new IllegalArgumentException(INVALID_MOVE.returnMessage());
            }
            return s;
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            throw e;
        }
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }
}
