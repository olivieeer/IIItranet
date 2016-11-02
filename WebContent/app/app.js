(function(angular) {
  var app=angular.module("myApp", [
    "myApp.controllers",
    "myApp.services","ngRoute"
  ]);
  
  angular.module("myApp.controllers", []);
  angular.module("myApp.services", []);
  
  angular.
  module('phoneDetail', ['ngRoute']);
  

	


app.
config(['$locationProvider', '$routeProvider',
  function config($locationProvider, $routeProvider) {
    $locationProvider.hashPrefix('!');

    $routeProvider.
      when('/phones', {
        template: '<h1>jyggkgukg</H1>'
      }).
      when('/phones/:phoneId', {
        template: '<h1>jyggkgukzdddddddddddddddddddddg</H1>'
      }).
      otherwise('/phones');
  }
]);


app.controller('PhoneListController', function PhoneListController($scope) {
	  $scope.phones = [
	    {
	      name: 'Nexus S',
	      snippet: 'Fast just got faster with Nexus S.'
	    }, {
	      name: 'Motorola XOOM™ with Wi-Fi',
	      snippet: 'The Next, Next Generation tablet.'
	    }, {
	      name: 'MOTOROLA XOOM™',
	      snippet: 'The Next, Next Generation tablet.'
	    }
	  ];
	});
})(angular);


