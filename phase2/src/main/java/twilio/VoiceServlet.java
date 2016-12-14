package twilio;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.rest.api.v2010.account.CallCreator;
import com.twilio.type.PhoneNumber;


/**
 * 
 * @author Aniket
 * This class uses Twilio app developed in phase1
 * This class is responsible for making outbound call to the twilio verified number
 */
public class VoiceServlet extends HttpServlet {

	public static final String ACCOUNT_SID = "AC59f43ff40e03a08ab99d60b55418cf87";
	public static final String AUTH_TOKEN = "5ea119a9d762b9e9a8967fd8e3963fa6";
	public static final String serviceURL="https://97fa872b.ngrok.io/phase1/twiml";
	
	@Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String phoneNumber=request.getParameter("phone_number");
	    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
	 	PhoneNumber to=new PhoneNumber(phoneNumber);
	 	PhoneNumber from=new PhoneNumber("+12562026173");
		URI obj=URI.create(serviceURL);
		Call call=new CallCreator(to, from, obj).create();
		response.sendRedirect("/phase2/success.jsp");
		
    
    }
    
   
}