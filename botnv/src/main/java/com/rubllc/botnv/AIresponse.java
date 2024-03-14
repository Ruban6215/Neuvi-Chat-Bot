package  com.rubllc.botnv;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.huggingface.HuggingFaceChatModel;
import dev.langchain4j.model.huggingface.HuggingFaceChatModel.Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class AIresponse{
    MainWindow obj = new MainWindow();
    List<String> list=new ArrayList<String>(){{
        add("emo1.mp3");
        add("emo2.mp3");
        add("emo3.mp3");
        add("emo4.mp3");
        add("emo5.mp3");
        add("emo6.mp3");
    }};
    Random rand = new Random();
    String vc;
    public String run(String request){
        String answer;
        try {
            HuggingFaceChatModel.Builder Build = new HuggingFaceChatModel.Builder();



           ChatLanguageModel model = HuggingFaceChatModel.withAccessToken("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");
           //model= new Builder().modelId("google/flan-t5-base").accessToken("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").build();
           answer = model.generate(request);
            vc=list.get(rand.nextInt(list.size()));
            obj.interact(vc);
           System.out.println(answer);
        } catch (Exception e) {
            System.out.println("Something went wrong \n"+e);
            obj.interact("apologies.mp3");
            answer="Something went wrong :(";
        }

        return answer;
    }


}
