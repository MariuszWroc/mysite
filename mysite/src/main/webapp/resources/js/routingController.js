'use strict';

// Define an angular module for our app
var module = angular.module("StarterApp", ['ngRoute', 'ngMaterial']);
var prefix = '/homePage';

module.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
                when('/login', {
                    templateUrl: prefix + '/login',
                    controller: 'menuController'
                }).
                when('/logout', {
                    templateUrl: prefix + '/logout',
                    controller: 'menuController'
                }).
                when('/logout/success', {
                    templateUrl: prefix + '/logout/success',
                    controller: 'menuController'
                }).
                when('/about', {
                    templateUrl: prefix + '/about',
                    controller: 'menuController'
                }).
                when('/contact', {
                    templateUrl: prefix + '/email',
                    controller: 'menuController'
                }).
                when('/denied', {
                    templateUrl: prefix + '/denied',
                    controller: 'menuController'
                }).
                when('/admin/menu', {
                    templateUrl: prefix + '/admin/panel',
                    controller: 'adminController'
                }).                         
                when('/', {
                   templateUrl: prefix + '/home',
                   controller: 'menuController'
                }).
                when('/failed', {
                    templateUrl: prefix + '/failed',
                    controller: 'menuController'
                 }).
                otherwise({
                    redirectTo: '/'
                });

    }]);


module.controller('AppCtrl', function($scope, $mdDialog, $mdMedia, $mdSidenav) {
	$scope.status = '';
	$scope.customFullscreen = $mdMedia('xs') || $mdMedia('sm')

				$scope.toggleSidenav = function() {
				$mdSidenav('left').toggle();
			};
	
			var locals = {'fromUserProfile':false};
        $scope.logout = function(ev) {
            $mdDialog.show({
    	    	templateUrl: prefix + '/logout',
    	        parent: angular.element(document.querySelector('#container')),
    	        targetEvent: ev,
    	        plain: true,
    	        locals: locals,
                controller: 'dialogController',
                // perform delete operation
                }, function (value) {
                    //Do something 
                });
        };
        
        $scope.login = function(ev) {
            $mdDialog.show({
	    	templateUrl: prefix + '/login',
	        parent: angular.element(document.querySelector('#container')),
	        targetEvent: ev,
	        locals: locals,
	        plain: true,
                controller: 'dialogController',
            // perform delete operation
            }, function (value) {
                //Do something 
            });
        }
});
