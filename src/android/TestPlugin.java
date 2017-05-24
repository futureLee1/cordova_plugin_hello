package com.example.hello;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class TestPlugin extends CordovaPlugin {

	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		// TODO Auto-generated method stub
		/*return super.execute(action, args, callbackContext);*/
		
		String test_id = args.getString(0);                         // 전달인자를 test_id에 정의
		
		// 입력한 값이 없으면 ↓
        if( test_id == null || test_id.length() == 0) {             // 입력한 값이 없으면 실패+메세지
            callbackContext.error("값을 입력해주세요!");               // error 로 callback
            return false;                                             // false 로 return
        }
        
        // 입력한 값이 있으면 ↓
        if ( action.equals("a")) {                                 // 액션명이 a라면
            if (test_id.equals("racoon")){
                callbackContext.success(test_id+" 안녕");             // success 로 callback
            } else {
                callbackContext.success("누구시오?");                 // success 로 callback
            }
        } else {                                                    // 액션명이 a가 아니라면 (b라면)
            if (test_id.equals("racoon")){
                callbackContext.success(test_id+" 잘가");             // success 로 callback
            } else {
                callbackContext.error("멍멍멍멍!");                   // error 로 callback
            }
        }
        
        return true;
	}
	
}
