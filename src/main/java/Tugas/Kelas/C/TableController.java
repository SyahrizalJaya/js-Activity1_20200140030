/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.Kelas.C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author JAYA
 */
@Controller
public class TableController {
    
    @RequestMapping("/dataktp")
    public String getTable(Model tiki){
        
        
        ArrayList<List<String>> data = new ArrayList();
        
        data.add(Arrays.asList("1", "Rizal", "737122016","Takalar"));
        data.add(Arrays.asList("2", "Muhammad", "737112002","Pare-pare")); 
        data.add(Arrays.asList("3", "Jaya", "737112003","Makassar"));
        data.add(Arrays.asList("4", "Ahmad", "737112002","Jakarta"));   
        data.add(Arrays.asList("5", "Nur", "737102000","Bandung"));   
        data.add(Arrays.asList("6", "Rial", "737101998","Yogyakarta"));
        data.add(Arrays.asList("7", "Ramadhan", "737101991","Surabaya"));
        data.add(Arrays.asList("8", "Ilham", "737112002","Denpasar"));
        data.add(Arrays.asList("9", "Anggi", "737101993","Lombok"));
        data.add(Arrays.asList("10", "Arya", "737091984","Jayapura"));
        data.add(Arrays.asList("11", "Mega", "737122013","Balikpapan"));
        data.add(Arrays.asList("12", "Pratama", "737112009","Kendari"));
        data.add(Arrays.asList("13", "Awal", "737122019","Manado"));
        data.add(Arrays.asList("14", "Adel", "737091981","Gorontalo"));
        data.add(Arrays.asList("15", "Udin", "737112005","Palu"));
        data.add(Arrays.asList("16", "Budi", "737122011","Banjarmasin"));
        data.add(Arrays.asList("17", "Siti", "737101999","Padang"));
        data.add(Arrays.asList("18", "Jojo", "737112008","Indramayu"));
        data.add(Arrays.asList("19", "Sinta", "737081976","Palembang"));
        data.add(Arrays.asList("20", "Dodo", "737081979","Bengkulu"));
        tiki.addAttribute("table", data);
        
        return "table";
    }
}
