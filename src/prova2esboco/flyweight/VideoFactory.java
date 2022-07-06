/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2esboco.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author HAPPY
 */
public class VideoFactory {
    
    private Map<String,Video> videos = new HashMap();
    
    public Video getVideo(String titulo, String conteudo){
        Video video;
        if(videos.containsKey(titulo)){
            video = videos.get(titulo);
        }else{
            videos.put(titulo, new VideoFlyweight(titulo,conteudo));
            video = videos.get(titulo);
        }
        return video;
    }
}
