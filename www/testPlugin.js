/*global cordova, module*/

module.exports = {
    greet: function (name, successCallback, errorCallback, action) {
        cordova.exec(successCallback, errorCallback, "TestPlugin", ""+action, [name]);
    }
};
