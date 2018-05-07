/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaksiondemo;

import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author AR Istaik
 */
public class JaksionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
        ObjectMapper mapper = new ObjectMapper();
        List<Pojo> li = new ArrayList();
        li.add(new Pojo("arif"));
        li.add(new Pojo("atik"));
        String jsonString =mapper.writeValueAsString(li);
        System.out.println(jsonString);
       }catch(Exception e){
        e.printStackTrace();
       }
    }
    
}
