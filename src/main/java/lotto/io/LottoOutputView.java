package lotto.io;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class LottoOutputView {

    public void printLottoPurchaseCount(int count) {
        System.out.println("\n" + count + "개를 구매했습니다.");
    }

    public void printLottoNumbers(List<Integer> numbers) {
        Collections.sort(numbers);
        System.out.println(numbers);
    }

    public void printWinningStatistics(Map<String, Integer> prize) {
        System.out.println("\n당첨 통계");
        System.out.println("---");
        System.out.println("3개 일치 (5,000원) - " + prize.get("fifth") + "개");
        System.out.println("4개 일치 (50,000원) - " + prize.get("fourth") + "개");
        System.out.println("5개 일치 (1,500,000원) - " + prize.get("third") + "개");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - " + prize.get("second") + "개");
        System.out.println("6개 일치 (2,000,000,000원) - " + prize.get("first") + "개");
    }

    public void printRateOfReturn(double rate) {
        rate = (double) Math.round(rate * 100) / 100;
        System.out.println("총 수익률은 " + rate + "%입니다.");
    }
}
