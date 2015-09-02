/**
 * Created by dingyan on 15/8/25.
 */
var testApp = angular.module("testApp", []);
testApp.controller('testCtrl', ['$scope','$timeout', function ($scope, $timeout) {
    var updateClock = function() {
        $scope.clock = new Date();
        $timeout(function () {
            updateClock();
        }, 1000);
    };
    //updateClock();
}]);