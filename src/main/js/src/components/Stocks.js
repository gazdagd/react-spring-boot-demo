import React, {useState, useEffect} from 'react';
import axios from 'axios';

import Stock from './Stock';

const Stocks = (props) => {

    const [stocks, setStocks] = useState([]);

    useEffect(() => {
        axios.get('/api/stocks')
        .then(response => {
            console.log(response.data._embedded);
            setStocks(response.data._embedded.stocks);
        })
    }, []);

    return (
        <div>
            {stocks.map(stock => 
                <Stock key={stock.symbol} stock={stock} />
            )}
        </div>
    );
}

export default Stocks;