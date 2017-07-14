angular.module('myApp', []).controller('createuserCtrl', function($scope) {
$scope.username = '';
$scope.IDcard = '';
$scope.telNumber = '';

$scope.edit = true;
$scope.error = false;
$scope.incomplete = false; 

//$scope.editUser = function(id) {
//if (id == 'new') {
//  $scope.edit = true;
//  $scope.incomplete = true;
//  $scope.username = '';
//  } else {
//  $scope.edit = false;
//  $scope.username = $scope.users[id-1].username;
//}
//};

$scope.$watch('username',function() {$scope.test();});
$scope.$watch('IDcard', function() {$scope.test();});
$scope.$watch('telNumber', function() {$scope.test();});



    
$scope.test = function() {
/*	if ($scope.checkcode !== $scope.checkcode1) {
    $scope.error = true;
    } else {
    $scope.error = false;
}*/
  $scope.incomplete = false;
  if ($scope.edit && (!$scope.username.length ||
  !$scope.IDcard.length ||
  !$scope.telNumber.length)) {
     $scope.incomplete = true;
  }
};

});