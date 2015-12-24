/**
 * Created by dileepa on 12/24/15.
 */

(function(){

    var app = angular.module("restTest",['ngResource']);

    app.factory("Post", function($resource) {
        return $resource("http://localhost:8080/time/restusers");
    });

    app.controller("restController", function($scope, Post) {
        Post.query(function(data) {
            $scope.posts = data;
            console.log(data);
        });
    });

})();
