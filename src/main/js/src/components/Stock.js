import React from 'react';

import classes from './Stock.module.css'

const Stock = (props) => {
    return (
        <div className={classes.Stock}>
            <h3>{props.stock.symbol}</h3>
            <p>{props.stock.name}</p>
        </div>
    );
}

export default Stock;