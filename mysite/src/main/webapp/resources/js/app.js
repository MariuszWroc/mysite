'use strict';

// Define an angular module for our app
var module = angular.module("StarterApp", ['ngRoute', 'ngMaterial']);
var prefix = '/mysite';

module.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
                when('/login', {
                    templateUrl: prefix + '/login',
                    controller: 'adminController'
                }).
                when('/logout', {
                    templateUrl: prefix + '/logout',
                    controller: 'adminController'
                }).
                when('/logout/success', {
                    templateUrl: prefix + '/logout/success',
                    controller: 'adminController'
                }).
                when('/about', {
                    templateUrl: prefix + '/about',
                    controller: 'menuController'
                }).
                when('/portfolio', {
                    templateUrl: prefix + '/portfolio',
                    controller: 'menuController'
                }).
                when('/projects', {
                    templateUrl: prefix + '/projects',
                    controller: 'menuController'
                }).
                when('/contact', {
                    templateUrl: prefix + '/email',
                    controller: 'menuController'
                }).
                when('/blog', {
                    templateUrl: prefix + '/blog',
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
                   templateUrl: prefix + '/welcome',
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
                controller: 'DialogController',
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
                controller: 'DialogController',
            // perform delete operation
            }, function (value) {
                //Do something 
            });
        }
});