import java.util.logging.Logger;
//
public class FinalStatement {
    Logger logger= Logger.getLogger(FinalStatement.class.getName());
	  public void doIt() {
	  logger.info("parent method ");
  }
  
  public static void main(String[] args) {
	  Dervide derived= new Dervide();
	  derived.doIt();
	  derived.doIt();
  }
}

class Dervide extends FinalStatement{
	
	public void doIt(int u) {
		 logger.info("child  method ");
	//	return "hh";
		  
	  }
}
