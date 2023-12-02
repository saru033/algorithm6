package schedule;

public class algo {	
	
	//우선순위와 학점에 따라 강의 정렬
	public static sch[] sort_subjects_by_priority_and_credit(sch[] a, int n) {
		sch c = new sch();
		for(int i = 0;i <n-1;i++){
			for( int j = 0;j<n-i-1;j++){
				if(a[j].importance < a[j+1].importance || a[j].importance == a[j+1].importance && a[j].credits < a[j+1].credits)
				{
					c = a[j];
					a[j] = a[j+1];
					a[j+1] = c;
				}
			}
		}
		return a;
		
	}
	
	//수강가능한 학점을 초과하지 않는 선에서 강의 일정 생성
	public static sch[] create_schedule_within_credits(sch[] a, int num_subjects, int target_credits) {
		
		//우선순위와 학점에 까라 강의 정렬
		a = sort_subjects_by_priority_and_credit(a,num_subjects);
		
    	sch list[] = new sch[10];
    	for(int i=0;i<list.length;i++)
    		list[i] = new sch();
    	
		//선택된 강의 및 총 학점
        int selected_count = 0;
        int total_credits = 0;
        
        //목표 학점을 초과하지 않는 선에서 선택
        for (int i = 0; i < num_subjects; i++) {
            if (total_credits + a[i].credits <= target_credits) {
            	
                // 시간이 겹치지 않으면 선택
                int overlap = 0;
                for (int j = 0; j < selected_count; j++) {
                    if ((a[i].start_time < list[j].end_time && a[i].end_time > list[j].start_time) &&(a[i].day.equals(list[j].day)) == true){
                        overlap = 1;
                        break;
                    }
                }
                
                if (overlap == 0) {
                    // 강의를 일정에 추가
                    list[selected_count] = a[i];
                    selected_count++;
                    total_credits += a[i].credits;
                }
            }
         }
        
        return list;
	}	
}
