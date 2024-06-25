import React, { useEffect, useState } from 'react';
import axios from 'axios';

const Users = () => {
    const [data, setData] = useState('');

    useEffect(() => {
        axios.get('/products')
            .then(response => {
                setEntities(response.data);
            })
            .catch(error => {
                console.error("There was an error fetching the data!", error);
            });
    }, []);

    return (
        <div>
            <table>
                    <tr>
                        <th>full name</th>
                        <th>user role</th>
                    </tr>
                    <tr>
                        <td>Jack Nixon</td>
                        <td>ADMIN</td>
                    </tr>
                    <tr>
                        <td>Giselle Johnson</td>
                        <td>CLIENT</td>
                    </tr>
                </table>
        </div>
    );
};

export default Users;