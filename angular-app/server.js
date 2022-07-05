const exp = require('constants');
const express = require('express');
const path  = require('path');
const app = express();
app.use(express.static('./dist/users-ui'))
app.get('/*', (req, res)=> 
res.sendFile('index.html', {root: 'dist/users-ui'}),
)

app.listen(process.env.PORT || 8080);