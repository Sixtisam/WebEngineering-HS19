<!doctype html>
<html>
<head>
    <title>Multiplication Circle</title>
    <style>
        circle, line {
            fill: white;
            stroke: rgba(255, 0, 0, 0.7);
            stroke-width: 3px;
        }
        label {
            display: block;
            float: left;
            width: 5em;
        }
    </style>
    <script>
        function increase(valueName) {
            var input = document.getElementById(valueName);
            input.value = parseInt(input.value) + 1 ;
        }
        function decrease(valueName) {
            var input = document.getElementById(valueName);
            input.value = parseInt(input.value) - 1 ;
        }

    </script>
    <style>
        @keyframes rotating {
            from {
                transform: rotate(0deg) skew(10deg);
            }
            to {
                transform: rotate(360deg) skew(50deg);
            }
        }

        .animated-svg2 {
            animation-iteration-count: infinite;
            animation-fill-mode: forwards;
            animation-direction: alternate;
            animation-timing-function: linear;
            animation-duration: 60s;
            animation-name: rotating;
        }
    </style>
</head>
<body>
    <form action="/multiplicationCircle/index" sstyle="position: fixed; top: 0; left: 0;z-index: 100">
      <tmpl:up_down_input name="segmentCount" label="Segments" value="${circleInstance.segmentCount}" />
      <tmpl:up_down_input name="tableBase" label="Table base" value="${circleInstance.tableBase}" />
      <tmpl:up_down_input name="radius" label="Radius" value="${circleInstance.radius}" />

    </form>

    <svg width="${circleInstance.radius * 2}" height="${circleInstance.radius * 2}" class="animated-svg">
        <circle r="${circleInstance.radius - 1}" cx="${circleInstance.radius}" cy="${circleInstance.radius}"/>
        <g:each var="line" in="${circleInstance.lines}">
            <line
                x1="${line.x1}"
                y1="${line.y1}"
                x2="${line.x2}"
                y2="${line.y2}"
                />
        </g:each>
    </svg>

</body>
</html>
