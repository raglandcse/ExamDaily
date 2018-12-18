package com.Rock.Verticles;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Component;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.FileUpload;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;
import io.vertx.ext.web.handler.CookieHandler;

/**
 * 
 * @author Ragland
 *
 */

@Component
public class ExamDailyVerticles extends AbstractVerticle {

	public void start() throws Exception {
		Router router = Router.router(vertx);
		vertx.createHttpServer().requestHandler(router::accept).listen(config().getInteger("http.port", 8585));

		router.route().handler(CookieHandler.create());
		router.route().handler(BodyHandler.create());

		router.post("/api/upload").handler(this::first);

	}

	private void first(final RoutingContext routingContext) {
		Set<FileUpload> files=routingContext.fileUploads();
		File uploadedFile = null ;
		String questionNumber=null,question=null;
		
		for(FileUpload file : files) {
			uploadedFile=new File(file.uploadedFileName());	
			JSONParser parser = new JSONParser();
			Object obj;
			try {
				obj = parser.parse(new FileReader(file.uploadedFileName()));
				JSONArray jsonArray = (JSONArray) obj;
				System.out.println("size"+jsonArray.size());
				for(int i=0;i<jsonArray.size();i++)
				{
					JSONObject jsonObject = (JSONObject) jsonArray.get(i);
					questionNumber = (String) jsonObject.get("questionNumber");
					question = (String) jsonObject.get("question");
					System.out.println(jsonObject);
					System.out.println("questionNumber"+questionNumber);
					System.out.println("questionNumber"+question);
					break;
				}
				
			} catch (IOException | ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
