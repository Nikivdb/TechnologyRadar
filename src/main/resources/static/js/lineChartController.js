angular.module("technologyRadarApp")
    .controller("lineChartController",
        function ($scope) {
            $scope.labels = ["Java", "AngularJs", "Maven", "Spring boot"];
            $scope.series = ['State Jan 2016', 'State Apr 2016'];
//            $scope.data = [
//                ["Adopt", "Trial", "Assess", "Hold"],
//                ["Trial", "Trial", "Hold", "Assess"]
//            ];
            $scope.data = [
                [0, 1, 2, 3],
                [1, 1, 4, 3]
            ];
            $scope.onClick = function (points, evt) {
                console.log(points, evt);
            };

            $scope.options = {
                responsive: false,
                maintainAspectRatio: false
            };
        }
    );