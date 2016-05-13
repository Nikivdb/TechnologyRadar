angular.module("technologyRadarApp.playApp")
    .controller('requestController', ['$scope', '$http', function($scope, $http) {
        $scope.persons = [
            {
                "lastName" : "LastName",
                "firstName" : "First",
                "address" : "an address",
                "city" : "City"
            }
        ];

        $scope.errorMessage = "";

        $scope.makeRequest = function () {
            $http({
                method: 'GET',
                url: 'persons/'
            }).then(
                function(response) {
                    $scope.persons = response.data;
                },
                function(response) {
                    $scope.errorMessage = "Request failed";
              });
        }
    }]);