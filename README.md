# phase2

<b>Description:</b>

Phase II impelments the phonebuzz implementation using twilio twiml  as per instruction <br>
This phase is dependent on the phase I.Twiml generator implemented in the phase I will be used in this phase.
In adddition to phase I this phase consist of a web application which will have an interface to input the twilio resgistered phone number.Using twilio apis it will  will make outbound call to the number specified.
Further user will be promted to play phonebuzz similar to phase I


<b>Steps to Deploy</b><br>
[1] Clone or Download the project from the repository<br>
[2] Make sure you have followed steps specified in the phase I<br>
[3] Edit the serviceURL specified in the VoiceServlet.java to the newly generated URL in the phase I<br>
[4] Run a maven "Clean install" command on the above project which will generate "phase2.war" in target folder<br>
[5] Deploy phase2.war on tomcate<br> 
[6] Assuimg phase2.war is running on localhost on port 8080 open "https://localhost:8080/phase2/"  which will present to you the following attached web interface<br>
[7] You are all set to test phonebuzz and make a call to your twilio account phone number<br><br>
<b>Technology Used: Java Servlet,Maven,ngrok server,apcahe tomcate 7 server</b>



