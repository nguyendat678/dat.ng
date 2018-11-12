package action;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Action  {
    
    private String date;
    private String paValue0;
    private String paValue1; 
    private String paValue2;
    
	private String psValue023;
	private String psValue024;
	private String psValue025;
	private String psValue026;
	private String psValue027;
	private String psValue028;
	private String psValue029;
	private String psValue030;
	
	
	private String psValue123;
	private String psValue124;
	private String psValue125;
	private String psValue126;
	private String psValue127;
	private String psValue128;
	private String psValue129;
	private String psValue130;
	
	
	private String psValue223;
	private String psValue224;
	private String psValue225;
	private String psValue226;
	private String psValue227;
	private String psValue228;
	private String psValue229;
	private String psValue230;
	
	
	
	private String paValue023;
	private String paValue024;
	private String paValue025;
	private String paValue026;
	private String paValue027;
	private String paValue028;
	private String paValue029;
	private String paValue030;

	private String paValue123;
	private String paValue124;
	private String paValue125;
	private String paValue126;
	private String paValue127;
	private String paValue128;
	private String paValue129;
	private String paValue130;

	private String paValue223;
	private String paValue224;
	private String paValue225;
	private String paValue226;
	private String paValue227;
	private String paValue228;
	private String paValue229;
	private String paValue230;
    

    private String server = "http://localhost:8081";
    private RestTemplate rest;
    private HttpHeaders headers;

    
    //dung de chuyen json sang object
    ObjectMapper mapper = new ObjectMapper();
    
    public Action() throws Exception {

        this.rest = new RestTemplate();
        this.headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "*/*");
        
        
      //Pa theo sheet 0,1,2
    	String Pa0= get("/0");
        String Pa1= get("/1");
        String Pa2= get("/2");
        
        List<Pa> ListPa0 = mapper.readValue(Pa0, new TypeReference<List<Pa>>(){});
        List<Pa> ListPa1 = mapper.readValue(Pa1, new TypeReference<List<Pa>>(){});
        List<Pa> ListPa2 = mapper.readValue(Pa2, new TypeReference<List<Pa>>(){});
        
        List<Double> paVale0 = new ArrayList<Double>();
        List<Double> paVale1 = new ArrayList<Double>();
        List<Double> paVale2 = new ArrayList<Double>();
        
        for(int i=0;i<ListPa0.size();i++){
            paVale0.add(ListPa0.get(i).getPa());
        }
        
        for(int i=0;i<ListPa1.size();i++){
            paVale1.add(ListPa1.get(i).getPa());
        }
        for(int i=0;i<ListPa2.size();i++){
            paVale2.add(ListPa2.get(i).getPa());
        }
        
        paValue0 = mapper.writeValueAsString(paVale0);
        paValue1 = mapper.writeValueAsString(paVale1);
        paValue2 = mapper.writeValueAsString(paVale2);

        
        //Ps theo sheet 0
        String Ps023 = get("/0/23/10/2016");
		String Ps024 = get("/0/24/10/2016");
		String Ps025 = get("/0/25/10/2016");
		String Ps026 = get("/0/26/10/2016");
		String Ps027 = get("/0/27/10/2016");
		String Ps028 = get("/0/28/10/2016");
		String Ps029 = get("/0/29/10/2016");
		String Ps030 = get("/0/30/10/2016");
		
		List<Double> psVale023 = new ArrayList<Double>();
		List<Double> psVale024 = new ArrayList<Double>();
		List<Double> psVale025 = new ArrayList<Double>();
		List<Double> psVale026 = new ArrayList<Double>();
		List<Double> psVale027 = new ArrayList<Double>();
		List<Double> psVale028 = new ArrayList<Double>();
		List<Double> psVale029 = new ArrayList<Double>();
		List<Double> psVale030 = new ArrayList<Double>();
		
		List<Min> ListPs023 = mapper.readValue(Ps023, new TypeReference<List<Min>>() {});
		List<Min> ListPs024 = mapper.readValue(Ps024, new TypeReference<List<Min>>() {});
		List<Min> ListPs025 = mapper.readValue(Ps025, new TypeReference<List<Min>>() {});
		List<Min> ListPs026 = mapper.readValue(Ps026, new TypeReference<List<Min>>() {});
		List<Min> ListPs027 = mapper.readValue(Ps027, new TypeReference<List<Min>>() {});
		List<Min> ListPs028 = mapper.readValue(Ps028, new TypeReference<List<Min>>() {});
		List<Min> ListPs029 = mapper.readValue(Ps029, new TypeReference<List<Min>>() {});
		List<Min> ListPs030 = mapper.readValue(Ps030, new TypeReference<List<Min>>() {});
	        
		for (int i = 0; i < ListPs023.size(); i++) {
			psVale023.add(ListPs023.get(i).getPs());
		}
		for (int i = 0; i < ListPs024.size(); i++) {
			psVale024.add(ListPs024.get(i).getPs());
		}
		for (int i = 0; i < ListPs025.size(); i++) {
			psVale025.add(ListPs025.get(i).getPs());
		}
		for (int i = 0; i < ListPs026.size(); i++) {
			psVale026.add(ListPs026.get(i).getPs());
		}
		for (int i = 0; i < ListPs027.size(); i++) {
			psVale027.add(ListPs027.get(i).getPs());
		}
		for (int i = 0; i < ListPs028.size(); i++) {
			psVale028.add(ListPs028.get(i).getPs());
		}
		for (int i = 0; i < ListPs029.size(); i++) {
			psVale029.add(ListPs029.get(i).getPs());
		}
		for (int i = 0; i < ListPs030.size(); i++) {
			psVale030.add(ListPs030.get(i).getPs());
		}
		
		psValue023 = mapper.writeValueAsString(psVale023);
		psValue024 = mapper.writeValueAsString(psVale024);
		psValue025 = mapper.writeValueAsString(psVale025);
		psValue026 = mapper.writeValueAsString(psVale026);
		psValue027 = mapper.writeValueAsString(psVale027);
		psValue028 = mapper.writeValueAsString(psVale028);
		psValue029 = mapper.writeValueAsString(psVale029);
		psValue030 = mapper.writeValueAsString(psVale030);
		
		
		

        //Ps theo sheet 1
        String Ps123 = get("/1/23/10/2016");
		String Ps124 = get("/1/24/10/2016");
		String Ps125 = get("/1/25/10/2016");
		String Ps126 = get("/1/26/10/2016");
		String Ps127 = get("/1/27/10/2016");
		String Ps128 = get("/1/28/10/2016");
		String Ps129 = get("/1/29/10/2016");
		String Ps130 = get("/1/30/10/2016");
		
		List<Double> psVale123 = new ArrayList<Double>();
		List<Double> psVale124 = new ArrayList<Double>();
		List<Double> psVale125 = new ArrayList<Double>();
		List<Double> psVale126 = new ArrayList<Double>();
		List<Double> psVale127 = new ArrayList<Double>();
		List<Double> psVale128 = new ArrayList<Double>();
		List<Double> psVale129 = new ArrayList<Double>();
		List<Double> psVale130 = new ArrayList<Double>();
		
		List<Min> ListPs123 = mapper.readValue(Ps123, new TypeReference<List<Min>>() {});
		List<Min> ListPs124 = mapper.readValue(Ps124, new TypeReference<List<Min>>() {});
		List<Min> ListPs125 = mapper.readValue(Ps125, new TypeReference<List<Min>>() {});
		List<Min> ListPs126 = mapper.readValue(Ps126, new TypeReference<List<Min>>() {});
		List<Min> ListPs127 = mapper.readValue(Ps127, new TypeReference<List<Min>>() {});
		List<Min> ListPs128 = mapper.readValue(Ps128, new TypeReference<List<Min>>() {});
		List<Min> ListPs129 = mapper.readValue(Ps129, new TypeReference<List<Min>>() {});
		List<Min> ListPs130 = mapper.readValue(Ps130, new TypeReference<List<Min>>() {});
	        
		for (int i = 0; i < ListPs123.size(); i++) {
			psVale123.add(ListPs123.get(i).getPs());
		}
		for (int i = 0; i < ListPs124.size(); i++) {
			psVale124.add(ListPs124.get(i).getPs());
		}
		for (int i = 0; i < ListPs125.size(); i++) {
			psVale125.add(ListPs125.get(i).getPs());
		}
		for (int i = 0; i < ListPs126.size(); i++) {
			psVale126.add(ListPs126.get(i).getPs());
		}
		for (int i = 0; i < ListPs127.size(); i++) {
			psVale127.add(ListPs127.get(i).getPs());
		}
		for (int i = 0; i < ListPs128.size(); i++) {
			psVale128.add(ListPs128.get(i).getPs());
		}
		for (int i = 0; i < ListPs129.size(); i++) {
			psVale129.add(ListPs129.get(i).getPs());
		}
		for (int i = 0; i < ListPs130.size(); i++) {
			psVale130.add(ListPs130.get(i).getPs());
		}
		
		psValue123 = mapper.writeValueAsString(psVale123);
		psValue124 = mapper.writeValueAsString(psVale124);
		psValue125 = mapper.writeValueAsString(psVale125);
		psValue126 = mapper.writeValueAsString(psVale126);
		psValue127 = mapper.writeValueAsString(psVale127);
		psValue128 = mapper.writeValueAsString(psVale128);
		psValue129 = mapper.writeValueAsString(psVale129);
		psValue130 = mapper.writeValueAsString(psVale130);
	
		
		

        //Ps theo sheet 1
        String Ps223 = get("/2/23/10/2016");
		String Ps224 = get("/2/24/10/2016");
		String Ps225 = get("/2/25/10/2016");
		String Ps226 = get("/2/26/10/2016");
		String Ps227 = get("/2/27/10/2016");
		String Ps228 = get("/2/28/10/2016");
		String Ps229 = get("/2/29/10/2016");
		String Ps230 = get("/2/30/10/2016");
		
		List<Double> psVale223 = new ArrayList<Double>();
		List<Double> psVale224 = new ArrayList<Double>();
		List<Double> psVale225 = new ArrayList<Double>();
		List<Double> psVale226 = new ArrayList<Double>();
		List<Double> psVale227 = new ArrayList<Double>();
		List<Double> psVale228 = new ArrayList<Double>();
		List<Double> psVale229 = new ArrayList<Double>();
		List<Double> psVale230 = new ArrayList<Double>();
		
		List<Min> ListPs223 = mapper.readValue(Ps223, new TypeReference<List<Min>>() {});
		List<Min> ListPs224 = mapper.readValue(Ps224, new TypeReference<List<Min>>() {});
		List<Min> ListPs225 = mapper.readValue(Ps225, new TypeReference<List<Min>>() {});
		List<Min> ListPs226 = mapper.readValue(Ps226, new TypeReference<List<Min>>() {});
		List<Min> ListPs227 = mapper.readValue(Ps227, new TypeReference<List<Min>>() {});
		List<Min> ListPs228 = mapper.readValue(Ps228, new TypeReference<List<Min>>() {});
		List<Min> ListPs229 = mapper.readValue(Ps229, new TypeReference<List<Min>>() {});
		List<Min> ListPs230 = mapper.readValue(Ps230, new TypeReference<List<Min>>() {});
	       
		for (int i = 0; i < ListPs223.size(); i++) {
			psVale223.add(ListPs223.get(i).getPs());
		}
		for (int i = 0; i < ListPs224.size(); i++) {
			psVale224.add(ListPs224.get(i).getPs());
		}
		for (int i = 0; i < ListPs225.size(); i++) {
			psVale225.add(ListPs225.get(i).getPs());
		}
		for (int i = 0; i < ListPs226.size(); i++) {
			psVale226.add(ListPs226.get(i).getPs());
		}
		for (int i = 0; i < ListPs227.size(); i++) {
			psVale227.add(ListPs227.get(i).getPs());
		}
		for (int i = 0; i < ListPs228.size(); i++) {
			psVale228.add(ListPs228.get(i).getPs());
		}
		for (int i = 0; i < ListPs229.size(); i++) {
			psVale229.add(ListPs229.get(i).getPs());
		}
		for (int i = 0; i < ListPs230.size(); i++) {
			psVale230.add(ListPs230.get(i).getPs());
		}
		
		psValue223 = mapper.writeValueAsString(psVale223);
		psValue224 = mapper.writeValueAsString(psVale224);
		psValue225 = mapper.writeValueAsString(psVale225);
		psValue226 = mapper.writeValueAsString(psVale226);
		psValue227 = mapper.writeValueAsString(psVale227);
		psValue228 = mapper.writeValueAsString(psVale228);
		psValue229 = mapper.writeValueAsString(psVale229);
		psValue230 = mapper.writeValueAsString(psVale230);

		
		//Pa theo ngay của sheet 0
		String Pa023 = get("/0/23/10/2016");
		String Pa024 = get("/0/24/10/2016");
		String Pa025 = get("/0/25/10/2016");
		String Pa026 = get("/0/26/10/2016");
		String Pa027 = get("/0/27/10/2016");
		String Pa028 = get("/0/28/10/2016");
		String Pa029 = get("/0/29/10/2016");
		String Pa030 = get("/0/30/10/2016");
		
		List<Double> paVale023 = new ArrayList<Double>();
		List<Double> paVale024 = new ArrayList<Double>();
		List<Double> paVale025 = new ArrayList<Double>();
		List<Double> paVale026 = new ArrayList<Double>();
		List<Double> paVale027 = new ArrayList<Double>();
		List<Double> paVale028 = new ArrayList<Double>();
		List<Double> paVale029 = new ArrayList<Double>();
		List<Double> paVale030 = new ArrayList<Double>();
		
		List<Min> ListPa023 = mapper.readValue(Pa023, new TypeReference<List<Min>>() {});
		List<Min> ListPa024 = mapper.readValue(Pa024, new TypeReference<List<Min>>() {});
		List<Min> ListPa025 = mapper.readValue(Pa025, new TypeReference<List<Min>>() {});
		List<Min> ListPa026 = mapper.readValue(Pa026, new TypeReference<List<Min>>() {});
		List<Min> ListPa027 = mapper.readValue(Pa027, new TypeReference<List<Min>>() {});
		List<Min> ListPa028 = mapper.readValue(Pa028, new TypeReference<List<Min>>() {});
		List<Min> ListPa029 = mapper.readValue(Pa029, new TypeReference<List<Min>>() {});
		List<Min> ListPa030 = mapper.readValue(Pa030, new TypeReference<List<Min>>() {});
	        
		for (int i = 0; i < ListPa023.size(); i++) {
			paVale023.add(ListPa023.get(i).getPa());
		}
		for (int i = 0; i < ListPa024.size(); i++) {
			paVale024.add(ListPa024.get(i).getPa());
		}
		for (int i = 0; i < ListPa025.size(); i++) {
			paVale025.add(ListPa025.get(i).getPa());
		}

		for (int i = 0; i < ListPa026.size(); i++) {
			paVale026.add(ListPa026.get(i).getPa());
		}
		for (int i = 0; i < ListPa027.size(); i++) {
			paVale027.add(ListPa027.get(i).getPa());
		}
		for (int i = 0; i < ListPa028.size(); i++) {
			paVale028.add(ListPa028.get(i).getPa());
		}

		for (int i = 0; i < ListPa029.size(); i++) {
			paVale029.add(ListPa029.get(i).getPa());
		}
		for (int i = 0; i < ListPa030.size(); i++) {
			paVale030.add(ListPa030.get(i).getPa());
		}
		
		paValue023 = mapper.writeValueAsString(paVale023);
		paValue024 = mapper.writeValueAsString(paVale024);
		paValue025 = mapper.writeValueAsString(paVale025);
		paValue026 = mapper.writeValueAsString(paVale026);
		paValue027 = mapper.writeValueAsString(paVale027);
		paValue028 = mapper.writeValueAsString(paVale028);
		paValue029 = mapper.writeValueAsString(paVale029);
		paValue030 = mapper.writeValueAsString(paVale030);
		
		
		
		//Pa theo ngay của sheet 1
		String Pa123 = get("/1/23/10/2016");
		String Pa124 = get("/1/24/10/2016");
		String Pa125 = get("/1/25/10/2016");
		String Pa126 = get("/1/26/10/2016");
		String Pa127 = get("/1/27/10/2016");
		String Pa128 = get("/1/28/10/2016");
		String Pa129 = get("/1/29/10/2016");
		String Pa130 = get("/1/30/10/2016");
		
		List<Double> paVale123 = new ArrayList<Double>();
		List<Double> paVale124 = new ArrayList<Double>();
		List<Double> paVale125 = new ArrayList<Double>();
		List<Double> paVale126 = new ArrayList<Double>();
		List<Double> paVale127 = new ArrayList<Double>();
		List<Double> paVale128 = new ArrayList<Double>();
		List<Double> paVale129 = new ArrayList<Double>();
		List<Double> paVale130 = new ArrayList<Double>();
		
		List<Min> ListPa123 = mapper.readValue(Pa123, new TypeReference<List<Min>>() {});
		List<Min> ListPa124 = mapper.readValue(Pa124, new TypeReference<List<Min>>() {});
		List<Min> ListPa125 = mapper.readValue(Pa125, new TypeReference<List<Min>>() {});
		List<Min> ListPa126 = mapper.readValue(Pa126, new TypeReference<List<Min>>() {});
		List<Min> ListPa127 = mapper.readValue(Pa127, new TypeReference<List<Min>>() {});
		List<Min> ListPa128 = mapper.readValue(Pa128, new TypeReference<List<Min>>() {});
		List<Min> ListPa129 = mapper.readValue(Pa129, new TypeReference<List<Min>>() {});
		List<Min> ListPa130 = mapper.readValue(Pa130, new TypeReference<List<Min>>() {});
	        
		for (int i = 0; i < ListPa123.size(); i++) {
			paVale123.add(ListPa123.get(i).getPa());
		}
		for (int i = 0; i < ListPa124.size(); i++) {
			paVale124.add(ListPa124.get(i).getPa());
		}
		for (int i = 0; i < ListPa125.size(); i++) {
			paVale125.add(ListPa125.get(i).getPa());
		}

		for (int i = 0; i < ListPa126.size(); i++) {
			paVale126.add(ListPa126.get(i).getPa());
		}
		for (int i = 0; i < ListPa127.size(); i++) {
			paVale127.add(ListPa127.get(i).getPa());
		}
		for (int i = 0; i < ListPa128.size(); i++) {
			paVale128.add(ListPa128.get(i).getPa());
		}

		for (int i = 0; i < ListPa129.size(); i++) {
			paVale129.add(ListPa129.get(i).getPa());
		}
		for (int i = 0; i < ListPa130.size(); i++) {
			paVale130.add(ListPa130.get(i).getPa());
		}
		
		paValue123 = mapper.writeValueAsString(paVale123);
		paValue124 = mapper.writeValueAsString(paVale124);
		paValue125 = mapper.writeValueAsString(paVale125);
		paValue126 = mapper.writeValueAsString(paVale126);
		paValue127 = mapper.writeValueAsString(paVale127);
		paValue128 = mapper.writeValueAsString(paVale128);
		paValue129 = mapper.writeValueAsString(paVale129);
		paValue130 = mapper.writeValueAsString(paVale130);
		
		
		
		//Pa theo ngay của sheet 2
		String Pa223 = get("/2/23/10/2016");
		String Pa224 = get("/2/24/10/2016");
		String Pa225 = get("/2/25/10/2016");
		String Pa226 = get("/2/26/10/2016");
		String Pa227 = get("/2/27/10/2016");
		String Pa228 = get("/2/28/10/2016");
		String Pa229 = get("/2/29/10/2016");
		String Pa230 = get("/2/30/10/2016");
		
		List<Double> paVale223 = new ArrayList<Double>();
		List<Double> paVale224 = new ArrayList<Double>();
		List<Double> paVale225 = new ArrayList<Double>();
		List<Double> paVale226 = new ArrayList<Double>();
		List<Double> paVale227 = new ArrayList<Double>();
		List<Double> paVale228 = new ArrayList<Double>();
		List<Double> paVale229 = new ArrayList<Double>();
		List<Double> paVale230 = new ArrayList<Double>();
		
		List<Min> ListPa223 = mapper.readValue(Pa223, new TypeReference<List<Min>>() {});
		List<Min> ListPa224 = mapper.readValue(Pa224, new TypeReference<List<Min>>() {});
		List<Min> ListPa225 = mapper.readValue(Pa225, new TypeReference<List<Min>>() {});
		List<Min> ListPa226 = mapper.readValue(Pa226, new TypeReference<List<Min>>() {});
		List<Min> ListPa227 = mapper.readValue(Pa227, new TypeReference<List<Min>>() {});
		List<Min> ListPa228 = mapper.readValue(Pa228, new TypeReference<List<Min>>() {});
		List<Min> ListPa229 = mapper.readValue(Pa229, new TypeReference<List<Min>>() {});
		List<Min> ListPa230 = mapper.readValue(Pa230, new TypeReference<List<Min>>() {});
	        
		for (int i = 0; i < ListPa223.size(); i++) {
			paVale223.add(ListPa223.get(i).getPa());
		}
		for (int i = 0; i < ListPa224.size(); i++) {
			paVale224.add(ListPa224.get(i).getPa());
		}
		for (int i = 0; i < ListPa225.size(); i++) {
			paVale225.add(ListPa225.get(i).getPa());
		}

		for (int i = 0; i < ListPa226.size(); i++) {
			paVale226.add(ListPa226.get(i).getPa());
		}
		for (int i = 0; i < ListPa227.size(); i++) {
			paVale227.add(ListPa227.get(i).getPa());
		}
		for (int i = 0; i < ListPa228.size(); i++) {
			paVale228.add(ListPa228.get(i).getPa());
		}

		for (int i = 0; i < ListPa229.size(); i++) {
			paVale229.add(ListPa229.get(i).getPa());
		}
		for (int i = 0; i < ListPa230.size(); i++) {
			paVale230.add(ListPa230.get(i).getPa());
		}
		
		paValue223 = mapper.writeValueAsString(paVale223);
		paValue224 = mapper.writeValueAsString(paVale224);
		paValue225 = mapper.writeValueAsString(paVale225);
		paValue226 = mapper.writeValueAsString(paVale226);
		paValue227 = mapper.writeValueAsString(paVale227);
		paValue228 = mapper.writeValueAsString(paVale228);
		paValue229 = mapper.writeValueAsString(paVale229);
		paValue230 = mapper.writeValueAsString(paVale230);
		
     }
    
    
    public String get(String url) {
        HttpEntity<String> requestEntity = new HttpEntity<String>("", headers);
        ResponseEntity<String> responseEntity = rest.exchange(server + url, HttpMethod.GET, requestEntity, String.class);
        String result = responseEntity.getBody();       
        return result;
    }

    
  
    public String execute()  {
		
		return "success";
        }


	//get & set Pa theo ngay cua sheet 0,1,2
    public String getPaValue0() {
        return paValue0;
    }
    public void setPaValue0(String paValue0) {
        this.paValue0 = paValue0;
    }
    public String getPaValue1() {
        return paValue1;
    }
    public void setPaValue1(String paValue1) {
        this.paValue1 = paValue1;
    }
    public String getPaValue2() {
        return paValue2;
    }
    public void setPaValue2(String paValue2) {
        this.paValue2 = paValue2;
    }

    
	
    //get & set PS theo ngay cua sheet 0
	public String getPsValue023() {
		return psValue023;
	}
	public void setPsValue023(String psValue023) {
		this.psValue023 = psValue023;
	}
	public String getPsValue024() {
		return psValue024;
	}
	public void setPsValue024(String psValue024) {
		this.psValue024 = psValue024;
	}
	public String getPsValue025() {
		return psValue025;
	}
	public void setPsValue025(String psValue025) {
		this.psValue025 = psValue025;
	}
	public String getPsValue026() {
		return psValue026;
	}
	public void setPsValue026(String psValue026) {
		this.psValue026 = psValue026;
	}
	public String getPsValue027() {
		return psValue027;
	}
	public void setPsValue027(String psValue027) {
		this.psValue027 = psValue027;
	}
	public String getPsValue028() {
		return psValue028;
	}
	public void setPsValue028(String psValue028) {
		this.psValue028 = psValue028;
	}
	public String getPsValue029() {
		return psValue029;
	}
	public void setPsValue029(String psValue029) {
		this.psValue029 = psValue029;
	}
	public String getPsValue030() {
		return psValue030;
	}
	public void setPsValue030(String psValue030) {
		this.psValue030 = psValue030;
	}

	
	//get & set Ps theo ngay cua sheet 1
	public String getPsValue123() {
		return psValue123;
	}
	public void setPsValue123(String psValue123) {
		this.psValue123 = psValue123;
	}
	public String getPsValue124() {
		return psValue124;
	}
	public void setPsValue124(String psValue124) {
		this.psValue124 = psValue124;
	}
	public String getPsValue125() {
		return psValue125;
	}
	public void setPsValue125(String psValue125) {
		this.psValue125 = psValue125;
	}
	public String getPsValue126() {
		return psValue126;
	}
	public void setPsValue126(String psValue126) {
		this.psValue126 = psValue126;
	}
	public String getPsValue127() {
		return psValue127;
	}
	public void setPsValue127(String psValue127) {
		this.psValue127 = psValue127;
	}
	public String getPsValue128() {
		return psValue128;
	}
	public void setPsValue128(String psValue128) {
		this.psValue128 = psValue128;
	}
	public String getPsValue129() {
		return psValue129;
	}
	public void setPsValue129(String psValue129) {
		this.psValue129 = psValue129;
	}
	public String getPsValue130() {
		return psValue130;
	}
	public void setPsValue130(String psValue130) {
		this.psValue130 = psValue130;
	}

	 //get & set Ps theo ngay cua sheet 2
	public String getPsValue223() {
		return psValue223;
	}
	public void setPsValue223(String psValue223) {
		this.psValue223 = psValue223;
	}
	public String getPsValue224() {
		return psValue224;
	}
	public void setPsValue224(String psValue224) {
		this.psValue224 = psValue224;
	}
	public String getPsValue225() {
		return psValue225;
	}
	public void setPsValue225(String psValue225) {
		this.psValue225 = psValue225;
	}
	public String getPsValue226() {
		return psValue226;
	}
	public void setPsValue226(String psValue226) {
		this.psValue226 = psValue226;
	}
	public String getPsValue227() {
		return psValue227;
	}
	public void setPsValue227(String psValue227) {
		this.psValue227 = psValue227;
	}
	public String getPsValue228() {
		return psValue228;
	}
	public void setPsValue228(String psValue228) {
		this.psValue228 = psValue228;
	}
	public String getPsValue229() {
		return psValue229;
	}
	public void setPsValue229(String psValue229) {
		this.psValue229 = psValue229;
	}
	public String getPsValue230() {
		return psValue230;
	}
	public void setPsValue230(String psValue230) {
		this.psValue230 = psValue230;
	}


	//get & set Pa theo ngay cua sheet 0
	public String getPaValue023() {
		return paValue023;
	}
	public void setPaValue023(String paValue023) {
		this.paValue023 = paValue023;
	}
	public String getPaValue024() {
		return paValue024;
	}
	public void setPaValue024(String paValue024) {
		this.paValue024 = paValue024;
	}
	public String getPaValue025() {
		return paValue025;
	}
	public void setPaValue025(String paValue025) {
		this.paValue025 = paValue025;
	}
	public String getPaValue026() {
		return paValue026;
	}
	public void setPaValue026(String paValue026) {
		this.paValue026 = paValue026;
	}
	public String getPaValue027() {
		return paValue027;
	}
	public void setPaValue027(String paValue027) {
		this.paValue027 = paValue027;
	}
	public String getPaValue028() {
		return paValue028;
	}
	public void setPaValue028(String paValue028) {
		this.paValue028 = paValue028;
	}
	public String getPaValue029() {
		return paValue029;
	}
	public void setPaValue029(String paValue029) {
		this.paValue029 = paValue029;
	}
	public String getPaValue030() {
		return paValue030;
	}
	public void setPaValue030(String paValue030) {
		this.paValue030 = paValue030;
	}
    
	
	//get & set Pa theo ngay cua sheet 1
    public String getPaValue123() {
		return paValue123;
	}
	public void setPaValue123(String paValue123) {
		this.paValue123 = paValue123;
	}
	public String getPaValue124() {
		return paValue124;
	}
	public void setPaValue124(String paValue124) {
		this.paValue124 = paValue124;
	}
	public String getPaValue125() {
		return paValue125;
	}
	public void setPaValue125(String paValue125) {
		this.paValue125 = paValue125;
	}
	public String getPaValue126() {
		return paValue126;
	}
	public void setPaValue126(String paValue126) {
		this.paValue126 = paValue126;
	}
	public String getPaValue127() {
		return paValue127;
	}
	public void setPaValue127(String paValue127) {
		this.paValue127 = paValue127;
	}
	public String getPaValue128() {
		return paValue128;
	}
	public void setPaValue128(String paValue128) {
		this.paValue128 = paValue128;
	}
	public String getPaValue129() {
		return paValue129;
	}
	public void setPaValue129(String paValue129) {
		this.paValue129 = paValue129;
	}
	public String getPaValue130() {
		return paValue130;
	}
	public void setPaValue130(String paValue130) {
		this.paValue130 = paValue130;
	}
	
	

    //get & set PA theo ngay cua sheet 2
	public String getPaValue223() {
		return paValue223;
	}
	public void setPaValue223(String paValue223) {
		this.paValue223 = paValue223;
	}
	public String getPaValue224() {
		return paValue224;
	}
	public void setPaValue224(String paValue224) {
		this.paValue224 = paValue224;
	}
	public String getPaValue225() {
		return paValue225;
	}
	public void setPaValue225(String paValue225) {
		this.paValue225 = paValue225;
	}
	public String getPaValue226() {
		return paValue226;
	}
	public void setPaValue226(String paValue226) {
		this.paValue226 = paValue226;
	}
	public String getPaValue227() {
		return paValue227;
	}
	public void setPaValue227(String paValue227) {
		this.paValue227 = paValue227;
	}
	public String getPaValue228() {
		return paValue228;
	}
	public void setPaValue228(String paValue228) {
		this.paValue228 = paValue228;
	}
	public String getPaValue229() {
		return paValue229;
	}
	public void setPaValue229(String paValue229) {
		this.paValue229 = paValue229;
	}
	public String getPaValue230() {
		return paValue230;
	}
	public void setPaValue230(String paValue230) {
		this.paValue230 = paValue230;
	}

//date
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
		
}