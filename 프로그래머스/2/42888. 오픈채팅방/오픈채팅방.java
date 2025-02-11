import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution{
    // 닉네임이 최종적으로 변경된 것을 선택
    // 닉네임이 유저아이디 별로 관리
    // 전체 진행 record를 추적하면서 각 유저아이디별 최종 닉네임을 관리

    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (String r : record) {
            String[] sp = r.split(" ");


            switch (sp[0]) {
                case "Enter", "Change" ->{
                    map.put((sp[1]), sp[2]);
                }
            }
        }

        for (String r : record) {
            String[] sp = r.split(" ");


            switch (sp[0]) {
                case "Enter" ->{
                    list.add(map.get(sp[1]) + "님이 들어왔습니다.");
                }

                case "Leave" -> {
                    list.add(map.get(sp[1])+"님이 나갔습니다.");
                }
            }
        }
        return list.toArray(new String[0]);
    }
}
