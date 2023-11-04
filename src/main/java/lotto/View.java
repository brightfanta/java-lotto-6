package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class View {

    public static String getUserInput() {
        String userInput = Console.readLine();
        System.out.println();
        return userInput;
    }

    public static void printMessage(Notice notice) {
        System.out.println(notice.getMessage());
    }

    public static void printLotteryCount(Integer lotteryCount) {
        System.out.println(lotteryCount + "개를 구매했습니다.");
    }

    public static void printLotteryNumbers(List<Integer> numbers) {
        System.out.println(numbers);
    }

    public static void printPrize(Rank rank, Integer rankCount) {
        System.out.println(rank.getMatchingCount() + "개 일치 (" + rank.getPrize() + ") - " + rankCount +"개");
    }

    public static void print2ndRankPrize(Rank rank, Integer rankCount) {
        System.out.println(rank.getMatchingCount() + "개 일치, 보너스 볼 일치 (" + rank.getPrize() + ") - " + rankCount +"개");
    }
}
