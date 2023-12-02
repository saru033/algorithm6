package schedule;


// 입력한 값들을 저장하여 반환해주는 함수
public class Inputdata {
	public sch input(sch a,String name, String day, int start_time, int end_time, int credits, int importance) {
		a.name = name;
		a.day = day;
		a.start_time = start_time;
		a.end_time = end_time;
		a.credits = credits;
		a.importance = importance;			
		
		return a;
		
	}
}
