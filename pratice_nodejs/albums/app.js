var express = require('express');
var app = express();
var bodyParser = require('body-parser');
var mongoose = require('mongoose');
mongoose.connect('mongodb://localhost:27017/test', {useNewUrlParser: true, useUnifiedTopology: true});


var userSchema = mongoose.Schema({
  name: String,
})
var User = mongoose.model('User', userSchema)

var albumSchema = mongoose.Schema({
  performer: String,
  title: String,
  cost: Number,
})
var Album = mongoose.model('Album', albumSchema);

var puchaseSchema = mongoose.Schema({
  user: { type: mongoose.Schema.Types.ObjectId, ref: 'User' },
  album: { type: mongoose.Schema.Types.ObjectId, ref: 'Album' }
})
var Purchase = mongoose.model('Purchase', puchaseSchema);


app.use(bodyParser.json());
app.listen(3000);

// TODO: GET /albums
app.get('/albums', (req, res, next) => {
    Album.find({}).then(albums => {
        res.status(200).json({ data: albums});
    }).catch(next);
});

// TODO: GET /albums/:id
app.get('/albums/:id', (req, res, next) => {
  const { id } = req.params;
  Album.findById(id).then(album => {
    res.status(200).json({ data: album || {}});
  }).catch(next);
});

// TODO: POST /albums
app.post('/albums', (req, res, next) => {
  const album = new Album(req.body);
  album.save().then(album => {
    res.status(200).json({data: album});
  }).catch(next);
});

// TODO: PUT /albums/:id
app.put('/albums/:id', (req, res, next) => {
  const { id } = req.params;
  Album.findByIdAndUpdate(id, req.body, { new: true}).then(album => {
    res.status(200).json({data: album });
  }).catch(next);
});

// TODO: DELETE /albums/:idpost
app.delete('/albums/:id', (req, res, next) => {
  const { id } = req.params;
  Album.findByIdAndRemove(id).then(() => {
    res.status(204).send();
  }).catch(next);
});
// TODO: POST /purchases
app.post('/purchases', (req, res, next) => {
  const { user, album } = req.body;
  Promise.all([
    Album.findById(album),
    User.findById(user)
  ]).then( data => {
    const [alb, usr] = data;
    return Purchase.create({user: usr, album: alb});
  }).then(purchase => {
      res.status(200).json({data: purchase});
  }).catch(next);
});

// TODO: POST /purchases
app.get('/purchases', (req, res, next) => {
    Purchase.find({}).then(purchase => {
        res.status(200).json({data: purchase});
    }).catch(next);
  });
app.use(function (err, req, res, next) {
    if (req.xhr) {
        res.status(500).send({ error: 'Unknown error.' })
    } else {
        res.status(500).json({ error: err.message });
    }
})