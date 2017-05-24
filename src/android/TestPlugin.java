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
		
		String test_id = args.getString(0);                         // �������ڸ� test_id�� ����
		
		// �Է��� ���� ������ ��
        if( test_id == null || test_id.length() == 0) {             // �Է��� ���� ������ ����+�޼���
            callbackContext.error("���� �Է����ּ���!");               // error �� callback
            return false;                                             // false �� return
        }
        
        // �Է��� ���� ������ ��
        if ( action.equals("a")) {                                 // �׼Ǹ��� a���
            if (test_id.equals("racoon")){
                callbackContext.success(test_id+" �ȳ�");             // success �� callback
            } else {
                callbackContext.success("�����ÿ�?");                 // success �� callback
            }
        } else {                                                    // �׼Ǹ��� a�� �ƴ϶�� (b���)
            if (test_id.equals("racoon")){
                callbackContext.success(test_id+" �߰�");             // success �� callback
            } else {
                callbackContext.error("�۸۸۸�!");                   // error �� callback
            }
        }
        
        return true;
	}
	
}
