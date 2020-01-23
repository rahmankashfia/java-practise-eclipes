package assign.dbaccess;

//import java.util.ArrayList;

//import assign.validation.UsrValidation;

 
/**
 * 
 * EMailBO
 *
 */

public class UsrBO {
 
	/**
	 * No Argument Constructor
	 */
	public UsrBO() {
		super();
	}
/*
	public EMailAddressVOO getEMailAddress(String inEMailID) throws EMailValidationException, Exception{

		EMailAddressVOO eMailAddress = null;
		StringBuffer allMessages = new StringBuffer();
		//validation
		EMailValidation eMailValidation = new EMailValidation();
		allMessages.append(eMailValidation.validateEmailAddress(inEMailID));
		if (allMessages.length() == 0){
			//database insert
			UsrDBAccess eMailDBAccess = new UsrDBAccess();
			eMailAddress = eMailDBAccess.getEMailAddress(inEMailID);
		}
		else{
			  throw new EMailValidationException(allMessages.toString());
		}
		return eMailAddress;
	}


*/

	public void addUsr(UsrVOO inUsrVOO) /*throws UsrValidationException, Exception*/{
		//StringBuffer allMessages = new StringBuffer();
		//2a: validation
		//UsrValidation usrValidation = new UsrValidation();
		//String errorMsg = eMailValidation.validateEmailAddress(inEMailAddressVO.geteMailID());
		//emailaddress
		//allMessages.append(errorMsg);
		//firstname
		//errorMsg = eMailValidation.validateFirstName(inEMailAddressVO.getfName());
		//allMessages.append(errorMsg);
		//lastname
		//remaining fields
		
		
		
		//2b: no error from validation, call db component
		try {
			//if (allMessages.length() == 0){
				//UsrDBAccess usrDBAccess = new UsrDBAccess();
				UsrDBAccess.addUsr(inUsrVOO);
			//}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		//if error return to controller
		/*else{
			 EMailValidationException emailValidationException = new EMailValidationException(allMessages.toString());
			 throw emailValidationException;
		}*/
		return;
	}

/*
	public void deleteEMailAddress(String inEMailID) throws EMailValidationException, Exception{
		StringBuffer allMessages = new StringBuffer();
		EMailAddressVOO eMailAddress = null;
		EMailValidation eMailValidation = new EMailValidation();
		allMessages.append(eMailValidation.validateEmailAddress(inEMailID));
		if (allMessages.length() == 0){
			UsrDBAccess eMailDBAccess = new UsrDBAccess();
			eMailDBAccess.deleteEMailAddress(inEMailID);
		}
		else{
			throw new EMailValidationException(allMessages.toString());
		}
		return;
	}



	public void updateEMailAddress(EMailAddressVOO inEMailAddress) throws EMailValidationException, Exception{
		StringBuffer allMessages = new StringBuffer();
		EMailAddressVOO eMailAddress = null;
		EMailValidation eMailValidation = new EMailValidation();
		allMessages.append(eMailValidation.validateEmailAddress(inEMailAddress.geteMailID()));
		if (allMessages.length() == 0){
			UsrDBAccess eMailDBAccess = new UsrDBAccess();
			eMailDBAccess.updateEMailAddress(inEMailAddress);
		}
		else{
			throw new EMailValidationException(allMessages.toString());
		}
		return;
	}



	public ArrayList getAllEMailAddressList() throws EMailValidationException, Exception{
		UsrDBAccess eMailDBAccess = new UsrDBAccess();
		ArrayList eMailList = eMailDBAccess.getAllEMailAdressEntries();
		return eMailList;
	}



	public ArrayList<EMailAddressVOO> getAllEMailAddressListbyGroup(String inGroupID) throws EMailValidationException, Exception{
		System.out.println(inGroupID);
		//EMailDBAccess eMailDBAccess = new EMailDBAccess();
		ArrayList<EMailAddressVOO> eMailList = UsrDBAccess.getAllEMailAdressEntriesbyGroup(inGroupID);
		return eMailList;
	}


//Group Calls

	public Group getGroup(String inGroup) throws EMailValidationException, Exception{
		UsrDBAccess eMailDBAccess = new UsrDBAccess();
		Group group = eMailDBAccess.getGroup(inGroup);
		return group;
	} 

	public void addGroup(Group inGroup) throws EMailValidationException, Exception{
		UsrDBAccess eMailDBAccess = new UsrDBAccess();
		eMailDBAccess.addGroup(inGroup);
		return;
	}

	public void updateGroup(Group inGroup) throws EMailValidationException, Exception{
		UsrDBAccess eMailDBAccess = new UsrDBAccess();
		eMailDBAccess.updateGroup(inGroup);
		return;
	}

	public void deleteGroup(String inGroupID) throws EMailValidationException, Exception{
		UsrDBAccess eMailDBAccess = new UsrDBAccess();
		eMailDBAccess.deleteGroup(inGroupID);
		return;
	}

	public ArrayList getAllGroups() throws EMailValidationException, Exception{
		UsrDBAccess eMailDBAccess = new UsrDBAccess();
		ArrayList groupList = eMailDBAccess.getAllGroupEntries();
		return groupList;
	}


public static void main(String[] arg){
	UsrBO eMailBO = new UsrBO();
	try{
	    eMailBO.getEMailAddress("");
	} catch (Exception e){
		e.printStackTrace();
	}
}

*/
}
 
