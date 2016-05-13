angular.module("technologyRadarApp")
    .controller("polarChartController",
        function ($scope) {
            $scope.labels = ["Java", "AngularJs", "Maven", "Spring boot"];
            $scope.data = [0, 1, 2, 3];
            $scope.type = 'PolarArea';

            $scope.toggle = function () {
            $scope.type = $scope.type === 'PolarArea' ?
                'Pie' : 'PolarArea';
            };

            $scope.options = {
                responsive: false,
                maintainAspectRatio: false
            };
        }
    );


