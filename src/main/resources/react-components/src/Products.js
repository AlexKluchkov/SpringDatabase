import React, { useEffect, useState } from 'react';
import axios from 'axios';

const Products = () => {
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
                        <th>name of product</th>
                        <th>quantity of products</th>
                    </tr>
                    <tr>
                        <td>book</td>
                        <td>3</td>
                    </tr>
                    <tr>
                        <td>pen</td>
                        <td>7</td>
                    </tr>
                </table>
        </div>
    );
};

export default Products;
