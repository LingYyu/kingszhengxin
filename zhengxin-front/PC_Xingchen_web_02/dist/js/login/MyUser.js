angular.module('myApp', []).controller('userCtrl', function($scope) {
$scope.loginname = '';
$scope.passwd = '';
$scope.checkcode = '';

$scope.edit = true;
$scope.error = false;
$scope.incomplete = false; 

//$scope.editUser = function(id) {
//if (id == 'new') {
//  $scope.edit = true;
//  $scope.incomplete = true;
//  $scope.loginname = '';
//  } else {
//  $scope.edit = false;
//  $scope.loginname = $scope.users[id-1].loginname;
//}
//};

$scope.$watch('passwd',function() {$scope.test();});
$scope.$watch('loginame', function() {$scope.test();});
$scope.$watch('checkcode', function() {$scope.test();});



    
$scope.test = function() {
/*	if ($scope.checkcode !== $scope.checkcode1) {
    $scope.error = true;
    } else {
    $scope.error = false;
}*/
  $scope.incomplete = false;
  if ($scope.edit && (!$scope.loginname.length ||
  !$scope.passwd.length ||
  !$scope.checkcode.length)) {
     $scope.incomplete = true;
  }
};

});