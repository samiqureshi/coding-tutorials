import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.json.JSONException;
import org.json.JSONObject;

import Characters.Character;
import Characters.SamCharacter;
import Utilities.Globals;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Choose Character");
        System.out.println("2 - Create Character");
        System.out.print("Enter Choice [1 or 2]");
        int choice = sc.nextInt();
        Character c1 = null;
        Character c2 = null;
        if(choice==1){
            c1 = loadCharacter();
            c2 = loadCharacter();
        }
        else{
            c1 = new SamCharacter();
            c2 = new SamCharacter();
        }
        
        c1.fight(c2);
    }

    public static Character loadCharacter(){
        File saveDir = new File(Globals.saveDir);
		List<File> characters = (List<File>) FileUtils.listFiles(saveDir, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
        for(int i = 0; i < characters.size(); i++){
            System.out.println(i + " - " + characters.get(i).getName());
        }
        System.out.print("Make your selection: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        File selected = new File(Globals.saveDir + File.separator + characters.get(choice));
        try {
            String jsonStr = FileUtils.readFileToString(selected, StandardCharsets.UTF_8);
            JSONObject jsonObj = new JSONObject(jsonStr);
            System.out.println();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return new SamCharacter();

    }

    public static void listSavedCharacters(){
        
    }
}
