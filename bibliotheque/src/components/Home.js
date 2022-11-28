import * as React from 'react';
import axios from "axios";
import { GetBooks } from '../services/BookServices';
import { Box } from '@mui/material';
import Card from '@mui/material/Card';
import CardActions from '@mui/material/CardActions';
import CardContent from '@mui/material/CardContent';
import Button from '@mui/material/Button';
import Typography from '@mui/material/Typography';

export default function Home(){
    const [Books, setBooks] = React.useState([{"isbn":"2749906253","titre":"Les Chevaliers d'Emeraude : Le feu dans le ciel","editeur_id":"1","date_publication":"2007-03-08","description_id":1,"langue":"français"}]);

React.useEffect(() => {
    GetBooks()
        .then((response) => {setBooks(response.data)})
        .catch(err => alert(err))
}, []);


    return (
        Books.map((book) =>
            <Box>
                <Card sx={{ minWidth: 275 }}>
                    <CardContent>
                        <Typography variant="h5" component="div">
                        <div>{book.titre}</div>
                        </Typography>
                        <Typography sx={{ mb: 1.5 }} color="text.secondary">
                            <div>Genre : {book.genre}</div>
                            <div>Auteur : {book.auteur}</div>
                            <div>Date de publication : {book.date_publication}</div>
                            <div>Editeur : {book.editeur}</div>
                            <div>ISBN : {book.isbn}</div>
                            <div>Présentation : {book.presentation}</div>
                            <div>Disponibilités : {book.bibliotheque}</div>
                        </Typography>
                    </CardContent>
                    <CardActions>
                        <Button size="small">Learn More</Button>
                    </CardActions>
                </Card>
            
                

            </Box>    
        )   
    )
}
