package ±¾ÕÂ×÷Òµ16ÕÂ;

public class LogonValidate {
		
				String trueName="tom";
				String truePsw="123";
			public boolean validate(String name,String password) {
				boolean validate=false;
				if(name.equals(trueName)&&password.equals(truePsw)) {
					validate=true;
				}else {
					validate=false;
				}
				return validate;
			}
}
