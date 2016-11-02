angular.module("myApp.services", [ "ngResource" ]).factory("Contact", function($resource) {
	return $resource("./contacts/:id", {
		id: '@id'
	}, {
		update: {
			method: "PUT"
		},
		remove: {
			method: "DELETE"
		}
	});
});