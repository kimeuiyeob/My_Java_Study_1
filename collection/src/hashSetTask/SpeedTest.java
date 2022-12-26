package hashSetTask;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class SpeedTest {
	public static void main(String[] args) {
		final int SIZE = 10_000_000;
		final List<Integer> arrayList = new ArrayList<Integer>(SIZE);
		final Set<Integer> hashSet = new HashSet<Integer>(SIZE);
		final int DATA = 7_133_401;
		
		IntStream.range(0, SIZE).forEach(value -> {
			arrayList.add(value);
			hashSet.add(value);
		});
		
		Instant start = Instant.now();
		arrayList.contains(DATA);
		Instant end = Instant.now();
		long elapsedTime = Duration.between(start, end).toMillis();
		System.out.println("arrayList : " + elapsedTime * 0.001 + "초");
		
		start = Instant.now();
		hashSet.contains(DATA);
		end = Instant.now();
		elapsedTime = Duration.between(start, end).toMillis();
		System.out.println("hashSet : " + elapsedTime * 0.001 + "초");
	}
}

















