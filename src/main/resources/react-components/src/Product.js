import React, { useEffect, useState } from 'react';
import axios from 'axios';

const DataComponent = () => {
    const [data, setData] = useState('');

    useEffect(() => {
        axios.get('/products')
            .then(response => {
                setData(response.data);
            })
            .catch(error => {
                console.error("There was an error fetching the data!", error);
            });
    }, []);

    return (
        <div>
            <h1>Data from Spring Backend</h1>
            <p>{data}</p>
        </div>
    );
};

export default DataComponent;
