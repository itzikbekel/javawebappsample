package ms.kenchen.Calculator;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Date;

@Path("/calculator")
public class CalculatorService {
    @GET
    @Path("ping")
    @Produces(MediaType.TEXT_HTML)
    public String ping() {
      
  return ("<html> " + "<header>" + "<title>This is title</title>" + "</header>" + "<P>" + "<body style='background-color:powderblue';>" + "<font size='18' color='blue'>" + "PROD = Go Open-Source Web Site!" + "</font></p><font size='8' color='blue'>"+ "http://goossweb.azurewebsites.net" + "</font>" + "</html>");

    }

    @GET
    @Path("add")
    @Produces(MediaType.APPLICATION_JSON)
    public CalculatorResponse Add(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new CalculatorResponse(x, y, x + y);
    }

    @GET
    @Path("sub")
    @Produces(MediaType.APPLICATION_JSON)
    public CalculatorResponse Sub(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new CalculatorResponse(x, y, x - y);
    }

    @GET
    @Path("mul")
    @Produces(MediaType.APPLICATION_JSON)
    public CalculatorResponse Mul(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new CalculatorResponse(x, y, x * y);
    }

    @GET
    @Path("div")
    @Produces(MediaType.APPLICATION_JSON)
    public CalculatorResponse Div(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new CalculatorResponse(x, y, x / y);
    }
}
