<!DOCTYPE html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Расписание рейсов</title>
    <link rel="stylesheet" href="/style.css?v=1.0">
</head>
<body>
    <div class="header-section">
        <header>
            <h1>Расписание рейсов самолётов</h1>
        </header>
    </div>
    <main>
        <section>
            <h2>Найти рейс по пункту назначения</h2>
            <form action="/" method="get" id="search-form">
                <label for="destination"></label><input type="text" id="destination" name="destination" required placeholder="Введите пункт назначения">
                <button type="submit" id="search-button">Поиск</button>
            </form>
        </section>

        <section id="flight-results">
            <h2>Рейсы, соответствующие запросу</h2>
            <div id="flights-list"></div>
        </section>

        <section id="admin-panel" style="display: none">
            <form action="/foradmin" method="get">
                <button type="submit">Войти как админ</button>
            </form>
        </section>
    </main>
    <script src="/js/showFlights.js?v=1.1"></script>
</body>

