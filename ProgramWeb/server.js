const express = require("express");
const path = require("path");
const bodyParser = require("body-parser");

const app = express();
const port = process.env.PORT || 3000;

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({limit: '5000mb', extended: true, parameterLimit: 100000000000}));

app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, '/html_class/index12.html'));
});

app.post('/result', (req, res) => {
    res.status(201).json(req.body);
});

app.listen(port, (error) => {
    if (error) {
        console.log(error);
    }
    console.log(`Server started at localhost in port: ${port}`);
});
