package com.kita.second.level3;

public class RCUser {
		RemoteControl rc = new Tv();
		
		public RCUser(RemoteControl rc) {
			this.rc =rc;
			rc.turnOn();
		}
		
		public RCUser() 
		{
			rc.turnOn();
			
		}
		
		
		void useRC() {
			RemoteControl rc = new Audio();
			rc.turnOff();
		}
		
}
