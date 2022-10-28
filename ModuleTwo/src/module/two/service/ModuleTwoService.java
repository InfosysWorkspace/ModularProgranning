package module.two.service;

import module.one.service.ModuleOneService;

public class ModuleTwoService {
	
	static ModuleOneService modOneServ = new ModuleOneService();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		modOneServ.externalAccessible("Module Two Service");

	}

}
