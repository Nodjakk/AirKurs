
document.getElementById('search-form').addEventListener('submit', function(event) {
    event.preventDefault();

    const destination = document.getElementById('destination').value;

    fetch(`/api/flights?destination=${encodeURIComponent(destination)}`)
        .then(response => {
            if (!response.ok) {
                throw new Error('Ошибка загрузки данных: ' + response.status);
            }
            return response.json();
        })
        .then(flights => {
            const hiddenElement = document.getElementById('flight-results');
            hiddenElement.style.display = 'block';

            const flightsList = document.getElementById('flights-list');
            flightsList.innerHTML = '';

            if (flights.length === 0) {
                flightsList.innerHTML = '<p>Рейсов не найдено.</p>';
                return;
            }

            flights.forEach(flight => {
                const flightItem = document.createElement('div');
                flightItem.className = 'flight-item';
                flightItem.innerHTML = `
                            <p><strong>Рейс:</strong> ${flight.number}</p>
                            <p><strong>Пункт назначения:</strong> ${flight.destination}</p>
                            <p><strong>Тип самолёта:</strong> ${flight.aircraftType}</p>
                            <hr>
                        `;
                flightsList.appendChild(flightItem);
            });
        })
        .catch(error => {
            console.error('Произошла ошибка:', error);
            document.getElementById('flights-list').innerHTML = '<p>Произошла ошибка при загрузке данных.</p>';
        });
});