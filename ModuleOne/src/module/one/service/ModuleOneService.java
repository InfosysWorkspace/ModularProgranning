package module.one.service;

import module.one.util.ModuleOneUtil;

public class ModuleOneService {
	
    static ModuleOneUtil moduleOneUtil = new ModuleOneUtil();
    
    public void externalAccessible(String text){
        System.out.println("Inisde 'Module One Service' from - " +text);

        // Accessing Internal Package Within the same Module:
        System.out.println("Module One Service access - " +moduleOneUtil.internalAccessible());
    }
}
