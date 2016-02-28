var app = angular.module('Inventory', ['ui.router']);

app.config([
'$stateProvider',
'$urlRouterProvider',
function($stateProvider, $urlRouterProvider) {

  $stateProvider
    .state('home', {
      url: '/home',
      templateUrl: '/home.html',
      controller: 'MainCtrl'
    })
	
	$stateProvider
    .state('sign', {
      url: '/sign',
      templateUrl: '/sign.html',
      controller: 'MainCtrl'
    });

  $urlRouterProvider.otherwise('home');
}]);

app.factory('posts', [function(){
  var o = {
    posts: [{title: 'hello', link: '', upvotes: 0}]
  };
  return o;
}]);


app.controller('MainCtrl', [
'$scope',
'posts',
function($scope,posts){
 
 $scope.go = function ( path ) {
  $location.path( path );
};

  
  
  }]);