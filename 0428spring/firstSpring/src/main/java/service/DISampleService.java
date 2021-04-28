package service;

import org.springframework.stereotype.Service;

@Service
public class DISampleService {

    public String getDateMessage(Integer month, Integer day) {
        if(month == null || day == null) {
            return "現在日付は不明です。";
        }
        return "現在日付は、" + month +  "月" + day +  "日です。";
    }
}