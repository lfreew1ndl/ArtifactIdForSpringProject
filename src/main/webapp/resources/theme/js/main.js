var consumerApp = angular.module('consumerApp',[]);

consumerApp.controller('consumerListCtrl',function ($http,$scope) {
    $http.get('/consumer/getAll').then(function (response){
        $scope.consumers=response.data;
        console.log(response);
    });
});