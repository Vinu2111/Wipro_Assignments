import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatCardModule } from '@angular/material/card';
import { MatSelectModule } from '@angular/material/select';
import { MatIconModule } from '@angular/material/icon';
import { FormsModule } from '@angular/forms'; // Add this import

interface Movie {
  title: string;
  poster: string;
  genre: string;
  rating: number;
  description: string;
}

@Component({
  selector: 'app-movie-list',
  standalone: true,
  imports: [
    CommonModule, 
    MatCardModule, 
    MatSelectModule, 
    MatIconModule,
    FormsModule // Add this to imports array
  ],
  templateUrl: './movie-list.component.html',
  styleUrls: ['./movie-list.component.css']
})
export class MovieListComponent {
  // ... rest of your component code remains the same ...
  genres: string[] = ['All', 'Action', 'Comedy', 'Drama', 'Sci-Fi', 'Horror'];
  selectedGenre: string = 'All';
  
  movies: Movie[] = [
    {
      title: 'The Dark Knight',
      poster: 'https://via.placeholder.com/300x400/cccccc/969696?text=The+Dark+Knight',
      genre: 'Action',
      rating: 5,
      description: 'When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.'
    },
    {
      title: 'Inception',
      poster: 'https://via.placeholder.com/300x400/cccccc/969696?text=Inception',
      genre: 'Sci-Fi',
      rating: 5,
      description: 'A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.'
    },
    {
      title: 'The Shawshank Redemption',
      poster: 'https://via.placeholder.com/300x400/cccccc/969696?text=Shawshank',
      genre: 'Drama',
      rating: 5,
      description: 'Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.'
    },
    {
      title: 'Pulp Fiction',
      poster: 'https://via.placeholder.com/300x400/cccccc/969696?text=Pulp+Fiction',
      genre: 'Drama',
      rating: 4,
      description: 'The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.'
    },
    {
      title: 'The Hangover',
      poster: 'https://via.placeholder.com/300x400/cccccc/969696?text=Hangover',
      genre: 'Comedy',
      rating: 3,
      description: 'Three buddies wake up from a bachelor party in Las Vegas, with no memory of the previous night and the bachelor missing.'
    },
    {
      title: 'The Conjuring',
      poster: 'https://via.placeholder.com/300x400/cccccc/969696?text=Conjuring',
      genre: 'Horror',
      rating: 4,
      description: 'Paranormal investigators Ed and Lorraine Warren work to help a family terrorized by a dark presence in their farmhouse.'
    }
  ];

  getStars(rating: number): string[] {
    return Array.from({ length: 5 }, (_, i) =>
      i < rating ? 'star' : 'star_border'
    );
  }

  getFilteredMovies() {
    if (this.selectedGenre === 'All') {
      return this.movies;
    }
    return this.movies.filter(movie => movie.genre === this.selectedGenre);
  }

  getAverageRating() {
    const total = this.movies.reduce((sum, movie) => sum + movie.rating, 0);
    return (total / this.movies.length).toFixed(1);
  }
}