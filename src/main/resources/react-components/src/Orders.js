import React, { useEffect, useState } from 'react';
import axios from 'axios';

const Orders = () => {
    const [entities, setEntities] = useState([]);

    useEffect(() => {
        axios.get('/api/entities')
            .then(response => {
                setEntities(response.data);
            })
            .catch(error => {
                console.error('There was an error fetching the entities!', error);
            });
    }, []);

    return (
        <div>
            <ul>
                {entities.map(entity => (
                    <li key={entity.id}>
                        {entity.name}
                        {entity.number}
                        {entity.date}
                        {entity.status}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default Orders;