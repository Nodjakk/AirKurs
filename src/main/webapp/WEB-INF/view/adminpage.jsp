<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Расписание рейсов</title>
  <link rel="stylesheet" href="/style.css?v=1.2">
</head>
<body>
<div class="header-section">
  <header>
    <h1>Расписание рейсов самолётов</h1>
  </header>
</div>
<main>
  <section>
    <h2>Добавить рейс</h2>
    <form action="/foradmin" method="post" id="add-form">
      <div>
        <label for="destination">Пункт назначения:</label>
        <input type="text" id="destination" name="destination" required placeholder="Введите пункт назначения">
      </div>

      <div>
        <label for="number">Номер рейса:</label>
        <input type="text" id="number" name="number" required placeholder="Введите номер рейса">
      </div>

      <div>
        <label for="aircraftType">Тип самолёта:</label>
        <input type="text" id="aircraftType" name="aircraftType" required placeholder="Введите тип самолёта">
      </div>
      <button type="submit">Добавить</button>
    </form>
    <c:if test="${bindingResult.getFieldError('destination') != null}">
      <span style="color: red;">${bindingResult.getFieldError('destination').defaultMessage}</span>
    </c:if>
    <br>
    <c:if test="${bindingResult.getFieldError('number') != null}">
      <span style="color: red;">${bindingResult.getFieldError('number').defaultMessage}</span>
    </c:if>
    <br>
    <c:if test="${bindingResult.getFieldError('aircraftType') != null}">
      <span style="color: red;">${bindingResult.getFieldError('aircraftType').defaultMessage}</span>
    </c:if>
    <br>
    <c:if test="${bindingResult.hasErrors()}">
      <span style="color: red;">${bindingResult.errorCount}</span>
    </c:if>
  </section>
  <section id="go-back-panel" style="position: fixed; bottom: 10px; left: 10px;">
    <form action="/" method="get">
      <button type="submit">Вернуться назад</button>
    </form>
  </section>
  <div id="notification" style="display: none; position: fixed; top: 20px; right: 20px; background-color: #4caf50; color: white; padding: 10px 20px; border-radius: 5px; box-shadow: 0 2px 5px rgba(0,0,0,0.2);">
    Рейс успешно добавлен!
  </div>

</main>
<script>
  const urlParams = new URLSearchParams(window.location.search);
  if (urlParams.get('success') === 'true') {
    const notification = document.getElementById('notification');
    notification.style.display = 'block';

    setTimeout(() => {
      notification.style.display = 'none';
    }, 3000);

    urlParams.delete('success');
    const newUrl = window.location.pathname + '?' + urlParams.toString();
    window.history.replaceState(null, '', newUrl.endsWith('?') ? window.location.pathname : newUrl);
  }
</script>
</body>