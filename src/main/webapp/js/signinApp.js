/**
 * Created by dingyan on 15/8/27.
 */
var signinApp = angular.module("signinApp", ['ngAnimate']);
signinApp.controller("LoginController", ["$scope", "$http", function ($scope, $http) {
    $scope.visible = false;
    $scope.toggle = function () {
        $scope.visible = !$scope.visible;
    };
    $scope.accountLogin = function () {
        //alert($scope.formData('accName'));
        return $http({
            method: 'POST',
            url: '/userLogin',
            data: $.param($scope.formData()),
            headers: {'Content-Type': 'application/x-www-form-urlencoded'}
        }).success(function (data) {
            console.log(data);

            if (!data.success) {
                $scope.errorName = data.errors.name;
                $scope.errorMessage = data.errors.message;
            } else {
                $scope.message = data.message;
            }
        }).error(function () {
            alert("error");
        });
    };
}]);


//signinApp.animation(".show-signPanel", function() {
//   return {
//
//   }
//});